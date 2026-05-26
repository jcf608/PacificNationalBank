#!/usr/bin/env python3
"""
Generate ~3M lines of enterprise banking artefacts for PNB + ACB suite.

Categories: ITSM tickets, IPC integration tickets, architecture documentation,
runbooks, legacy/cloud code expansions, SQL, audit logs, change records.

Usage:
  python3 generators/generate_enterprise_corpus.py --target 3000000
  python3 generators/generate_enterprise_corpus.py --target 3000000 --commit-every 400000
"""
from __future__ import annotations

import argparse
import json
import os
import random
import subprocess
import sys
import time
from dataclasses import dataclass
from datetime import datetime, timedelta
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]

DOMAINS = [
    "account", "customer", "transaction", "deposit", "loan", "mortgage",
    "card", "ach", "wire", "treasury", "foreignexchange", "trust", "escrow",
    "compliance", "risk", "fraud", "branch", "cashmanagement", "tradefinance",
]

ITSM_TYPES = ["INC", "CHG", "PRB", "REQ", "CTASK"]
IPC_TYPES = ["IPC-INT", "IPC-MAP", "IPC-SYNC", "IPC-ERR", "IPC-REP"]
BANKS = ["PNB", "ACB", "MERGER"]


@dataclass
class Category:
    name: str
    weight: float
    base_dir: str
    extension: str


CATEGORIES = [
    Category("itsm", 0.17, "platform/operations/itsm/tickets", ".json"),
    Category("ipc", 0.11, "platform/operations/ipc/tickets", ".json"),
    Category("architecture", 0.14, "docs/architecture/generated", ".md"),
    Category("runbooks", 0.08, "docs/operations/runbooks/generated", ".md"),
    Category("changemgmt", 0.06, "platform/operations/changemgmt/records", ".json"),
    Category("audit", 0.05, "platform/operations/audit/events", ".jsonl"),
    Category("cobol", 0.18, "pnb/legacy/cobol/programs/generated/batch", ".cbl"),
    Category("pli", 0.14, "acb/legacy/pli/programs/generated/batch", ".pli"),
    Category("sql", 0.04, "db/generated/views", ".sql"),
    Category("java", 0.03, "platform/shared/generated/java/sources", ".java"),
]


def count_repo_lines() -> int:
    total = 0
    for path in ROOT.rglob("*"):
        if path.is_file() and ".git" not in path.parts:
            try:
                with path.open("rb") as f:
                    total += sum(1 for _ in f)
            except OSError:
                pass
    return total


def write_lines(path: Path, lines: list[str]) -> int:
    path.parent.mkdir(parents=True, exist_ok=True)
    with path.open("w", encoding="utf-8") as f:
        f.write("\n".join(lines))
        f.write("\n")
    return len(lines) + 1


def pick(seq, rng: random.Random):
    return seq[rng.randint(0, len(seq) - 1)]


