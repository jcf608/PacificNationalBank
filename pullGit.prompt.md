# pullGit — Ingest a GitHub Repo into a Valorica RAG Domain

## Platform

| Key | Value |
|-----|-------|
| AKS External IP | `4.254.99.44` |
| Auth endpoint | `POST /api/auth/api/v1/auth/login` |
| RAG API base | `/api/rag/api/v1` |
| Credentials | `jcf608@gmail.com` / `Valoric@2024!Jim` |

## Step 1 — Authenticate

```bash
T=$(curl -s -X POST "http://4.254.99.44/api/auth/api/v1/auth/login" \
  -H "Content-Type: application/json" \
  -d '{"email":"jcf608@gmail.com","password":"Valoric@2024!Jim"}' \
  | python3 -c "import sys,json; print(json.load(sys.stdin)['data']['token'])")
echo "Token: ${T:0:20}..."
```

Token field is nested under `data.token` (not top-level `token`).

## Step 2 — Create a New Domain

```bash
curl -s -X POST "http://4.254.99.44/api/rag/api/v1/domains" \
  -H "Authorization: Bearer $T" \
  -H "Content-Type: application/json" \
  -d '{
    "name": "<domain-slug>",
    "description": "<human description of what the domain contains>"
  }' | python3 -m json.tool
```

Capture the returned `data.id` — you'll need it as `domain_id` in Step 3.

### Example (PacificNationalBank)

```bash
curl -s -X POST "http://4.254.99.44/api/rag/api/v1/domains" \
  -H "Authorization: Bearer $T" \
  -H "Content-Type: application/json" \
  -d '{
    "name": "pacific-national-bank",
    "description": "Pacific National Bank legacy banking system — COBOL copybooks, DB2 SQL migrations, and supporting tooling"
  }'
# → domain id=15
```

## Step 3 — Ingest Repo via pull/git

```bash
curl -s -X POST "http://4.254.99.44/api/rag/api/v1/documents/pull/git" \
  -H "Authorization: Bearer $T" \
  -H "Content-Type: application/json" \
  -d '{
    "repo_url": "https://github.com/<owner>/<repo>.git",
    "domain_id": <DOMAIN_ID>,
    "branch": "main",
    "process_inline": true
  }'
```

- **Public repos** — no extra auth needed.
- **Private repos** — embed a PAT in the URL: `https://<PAT>@github.com/owner/repo.git`
- **`process_inline: true`** — processes documents synchronously in the request.
- The endpoint clones from GitHub directly, so it sees all files on the target branch regardless of local working-tree state.

### Timeout considerations

| Repo size | Approach |
|-----------|----------|
| < 100 files | Sync `pull/git` with `process_inline: true` works fine |
| 100–800 files | Sync `pull/git` — may take 1–5 min, use generous curl timeout |
| > 800 files | Risk of DB pool exhaustion (DB_POOL=2). Use SSE streaming endpoint `POST /api/v1/documents/pull/stream` if ingestion-worker is deployed, or batch by path prefix |

## Step 4 — Verify Ingestion

### Quick count by source URI

```bash
# Page through documents filtered by source_uri containing the repo name
curl -s "http://4.254.99.44/api/rag/api/v1/documents?per_page=100&page=1&sort=id&order=desc" \
  -H "Authorization: Bearer $T" | python3 -c "
import sys, json
docs = json.load(sys.stdin)['data']['data']
pnb = [d for d in docs if '<RepoName>' in (d.get('current_version',{}).get('source_uri','') or '')]
from collections import Counter
c = Counter(d['status'] for d in pnb)
print(f'Found: {len(pnb)}  Statuses: {dict(c)}')
"
```

### Full automated count (for large repos)

Write a script to page through all documents and filter by `source_uri` containing the repo name. The `domain_id` query param filter is currently non-functional on the documents list endpoint.

### Check a single document's detail

```bash
curl -s "http://4.254.99.44/api/rag/api/v1/documents/<DOC_ID>" \
  -H "Authorization: Bearer $T" | python3 -m json.tool
```

Key fields to inspect:
- `status` — `published` = fully processed, `pending` = still in queue
- `complexity_tier` / `complexity_score` — assigned during analysis
- `chunks` — array of vectorized chunks (empty = not yet vectorized)

## Known Issues

1. **Domain counters not updating** — `document_count`, `chunk_count`, `total_size_bytes` on the domain object stay at 0. This is a counter-cache bug; the documents are present.
2. **`domain_id` filter on document list is non-functional** — returns all documents regardless. Filter client-side by `current_version.source_uri`.
3. **Chunk/vector generation** — documents reaching `published` status may still have 0 chunks. Vectorization runs asynchronously and may require a separate trigger or background job cycle.
4. **DB_POOL=2 on rag-api** — limits concurrent DB connections. For repos > 400 files, the sync endpoint risks pool exhaustion. The Sprint 37 ingestion-worker (DB_POOL=25, 10 parallel workers) solves this but must be deployed to AKS first.

## Reference: PacificNationalBank Ingestion (26 May 2026)

| Item | Value |
|------|-------|
| Domain | `pacific-national-bank` (id=15) |
| Repo | `jcf608/PacificNationalBank` (public, branch `main`) |
| Total files on GitHub | 761 (750 `.sql`, 5 `.cpy`, 2 `.py`, + support) |
| Documents ingested | 761 (IDs 10872–11632) |
| Published | 760 |
| Pending | 1 (`generate_supplemental.py`) |
| Failed | 0 |
