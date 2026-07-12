#!/usr/bin/env bash
set -euo pipefail

python3 -m compileall generators tests cobol/tests pli/tests >/dev/null

echo "Python syntax lint checks passed"
