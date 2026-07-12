from dataclasses import dataclass, field
from typing import List


@dataclass
class FieldModel:
    name: str
    type: str
    length: int
    nullable: bool = False
    description: str = ""


@dataclass
class EntityModel:
    name: str
    table: str
    copybook: str
    fields: List[FieldModel] = field(default_factory=list)


@dataclass
class BankingSchema:
    domain: str
    version: str
    entities: List[EntityModel] = field(default_factory=list)
