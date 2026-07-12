from pathlib import Path

from generators.model_loader import load_schema
from generators.render import RenderEngine


ROOT = Path(__file__).resolve().parents[2]


def test_render_copybook_template_contains_entity_name():
    schema = load_schema(ROOT / "generators" / "models" / "banking_schema.yaml")
    engine = RenderEngine(ROOT / "generators" / "templates")
    out = engine.render_entity("copybook.cpy.j2", schema.entities[0])
    assert "Copybook" in out
    assert schema.entities[0].copybook in out
