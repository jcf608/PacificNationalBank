# Pacific National Bank + Atlantic Commerce Bank

## Enterprise hybrid core banking suite

This repository models a **post-merger universal bank** operating two legacy cores in parallel, each with an **Azure** modernisation track, unified by a **MuleSoft merger reconciliation** layer.

| Entity | Role | Legacy | Cloud (Azure) |
|--------|------|--------|----------------|
| **PNB** (Pacific National Bank) | Acquirer core | COBOL · IMS/TM · IMS/DB · DB2 | Spring Boot · Azure SQL · Service Bus |
| **ACB** (Atlantic Commerce Bank) | Acquired core | PL/I · IMS/TM · IMS/DB · DB2 | Spring Boot · Azure SQL · Service Bus |

**Layout principle:** by **bank**, then **layer** (`legacy` / `azure`).

## Repository map

```
├── pnb/
│   ├── legacy/cobol/          # COBOL online + batch, copybooks, JCL
│   ├── legacy/ims/            # DBD/PSB/MFS for PNB
│   └── azure/                 # Spring services, Bicep, pipelines
├── acb/
│   ├── legacy/pli/            # PL/I mirror of PNB domains
│   ├── legacy/ims/
│   └── azure/
├── platform/
│   ├── mulesoft/              # Merger reconciliation (PNB ↔ ACB)
│   └── shared/                # Domain catalog, event schemas, libraries
├── db/pnb/ · db/acb/          # DB2 DDL, migrations, IMS defs
├── docs/                      # Architecture & operations
├── generators/                # Bulk code generators (optional expansion)
├── scripts/                   # Bootstrap & tooling
└── tests/integration/         # Cross-bank & MuleSoft contract tests
```

## Banking domain coverage (full mirror)

All domains listed in `platform/shared/domains/DOMAIN_CATALOG.md` are implemented in:

- `pnb/legacy/cobol/programs/online/PNB*.cbl`
- `acb/legacy/pli/programs/online/ACB*.pli`
- Azure service modules under each bank’s `azure/services/`
- DB2 views/migrations under `db/pnb` and `db/acb`

Domains include: deposits, lending, cards, ACH, wires, treasury, FX, trade finance, trust, escrow, compliance, risk, fraud, and more.

## Merger reconciliation (MuleSoft)

MuleSoft provides **customer dedup**, **account mapping**, and **dual-ledger reads** — not general channel APIs.

- API contract: `platform/mulesoft/apis/merger-reconciliation/openapi.yaml`
- Runtime app: `platform/mulesoft/apps/acb-pnb-reconciliation/`

See `docs/architecture/merger-overview.md`.

## Quick start

```bash
# Bootstrap directory layout (safe to re-run)
make bootstrap

# Build legacy + Azure modules
make all

# Unit & contract tests
make test

# Full stack (DB2, Azure SQL, deposits services, MuleSoft runtime)
docker compose up --build
```

### Key local ports

| Service | Port |
|---------|------|
| PNB DB2 | 50000 |
| ACB DB2 | 50001 |
| PNB Azure SQL | 1433 |
| ACB Azure SQL | 1434 |
| PNB deposits API | 8081 |
| ACB deposits API | 8181 |
| MuleSoft reconciliation | 8090 |
| IMS sim (PNB / ACB) | 9998 / 9999 |

## Code generators

Bulk expansion (optional):

```bash
python3 generators/generate_batch.py 1
python3 generators/generate_supplemental.py
```

Configure output paths in generator scripts before running at scale.

## Licence

Proprietary — PNB + ACB combined entity, 2024–2026.
