#!/usr/bin/env python3
"""
Bootstrap Pacific National Bank + Atlantic Commerce Bank enterprise layout.
Layout: by bank then layer (pnb/, acb/, platform/, db/, docs/).
"""
from __future__ import annotations

import shutil
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]

DOMAINS = [
    ("account", "Account master & balances"),
    ("customer", "Party & KYC profile"),
    ("transaction", "Posting & history"),
    ("general_ledger", "GL & sub-ledger"),
    ("deposit", "Demand & time deposits"),
    ("loan", "Commercial & retail lending"),
    ("mortgage", "Residential mortgage"),
    ("heloc", "Home equity line"),
    ("creditline", "Revolving credit"),
    ("card", "Debit & credit cards"),
    ("ach", "ACH origination & receipt"),
    ("wire", "Fedwire & SWIFT"),
    ("branch", "Branch & teller ops"),
    ("product", "Product catalog"),
    ("rate", "Rate management"),
    ("fee", "Fee assessment"),
    ("hold", "Account holds"),
    ("stop", "Stop payment"),
    ("audit", "Audit trail"),
    ("alert", "Customer alerts"),
    ("compliance", "Regulatory compliance"),
    ("risk", "Credit & operational risk"),
    ("fraud", "Fraud detection"),
    ("collections", "Delinquency collections"),
    ("escrow", "Escrow administration"),
    ("trust", "Trust & fiduciary"),
    ("cashmanagement", "Cash management"),
    ("treasury", "Treasury & liquidity"),
    ("foreignexchange", "FX trading & settlement"),
    ("tradefinance", "Trade finance"),
    ("letterofcredit", "Letters of credit"),
]


def ensure_dirs() -> None:
    banks = ("pnb", "acb")
    for bank in banks:
        for layer in ("legacy", "azure"):
            base = ROOT / bank / layer
            if layer == "legacy":
                lang = "cobol" if bank == "pnb" else "pli"
                for sub in (
                    f"{lang}/copybooks",
                    f"{lang}/programs/batch",
                    f"{lang}/programs/online",
                    "ims/dbdgen",
                    "ims/psbgen",
                    "ims/mfs",
                    "ims/transactions",
                    "jcl",
                ):
                    (base / sub).mkdir(parents=True, exist_ok=True)
            else:
                for sub in (
                    "services",
                    "functions",
                    "infrastructure/bicep",
                    "infrastructure/parameters",
                    "pipelines",
                ):
                    (base / sub).mkdir(parents=True, exist_ok=True)

    platform = ROOT / "platform"
    for sub in (
        "mulesoft/apis/merger-reconciliation",
        "mulesoft/apps/acb-pnb-reconciliation/src/main/mule",
        "mulesoft/apps/acb-pnb-reconciliation/src/main/resources",
        "mulesoft/deployment",
        "shared/domains",
        "shared/events/schemas",
        "shared/libraries/java",
        "shared/observability",
    ):
        (platform / sub).mkdir(parents=True, exist_ok=True)

    for sub in (
        "db/pnb/db2/migrations",
        "db/pnb/ims",
        "db/acb/db2/migrations",
        "db/acb/ims",
        "docs/architecture",
        "docs/operations",
        "docs/domains",
        "generators",
        "tests/integration/pnb",
        "tests/integration/acb",
        "tests/integration/merger",
        ".github/workflows",
    ):
        (ROOT / sub).mkdir(parents=True, exist_ok=True)


def migrate_existing() -> None:
    cobol_src = ROOT / "cobol"
    cobol_dst = ROOT / "pnb" / "legacy" / "cobol"
    if cobol_src.exists() and cobol_src != cobol_dst:
        if cobol_dst.exists():
            shutil.rmtree(cobol_dst)
        shutil.move(str(cobol_src), str(cobol_dst))

    db_src = ROOT / "db" / "db2"
    db_pnb = ROOT / "db" / "pnb" / "db2"
    if db_src.exists():
        db_pnb.mkdir(parents=True, exist_ok=True)
        for f in db_src.glob("*.sql"):
            shutil.move(str(f), str(db_pnb / f.name))
        if db_src.exists() and not any(db_src.iterdir()):
            db_src.rmdir()

    for gen in ("generate_batch.py", "generate_supplemental.py"):
        src = ROOT / gen
        if src.exists():
            dst = ROOT / "generators" / gen
            if not dst.exists():
                shutil.move(str(src), str(dst))


def write_domain_catalog() -> None:
    lines = ["# Canonical banking domains (post-merger)", ""]
    lines.append("| Domain | PNB legacy | ACB legacy | Azure (both) | MuleSoft reconcile |")
    lines.append("|--------|------------|------------|--------------|-------------------|")
    for slug, desc in DOMAINS:
        pnb_prog = f"PNB{slug[:4].upper()}"
        acb_prog = f"ACB{slug[:4].upper()}"
        lines.append(
            f"| `{slug}` | COBOL `{pnb_prog}` | PL/I `{acb_prog}` | "
            f"`{slug}-service` | `{slug}-mapping` |"
        )
        lines.append(f"| | _{desc}_ | | | |")
    path = ROOT / "platform" / "shared" / "domains" / "DOMAIN_CATALOG.md"
    path.write_text("\n".join(lines) + "\n", encoding="utf-8")