def gen_itsm_ticket(ticket_num: int, rng: random.Random) -> list[str]:
    ttype = pick(ITSM_TYPES, rng)
    bank = pick(BANKS, rng)
    domain = pick(DOMAINS, rng)
    opened = datetime(2024, 1, 1) + timedelta(days=rng.randint(0, 800))
    lines = [
        "{",
        f'  "ticketNumber": "{ttype}{ticket_num:09d}",',
        f'  "type": "{ttype}",',
        f'  "bank": "{bank}",',
        f'  "domain": "{domain}",',
        f'  "shortDescription": "{bank} {domain} — production support ticket",',
        f'  "priority": "{rng.randint(1, 4)}",',
        f'  "state": "{pick(["NEW", "IN_PROGRESS", "ON_HOLD", "RESOLVED", "CLOSED"], rng)}",',
        f'  "assignmentGroup": "{bank}-CORE-{domain.upper()}",',
        f'  "openedAt": "{opened.isoformat()}Z",',
        '  "workNotes": [',
    ]
    for i in range(280):
        note_time = opened + timedelta(hours=i * 3)
        author = pick(["svc_cobol_ops", "svc_pli_ops", "svc_azure_ops", "merger_mule", "l2_core"], rng)
        body = (
            f"Investigation step {i+1}: validated {domain} path on {bank}. "
            f"Correlation to merger reconciliation queue MERGER-{ticket_num % 10000:04d}. "
            f"Attached log excerpt and DB2 plan hash 0x{rng.randint(0, 0xFFFFFF):06x}."
        )
        lines.append("    {")
        lines.append(f'      "at": "{note_time.isoformat()}Z",')
        lines.append(f'      "author": "{author}",')
        lines.append(f'      "note": {json.dumps(body)}')
        lines.append("    },")
    lines[-1] = lines[-1].rstrip(",")
    lines.append("  ],")
    lines.append('  "relatedConfigurationItems": [')
    for j in range(8):
        lines.append(
            f'    {{"ci": "{bank}-{domain}-CI-{j:03d}", "class": "cmdb_ci_appl"}}' + ("," if j < 7 else "")
        )
    lines.append("  ],")
    lines.append('  "approvals": [')
    for j in range(5):
        lines.append(
            f'    {{"role": "CAB", "approver": "approver{j}@pnb-acb.internal", "status": "approved"}}'
            + ("," if j < 4 else "")
        )
    lines.append("  ]")
    lines.append("}")
    return lines


def gen_ipc_ticket(ticket_num: int, rng: random.Random) -> list[str]:
    itype = pick(IPC_TYPES, rng)
    lines = [
        "{",
        f'  "ipcTicketId": "{itype}-{ticket_num:010d}",',
        f'  "sourceBank": "{pick(["PNB", "ACB"], rng)}",',
        f'  "targetBank": "{pick(["PNB", "ACB"], rng)}",',
        f'  "integrationFlow": "merger-reconciliation/{pick(DOMAINS, rng)}",',
        f'  "muleApplication": "acb-pnb-reconciliation",',
        f'  "correlationId": "CORR-{ticket_num:012d}",',
        '  "payloadTraces": [',
    ]
    for i in range(220):
        lines.append("    {")
        lines.append(f'      "sequence": {i},')
        lines.append(f'      "hop": "{pick(["pnb-azure", "mulesoft", "acb-legacy", "acb-azure"], rng)}",')
        lines.append(f'      "latencyMs": {rng.randint(5, 2500)},')
        lines.append(
            f'      "requestSnippet": "POST /v1/accounts/mapping fragment {i} byteLen={rng.randint(200, 9000)}"'
        )
        lines.append("    },")
    lines[-1] = lines[-1].rstrip(",")
    lines.append("  ],")
    lines.append('  "reconciliationOutcome": {')
    lines.append(f'    "withinTolerance": {"true" if rng.random() > 0.15 else "false"},')
    lines.append(f'    "variance": {rng.uniform(-5000, 5000):.4f}')
    lines.append("  }")
    lines.append("}")
    return lines


def gen_architecture_doc(doc_num: int, rng: random.Random) -> list[str]:
    domain = pick(DOMAINS, rng)
    bank = pick(BANKS, rng)
    lines = [
        f"# Architecture specification — {bank} / {domain} (document {doc_num})",
        "",
        "## Context",
        f"Post-merger hybrid core documenting {domain} across legacy and Azure tiers.",
        "",
        "## Container view",
        "```mermaid",
        "flowchart LR",
        f"  subgraph {bank}",
        "    L[Legacy IMS/TM]",
        "    A[Azure Services]",
        "  end",
        "  M[MuleSoft Reconciliation]",
        "  L --> M",
        "  A --> M",
        "```",
        "",
        "## Component responsibilities",
    ]
    for i in range(650):
        lines.append(
            f"- Component `{domain}-comp-{i:04d}`: handles slice {i} of {domain} "
            f"posting validation, idempotency keys, and compensating transactions on {bank}."
        )
    lines.append("")
    lines.append("## Data classification")
    lines.append("| Field | Classification | Retention |")
    lines.append("|-------|----------------|-----------|")
    for i in range(40):
        lines.append(f"| field_{i:03d} | confidential | 7 years |")
    lines.append("")
    lines.append("## Non-functional requirements")
    for i in range(60):
        lines.append(
            f"1. Throughput target TPS-{i:04d}: {rng.randint(100, 8000)} sustained for {domain}."
        )
    return lines


