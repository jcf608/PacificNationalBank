#!/usr/bin/env bash
set -euo pipefail

echo "[PNB] Running enterprise build orchestration"
make cobol
make pli
make java

echo "[PNB] Build complete"
