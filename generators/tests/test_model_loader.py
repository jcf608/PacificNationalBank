from pathlib import Path

from generators.model_loader import load_schema


ROOT = Path(__file__).resolve().parents[2]


def test_load_schema_parses_entities():
    schema = load_schema(ROOT / "generators" / "models" / "banking_schema.yaml")
    assert schema.domain == "RetailBanking"
    assert len(schema.entities) >= 3
    assert schema.entities[0].fields[0].name == "customer_id"
