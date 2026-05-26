# Canonical banking domains (post-merger)

| Domain | PNB legacy | ACB legacy | Azure (both) | MuleSoft reconcile |
|--------|------------|------------|--------------|-------------------|
| `account` | COBOL `PNBACCO` | PL/I `ACBACCO` | `account-service` | `account-mapping` |
| | _Account master & balances_ | | | |
| `customer` | COBOL `PNBCUST` | PL/I `ACBCUST` | `customer-service` | `customer-mapping` |
| | _Party & KYC profile_ | | | |
| `transaction` | COBOL `PNBTRAN` | PL/I `ACBTRAN` | `transaction-service` | `transaction-mapping` |
| | _Posting & history_ | | | |
| `general_ledger` | COBOL `PNBGENE` | PL/I `ACBGENE` | `general_ledger-service` | `general_ledger-mapping` |
| | _GL & sub-ledger_ | | | |
| `deposit` | COBOL `PNBDEPO` | PL/I `ACBDEPO` | `deposit-service` | `deposit-mapping` |
| | _Demand & time deposits_ | | | |
| `loan` | COBOL `PNBLOAN` | PL/I `ACBLOAN` | `loan-service` | `loan-mapping` |
| | _Commercial & retail lending_ | | | |
| `mortgage` | COBOL `PNBMORT` | PL/I `ACBMORT` | `mortgage-service` | `mortgage-mapping` |
| | _Residential mortgage_ | | | |
| `heloc` | COBOL `PNBHELO` | PL/I `ACBHELO` | `heloc-service` | `heloc-mapping` |
| | _Home equity line_ | | | |
| `creditline` | COBOL `PNBCRED` | PL/I `ACBCRED` | `creditline-service` | `creditline-mapping` |
| | _Revolving credit_ | | | |
| `card` | COBOL `PNBCARD` | PL/I `ACBCARD` | `card-service` | `card-mapping` |
| | _Debit & credit cards_ | | | |
| `ach` | COBOL `PNBACH` | PL/I `ACBACH` | `ach-service` | `ach-mapping` |
| | _ACH origination & receipt_ | | | |
| `wire` | COBOL `PNBWIRE` | PL/I `ACBWIRE` | `wire-service` | `wire-mapping` |
| | _Fedwire & SWIFT_ | | | |
| `branch` | COBOL `PNBBRAN` | PL/I `ACBBRAN` | `branch-service` | `branch-mapping` |
| | _Branch & teller ops_ | | | |
| `product` | COBOL `PNBPROD` | PL/I `ACBPROD` | `product-service` | `product-mapping` |
| | _Product catalog_ | | | |
| `rate` | COBOL `PNBRATE` | PL/I `ACBRATE` | `rate-service` | `rate-mapping` |
| | _Rate management_ | | | |
| `fee` | COBOL `PNBFEE` | PL/I `ACBFEE` | `fee-service` | `fee-mapping` |
| | _Fee assessment_ | | | |
| `hold` | COBOL `PNBHOLD` | PL/I `ACBHOLD` | `hold-service` | `hold-mapping` |
| | _Account holds_ | | | |
| `stop` | COBOL `PNBSTOP` | PL/I `ACBSTOP` | `stop-service` | `stop-mapping` |
| | _Stop payment_ | | | |
| `audit` | COBOL `PNBAUDI` | PL/I `ACBAUDI` | `audit-service` | `audit-mapping` |
| | _Audit trail_ | | | |
| `alert` | COBOL `PNBALER` | PL/I `ACBALER` | `alert-service` | `alert-mapping` |
| | _Customer alerts_ | | | |
| `compliance` | COBOL `PNBCOMP` | PL/I `ACBCOMP` | `compliance-service` | `compliance-mapping` |
| | _Regulatory compliance_ | | | |
| `risk` | COBOL `PNBRISK` | PL/I `ACBRISK` | `risk-service` | `risk-mapping` |
| | _Credit & operational risk_ | | | |
| `fraud` | COBOL `PNBFRAU` | PL/I `ACBFRAU` | `fraud-service` | `fraud-mapping` |
| | _Fraud detection_ | | | |
| `collections` | COBOL `PNBCOLL` | PL/I `ACBCOLL` | `collections-service` | `collections-mapping` |
| | _Delinquency collections_ | | | |
| `escrow` | COBOL `PNBESCR` | PL/I `ACBESCR` | `escrow-service` | `escrow-mapping` |
| | _Escrow administration_ | | | |
| `trust` | COBOL `PNBTRUS` | PL/I `ACBTRUS` | `trust-service` | `trust-mapping` |
| | _Trust & fiduciary_ | | | |
| `cashmanagement` | COBOL `PNBCASH` | PL/I `ACBCASH` | `cashmanagement-service` | `cashmanagement-mapping` |
| | _Cash management_ | | | |
| `treasury` | COBOL `PNBTREA` | PL/I `ACBTREA` | `treasury-service` | `treasury-mapping` |
| | _Treasury & liquidity_ | | | |
| `foreignexchange` | COBOL `PNBFORE` | PL/I `ACBFORE` | `foreignexchange-service` | `foreignexchange-mapping` |
| | _FX trading & settlement_ | | | |
| `tradefinance` | COBOL `PNBTRAD` | PL/I `ACBTRAD` | `tradefinance-service` | `tradefinance-mapping` |
| | _Trade finance_ | | | |
| `letterofcredit` | COBOL `PNBLETT` | PL/I `ACBLETT` | `letterofcredit-service` | `letterofcredit-mapping` |
| | _Letters of credit_ | | | |
