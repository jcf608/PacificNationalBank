from pathlib import Path
from jinja2 import Environment, FileSystemLoader, select_autoescape

from .schema import BankingSchema, EntityModel


class RenderEngine:
    def __init__(self, template_root: Path):
        self.template_root = template_root
        self.env = Environment(
            loader=FileSystemLoader(str(template_root)),
            autoescape=select_autoescape(default=False),
            trim_blocks=True,
            lstrip_blocks=True,
        )

    def render_entity(self, template_name: str, entity: EntityModel) -> str:
        template = self.env.get_template(template_name)
        return template.render(entity=entity)

    def render_schema(self, template_name: str, schema: BankingSchema) -> str:
        template = self.env.get_template(template_name)
        return template.render(schema=schema)
