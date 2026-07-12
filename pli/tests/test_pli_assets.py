from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]


def test_pli_directories_populated():
    batch = list((ROOT / "pli" / "programs" / "batch").glob("*.pli"))
    online = list((ROOT / "pli" / "programs" / "online").glob("*.pli"))
    includes = list((ROOT / "pli" / "includes").glob("*.inc"))
    assert len(batch) >= 50
    assert len(online) >= 50
    assert len(includes) >= 20
