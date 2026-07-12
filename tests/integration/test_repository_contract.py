from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]


def test_required_architecture_tree_exists():
    required = [
        '.github/workflows',
        'cobol/copybooks', 'cobol/programs/batch', 'cobol/programs/online', 'cobol/jcl', 'cobol/tests',
        'pli/includes', 'pli/programs/batch', 'pli/programs/online', 'pli/tests',
        'ims/dbdgen', 'ims/psbgen', 'ims/mfs', 'ims/transactions',
        'java/pnb-core-banking', 'java/pnb-channel-services', 'java/pnb-integration', 'java/pnb-websphere',
        'db/db2', 'db/ims', 'db/migrations',
        'generators/models', 'generators/templates',
        'scripts', 'tests/integration', 'docs'
    ]
    for rel in required:
        assert (ROOT / rel).exists(), f"Missing required path: {rel}"
