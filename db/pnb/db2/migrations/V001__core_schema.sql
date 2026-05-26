-- PNB core banking schema (DB2 / Azure SQL compatible subset)
CREATE SCHEMA IF NOT EXISTS pnb_core;

CREATE TABLE pnb_core.customer (
    customer_id     VARCHAR(12)  NOT NULL PRIMARY KEY,
    legal_name      VARCHAR(80)  NOT NULL,
    tax_id          VARCHAR(11)  NOT NULL,
    kyc_status      CHAR(1)      NOT NULL DEFAULT 'P',
    created_at      TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE pnb_core.account (
    account_number  VARCHAR(16)  NOT NULL PRIMARY KEY,
    customer_id     VARCHAR(12)  NOT NULL REFERENCES pnb_core.customer(customer_id),
    account_type    CHAR(2)      NOT NULL,
    status          CHAR(1)      NOT NULL DEFAULT 'A',
    branch_code     VARCHAR(6)   NOT NULL,
    currency        CHAR(3)      NOT NULL DEFAULT 'USD',
    ledger_balance  DECIMAL(19,4) NOT NULL DEFAULT 0,
    available_balance DECIMAL(19,4) NOT NULL DEFAULT 0
);

CREATE INDEX idx_pnb_account_customer ON pnb_core.account(customer_id);
