from pathlib import Path

from generators.model_loader import load_schema
from generators.render import RenderEngine


def main() -> int:
    root = Path(__file__).resolve().parent
    model_root = root / "models"
    template_root = root / "templates"
    output_root = root / "output"
    output_root.mkdir(parents=True, exist_ok=True)

    engine = RenderEngine(template_root)

    for model_path in sorted(model_root.glob("*.yaml")):
        schema = load_schema(model_path)
        doc_path = output_root / f"{schema.domain.lower()}_schema.md"
        doc_path.write_text(engine.render_schema("schema_doc.md.j2", schema), encoding="utf-8")

        for entity in schema.entities:
            cobol_path = output_root / "cobol" / f"{entity.copybook}.cpy"
            cobol_path.parent.mkdir(parents=True, exist_ok=True)
            cobol_path.write_text(engine.render_entity("copybook.cpy.j2", entity), encoding="utf-8")

            java_path = output_root / "java" / f"{entity.name}.java"
            java_path.parent.mkdir(parents=True, exist_ok=True)
            java_path.write_text(engine.render_entity("entity.java.j2", entity), encoding="utf-8")

            sql_path = output_root / "db2" / f"{entity.table}.sql"
            sql_path.parent.mkdir(parents=True, exist_ok=True)
            sql_path.write_text(engine.render_entity("table.sql.j2", entity), encoding="utf-8")

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
