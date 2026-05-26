#!/usr/bin/env bash
set -euo pipefail
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$ROOT"
echo "=== Repository line count ==="
find . -type f ! -path './.git/*' -exec wc -l {} + 2>/dev/null | tail -1
echo ""
echo "=== By category ==="
for dir in \
  platform/operations/itsm \
  platform/operations/ipc \
  docs/architecture/generated \
  docs/operations/runbooks/generated \
  platform/operations/changemgmt \
  platform/operations/audit \
  pnb/legacy/cobol/programs/generated \
  acb/legacy/pli/programs/generated \
  db/generated \
  platform/shared/generated; do
  if [ -d "$dir" ]; then
    lines=$(find "$dir" -type f -exec wc -l {} + 2>/dev/null | tail -1 | awk '{print $1}')
    files=$(find "$dir" -type f | wc -l)
    echo "$dir: $lines lines ($files files)"
  fi
done
