# Code generators

Bulk generators for expanding COBOL (PNB), PL/I (ACB), IMS, Java/Azure, and DB2 artefacts.

```bash
# From repository root
python3 generators/generate_batch.py 1
python3 generators/generate_supplemental.py
```

**Output paths:** Update `ROOT` in each script to target:

- `pnb/legacy/cobol/`
- `acb/legacy/pli/`
- `pnb/azure/services/` / `acb/azure/services/`
- `db/pnb/db2/` / `db/acb/db2/`

Run `make bootstrap` first to ensure the enterprise directory layout exists.