def gen_runbook(rb_num: int, rng: random.Random) -> list[str]:
    domain = pick(DOMAINS, rng)
    lines = [
        f"# Runbook RB-{rb_num:07d}: {domain} failover",
        "",
        "## Prerequisites",
        "- CAB approval recorded in ITSM",
        "- MuleSoft reconciliation queue drained",
        "",
        "## Steps",
    ]
    for step in range(400):
        lines.append(f"{step + 1}. Execute validation script `scripts/ops/{domain}_step_{step:03d}.sh`")
        lines.append(f"   - Expected: return code 0 within {rng.randint(1, 120)} seconds")
        lines.append(f"   - Rollback: invoke compensating handler RB-{rb_num:07d}-R{step:03d}")
    return lines


def gen_cobol_program(prog_num: int, rng: random.Random) -> list[str]:
    name = f"PNBGEN{prog_num:06d}"
    domain = pick(DOMAINS, rng)
    lines = [
        f"      ******************************************************************",
        f"      * {name}.cbl — Generated batch for {domain}",
        f"      * Pacific National Bank",
        f"      ******************************************************************",
        f"       IDENTIFICATION DIVISION.",
        f"       PROGRAM-ID. {name}.",
        f"       DATA DIVISION.",
        f"       WORKING-STORAGE SECTION.",
        f"       01  WS-DOMAIN               PIC X(20) VALUE '{domain.upper()}'.",
    ]
    for i in range(420):
        lines.append(f"       01  WS-VAR-{i:04d}            PIC S9(13)V99 COMP-3.")
    lines.append("       PROCEDURE DIVISION.")
    for para in range(90):
        lines.append(f"       {para:04d}-PROCESS.")
        for j in range(18):
            lines.append(f"           ADD 1 TO WS-VAR-{((para * 3 + j) % 420):04d}")
        lines.append("           CONTINUE.")
    lines.append("       STOP RUN.")
    return lines


def gen_pli_program(prog_num: int, rng: random.Random) -> list[str]:
    name = f"ACBGEN{prog_num:06d}"
    domain = pick(DOMAINS, rng)
    lines = [
        f"/* {name}.pli — Generated ACB batch for {domain} */",
        f"{name}: PROC OPTIONS(MAIN);",
        f"  DCL domain_name CHAR(20) INIT('{domain}');",
    ]
    for i in range(420):
        lines.append(f"  DCL var_{i:04d} FIXED DEC(15,2) INIT(0);")
    for p in range(90):
        lines.append(f"  CALL proc_{p:04d};")
        for j in range(18):
            lines.append(f"  var_{((p * 3 + j) % 420):04d} = var_{((p * 3 + j) % 420):04d} + 1;")
    lines.append("END;")
    return lines


def gen_sql_view(view_num: int, rng: random.Random) -> list[str]:
    domain = pick(DOMAINS, rng)
    lines = [
        f"-- Generated view V_{domain.upper()}_{view_num:05d}",
        f"CREATE OR REPLACE VIEW pnb_core.V_{domain.upper()}_{view_num:05d} AS",
        "SELECT",
    ]
    for i in range(180):
        comma = "," if i < 179 else ""
        lines.append(f"  col_{i:03d} AS derived_col_{i:03d}{comma}")
    lines.append(f"FROM pnb_core.{domain}_fact_{view_num % 100:03d}")
    lines.append(f"WHERE batch_id = {view_num};")
    return lines


