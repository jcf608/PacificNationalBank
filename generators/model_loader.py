from pathlib import Path
from typing import Any, Dict
import yaml

from .schema import BankingSchema, EntityModel, FieldModel


def _validate_entity(raw: Dict[str, Any]) -> None:
    required = ["name", "table", "copybook", "fields"]
    missing = [k for k in required if k not in raw]
    if missing:
        raise ValueError(f"Entity missing required keys: {missing}")
    if not isinstance(raw["fields"], list) or not raw["fields"]:
        raise ValueError(f"Entity {raw['name']} must define non-empty fields")


def load_schema(path: Path) -> BankingSchema:
    data = yaml.safe_load(path.read_text(encoding="utf-8"))
    if "domain" not in data or "version" not in data or "entities" not in data:
        raise ValueError("Schema must include domain, version, entities")

    entities = []
    for raw_entity in data["entities"]:
        _validate_entity(raw_entity)
        fields = []
        for raw_field in raw_entity["fields"]:
            if "name" not in raw_field or "type" not in raw_field or "length" not in raw_field:
                raise ValueError(f"Invalid field definition in {raw_entity['name']}")
            fields.append(FieldModel(
                name=raw_field["name"],
                type=raw_field["type"],
                length=int(raw_field["length"]),
                nullable=bool(raw_field.get("nullable", False)),
                description=str(raw_field.get("description", "")),
            ))
        entities.append(EntityModel(
            name=raw_entity["name"],
            table=raw_entity["table"],
            copybook=raw_entity["copybook"],
            fields=fields,
        ))

    return BankingSchema(domain=data["domain"], version=str(data["version"]), entities=entities)
