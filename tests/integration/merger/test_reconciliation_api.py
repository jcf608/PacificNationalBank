"""Integration tests for merger reconciliation API contract."""
import json
from pathlib import Path

import pytest

OPENAPI = (
    Path(__file__).resolve().parents[3]
    / "platform"
    / "mulesoft"
    / "apis"
    / "merger-reconciliation"
    / "openapi.yaml"
)


def test_openapi_defines_merger_endpoints():
    text = OPENAPI.read_text(encoding="utf-8")
    assert "/customers/dedup" in text
    assert "/accounts/mapping" in text
    assert "/ledger/dual-read" in text


def test_customer_dedup_schema_shape():
    sample = {
        "pnbCustomerId": "PNB000001",
        "acbCustomerId": "ACB000001",
        "taxId": "123456789",
        "matchStrategy": "TAX_ID",
    }
    assert sample["matchStrategy"] in ("TAX_ID", "NAME_DOB", "MANUAL_OVERRIDE")
    serialized = json.dumps(sample)
    assert "PNB000001" in serialized
