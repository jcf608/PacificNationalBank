#!/usr/bin/env bash
set -euo pipefail

echo "[PNB] Running targeted validation suites"
python3 -m pytest -q generators/tests tests/integration cobol/tests pli/tests
make test-java

echo "[PNB] Targeted tests passed"
