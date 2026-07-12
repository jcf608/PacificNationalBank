from pathlib import Path
import argparse

from .model_loader import load_schema
from .render import RenderEngine


def main() -> int:
    parser = argparse.ArgumentParser(description="PNB synthetic artifact generator")
    parser.add_argument("--model", required=True, help="YAML model path")
    parser.add_argument("--template", required=True, help="Template file name")
    parser.add_argument("--output", required=True, help="Output file")
    parser.add_argument("--entity", help="Optional entity name for entity-scoped templates")
    args = parser.parse_args()

    model_path = Path(args.model)
    schema = load_schema(model_path)
    engine = RenderEngine(model_path.parent.parent / "templates")

    out_path = Path(args.output)
    out_path.parent.mkdir(parents=True, exist_ok=True)

    if args.entity:
        entity = next((e for e in schema.entities if e.name == args.entity), None)
        if entity is None:
            raise ValueError(f"Entity not found: {args.entity}")
        rendered = engine.render_entity(args.template, entity)
    else:
        rendered = engine.render_schema(args.template, schema)

    out_path.write_text(rendered, encoding="utf-8")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