def gen_pnb_cobol_online(slug: str, desc: str) -> str:
    prog = f"PNB{slug[:6].upper().replace('_', '')[:6]}"
    return f"""      ******************************************************************
      * {prog}.cbl — {desc}
      * Pacific National Bank (PNB) — IMS/TM online program
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. {prog}.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
           COPY CPYACCT.
           COPY CPYCUST.
           COPY CPYTXN.
       01  WS-COMMAREA.
           05  WS-CA-FUNCTION           PIC X(04).
           05  WS-CA-ACCT-NUM             PIC X(16).
           05  WS-CA-AMOUNT               PIC S9(13)V99 COMP-3.
           05  WS-CA-RETURN-CODE          PIC X(02).
           05  WS-CA-MESSAGE              PIC X(60).
       LINKAGE SECTION.
       01  DFHCOMMAREA                  PIC X(512).
       PROCEDURE DIVISION.
           MOVE DFHCOMMAREA TO WS-COMMAREA
           EVALUATE WS-CA-FUNCTION
               WHEN 'INQ '
                   PERFORM 1000-INQUIRE
               WHEN 'POST'
                   PERFORM 2000-POST
               WHEN OTHER
                   MOVE '96' TO WS-CA-RETURN-CODE
                   MOVE 'INVALID FUNCTION' TO WS-CA-MESSAGE
           END-EVALUATE
           MOVE WS-COMMAREA TO DFHCOMMAREA
           EXEC CICS RETURN END-EXEC.
       1000-INQUIRE.
           MOVE '00' TO WS-CA-RETURN-CODE
           MOVE 'PNB {slug} OK' TO WS-CA-MESSAGE.
       2000-POST.
           MOVE '00' TO WS-CA-RETURN-CODE
           MOVE 'POSTED' TO WS-CA-MESSAGE.
"""


def gen_acb_pli_online(slug: str, desc: str) -> str:
    prog = f"ACB{slug[:6].upper().replace('_', '')[:6]}"
    return f"""/* **************************************************************** */
/* {prog}.pli — {desc}                                  */
/* Atlantic Commerce Bank (ACB) — IMS/TM online program             */
/* **************************************************************** */
{prog}: PROC OPTIONS(MAIN) REORDER;
  DCL ca_function    CHAR(4);
  DCL ca_acct_num    CHAR(16);
  DCL ca_amount      FIXED DEC(15,2);
  DCL ca_return      CHAR(2);
  DCL ca_message     CHAR(60);

  ca_function = 'INQ ';
  SELECT (ca_function);
    WHEN ('INQ ') CALL inquire;
    WHEN ('POST') CALL post_txn;
    OTHER DO;
      ca_return = '96';
      ca_message = 'INVALID FUNCTION';
    END;
  END;

inquire: PROC;
  ca_return = '00';
  ca_message = 'ACB {slug} OK';
END inquire;

post_txn: PROC;
  ca_return = '00';
  ca_message = 'POSTED';
END post_txn;

END {prog};
"""


def write_legacy_programs() -> None:
    for slug, desc in DOMAINS:
        pnb_path = (
            ROOT
            / "pnb"
            / "legacy"
            / "cobol"
            / "programs"
            / "online"
            / f"PNB{slug[:6].upper().replace('_', '')[:6]}.cbl"
        )
        pnb_path.parent.mkdir(parents=True, exist_ok=True)
        pnb_path.write_text(gen_pnb_cobol_online(slug, desc), encoding="utf-8")

        acb_path = (
            ROOT
            / "acb"
            / "legacy"
            / "pli"
            / "programs"
            / "online"
            / f"ACB{slug[:6].upper().replace('_', '')[:6]}.pli"
        )
        acb_path.parent.mkdir(parents=True, exist_ok=True)
        acb_path.write_text(gen_acb_pli_online(slug, desc), encoding="utf-8")


def mirror_db_to_acb() -> None:
    pnb_db = ROOT / "db" / "pnb" / "db2"
    acb_db = ROOT / "db" / "acb" / "db2"
    acb_db.mkdir(parents=True, exist_ok=True)
    if not pnb_db.exists():
        return
    for f in pnb_db.glob("V_*.sql"):
        text = f.read_text(encoding="utf-8", errors="replace")
        text = text.replace("PNB", "ACB").replace("pnb_", "acb_")
        (acb_db / f.name.replace("V_", "V_ACB_")).write_text(text, encoding="utf-8")


def main() -> None:
    ensure_dirs()
    migrate_existing()
    write_domain_catalog()
    write_legacy_programs()
    mirror_db_to_acb()
    print("Enterprise suite bootstrap complete.")


if __name__ == "__main__":
    main()
