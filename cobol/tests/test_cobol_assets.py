from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]


def test_required_copybooks_exist():
    expected = {"CPYCUST.cpy", "CPYACCT.cpy", "CPYTXN.cpy", "CPYLOAN.cpy"}
    copybook_dir = ROOT / "cobol" / "copybooks"
    existing = {p.name for p in copybook_dir.glob("*.cpy")}
    assert expected.issubset(existing)


def test_batch_and_online_programs_present():
    batch = list((ROOT / "cobol" / "programs" / "batch").glob("*.cbl"))
    online = list((ROOT / "cobol" / "programs" / "online").glob("*.cbl"))
    assert len(batch) >= 50
    assert len(online) >= 40