def gen_java_class(class_num: int, rng: random.Random) -> list[str]:
    domain = pick(DOMAINS, rng)
    lines = [
        f"package com.pnbacb.generated.{domain};",
        f"public final class Generated{class_num:06d} {{",
    ]
    for i in range(200):
        lines.append(f"  private final String field{i:03d} = \"{domain}-{class_num}-{i}\";")
    lines.append("  public void execute() {")
    for i in range(150):
        lines.append(f"    if (field{i % 200:03d}.length() > 0) {{ process{i:04d}(); }}")
    lines.append("  }")
    for i in range(150):
        lines.append(f"  private void process{i:04d}() {{ /* {domain} step {i} */ }}")
    lines.append("}")
    return lines


def gen_changemgmt(record_num: int, rng: random.Random) -> list[str]:
    return gen_itsm_ticket(record_num, rng)  # similar structure


def gen_audit_event(event_num: int, rng: random.Random) -> list[str]:
    lines = []
    for _ in range(200):
        rec = {
            "eventId": f"AUD-{event_num:010d}-{rng.randint(0, 99999):05d}",
            "bank": pick(BANKS, rng),
            "domain": pick(DOMAINS, rng),
            "action": pick(["READ", "WRITE", "POST", "REVERSE"], rng),
            "user": pick(["batch_pnb", "batch_acb", "mule_recon", "teller_01"], rng),
        }
        lines.append(json.dumps(rec))
    return lines


GENERATORS = {
    "itsm": gen_itsm_ticket,
    "ipc": gen_ipc_ticket,
    "architecture": gen_architecture_doc,
    "runbooks": gen_runbook,
    "changemgmt": gen_changemgmt,
    "audit": gen_audit_event,
    "cobol": gen_cobol_program,
    "pli": gen_pli_program,
    "sql": gen_sql_view,
    "java": gen_java_class,
}


def generate_file(cat: Category, file_index: int, rng: random.Random) -> tuple[Path, int]:
    gen = GENERATORS[cat.name]
    lines = gen(file_index, rng)
    path = ROOT / cat.base_dir / f"{cat.name}_{file_index:07d}{cat.extension}"
    return path, write_lines(path, lines)


def git_commit(message: str) -> None:
    subprocess.run(["git", "add", "-A"], cwd=ROOT, check=False)
    subprocess.run(["git", "commit", "-m", message], cwd=ROOT, check=False)


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--target", type=int, default=3_000_000, help="Total repo line target")
    parser.add_argument("--commit-every", type=int, default=500_000, help="Git commit interval (lines)")
    parser.add_argument("--seed", type=int, default=42)
    args = parser.parse_args()

    rng = random.Random(args.seed)
    current = count_repo_lines()
    needed = max(0, args.target - current)
    if needed == 0:
        print(f"Repository already at {current:,} lines (target {args.target:,})")
        return 0

    print(f"Current lines: {current:,}")
    print(f"Generating {needed:,} additional lines toward {args.target:,}")

    lines_since_commit = 0
    total_generated = 0
    file_index = 0
    cat_cycle = 0
    start = time.time()

    while total_generated < needed:
        cat = CATEGORIES[cat_cycle % len(CATEGORIES)]
        cat_cycle += 1
        path, nlines = generate_file(cat, file_index, rng)
        file_index += 1
        total_generated += nlines
        lines_since_commit += nlines

        if lines_since_commit >= args.commit_every:
            git_commit(
                f"Corpus: +{lines_since_commit:,} lines ({cat.name} artefacts, "
                f"total generated {total_generated:,})"
            )
            lines_since_commit = 0
            elapsed = time.time() - start
            rate = total_generated / elapsed if elapsed > 0 else 0
            print(
                f"  committed chunk — {total_generated:,}/{needed:,} "
                f"({rate:,.0f} lines/sec)"
            )

    git_commit(f"Corpus: final +{lines_since_commit:,} lines (enterprise artefacts)")

    final = count_repo_lines()
    print(f"Done. Generated {total_generated:,} lines in {time.time() - start:.1f}s")
    print(f"Repository total: {final:,} lines")
    return 0


if __name__ == "__main__":
    sys.exit(main())
