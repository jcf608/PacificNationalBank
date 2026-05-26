# Enterprise operations artefacts

Generated and curated operational content for the PNB + ACB merged bank.

| Path | Description |
|------|-------------|
| `itsm/tickets/` | IT Service Management records (INC/CHG/PRB/REQ) |
| `ipc/tickets/` | Inter-bank integration & reconciliation tickets |
| `changemgmt/records/` | CAB change records linked to merger cutover |
| `audit/events/` | Immutable audit JSONL streams |

Regenerate corpus to ~3M total repo lines:

```bash
make corpus
make corpus-stats
```
