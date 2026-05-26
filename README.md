# Pacific National Bank — Enterprise Core Banking Platform

> **PL/I · COBOL · IMS/DB · IMS/TM · Java · WebSphere Liberty on Linux**

## Overview

Pacific National Bank (PNB) is a full-stack enterprise core banking system
originally deployed on IBM z/OS mainframes and progressively modernised to run
on Linux with open-source toolchains (GnuCOBOL, PL/I-to-C transpilation,
OpenJDK, WebSphere Liberty containers).

The platform processes **retail and commercial banking** workloads:

| Domain | Technology | Artefacts |
|---|---|---|
| Core ledger & GL | COBOL batch + online | `cobol/programs/` |
| Real-time transaction engine | PL/I + IMS/TM | `pli/programs/online/` |
| Account & customer master | IMS/DB (DL/I) | `ims/dbdgen/`, `ims/psbgen/` |
| Message formats | IMS/TM MFS | `ims/mfs/` |
| Digital channels (ATM, web, mobile) | Java / JAX-RS | `java/pnb-channel-services/` |
| Core banking services | Java / Spring | `java/pnb-core-banking/` |
| Integration (payments, credit) | Java / JMS / MQ | `java/pnb-integration/` |
| Runtime | WebSphere Liberty | `java/pnb-websphere/` |
| Database | DB2 + IMS/DB | `db/` |

## Quick Start

```bash
# Prerequisites: Docker, Make, Python 3.10+, JDK 17+, GnuCOBOL 3.x
make all            # compile COBOL, PL/I, build Java WARs, Docker images
make test           # run unit + integration tests
make generate       # run code generators to expand templates

# Or use the containerized build:
docker compose up --build
```

## Repository Layout

```
PacificNationalBank/
├── .github/workflows/       # GitHub Actions CI/CD
├── cobol/                   # COBOL source (batch + online programs)
│   ├── copybooks/           # Shared data structures (COPY members)
│   ├── programs/batch/      # End-of-day, interest calc, statements
│   ├── programs/online/     # Real-time teller transactions
│   ├── jcl/                 # Job Control Language (batch scheduling)
│   └── tests/               # COBOL unit tests
├── pli/                     # PL/I source
│   ├── includes/            # %INCLUDE members
│   ├── programs/batch/      # Risk analytics, regulatory reports
│   ├── programs/online/     # High-perf transaction processing
│   └── tests/               # PL/I unit tests
├── ims/                     # IMS subsystem definitions
│   ├── dbdgen/              # Database Description generation
│   ├── psbgen/              # Program Specification Blocks
│   ├── mfs/                 # Message Format Services
│   └── transactions/        # IMS/TM transaction routing
├── java/                    # Java services (Maven multi-module)
│   ├── pnb-core-banking/    # Accounts, customers, loans, deposits
│   ├── pnb-channel-services/# ATM, online, mobile, branch APIs
│   ├── pnb-integration/     # Payment gateways, credit bureau, MQ
│   └── pnb-websphere/       # Liberty server config + Docker
├── db/                      # Database definitions
│   ├── db2/                 # DB2 DDL, stored procedures
│   ├── ims/                 # IMS segment definitions
│   └── migrations/          # Flyway migration scripts
├── generators/              # Code generation framework
│   ├── models/              # YAML data models driving generation
│   └── templates/           # Jinja2 templates (COBOL, PL/I, Java)
├── scripts/                 # Build & deployment automation
├── tests/                   # Cross-cutting integration tests
└── docs/                    # Architecture & operations docs
```

## Code Generators

The `generators/` directory contains Python scripts that expand YAML data
models into templated source across all three tiers:

```bash
python3 generators/generate_all.py              # generate everything
python3 generators/generate_cobol.py --entities  # COBOL CRUD programs
python3 generators/generate_pli.py --entities    # PL/I service programs
python3 generators/generate_java.py --entities   # Java entity + DAO + REST
```

Each generator reads `generators/models/banking_schema.yaml` and produces
idiomatic source code with proper error handling, logging, and test stubs.

## CI/CD Pipeline

The GitHub Actions workflow (`.github/workflows/build.yml`) runs on every push:

1. **COBOL compile** — GnuCOBOL 3.x on Ubuntu
2. **PL/I transpile** — iron-spring PL/I or pli2c
3. **Java build** — Maven 3.9 + JDK 17
4. **Docker image** — WebSphere Liberty with all WARs
5. **Integration tests** — against containerized DB2 + IMS
6. **Push to registry** — GHCR or Azure ACR

## Licence

Proprietary — Pacific National Bank, 2024–2026.
