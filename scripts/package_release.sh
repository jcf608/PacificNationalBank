#!/usr/bin/env bash
set -euo pipefail

VERSION="${1:-0.1.0-synthetic}"
ARTIFACT_DIR="dist/${VERSION}"

mkdir -p "${ARTIFACT_DIR}"
cp -r docs "${ARTIFACT_DIR}/"
cp -r db "${ARTIFACT_DIR}/"
cp -r java/pnb-websphere "${ARTIFACT_DIR}/websphere"

echo "Packaged synthetic release assets at ${ARTIFACT_DIR}"
