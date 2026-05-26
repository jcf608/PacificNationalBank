-- ACB core banking schema (mirror of PNB with ACB prefixes)
CREATE SCHEMA IF NOT EXISTS acb_core;

CREATE TABLE acb_core.customer (
    customer_id     VARCHAR(12)  NOT NULL PRIMARY KEY,
    legal_name      VARCHAR(80)  NOT NULL,
    tax_id          VARCHAR(11)  NOT NULL,
    kyc_status      CHAR(1)      NOT NULL DEFAULT 'P',
    created_at      TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE acb_core.account (
    account_number  VARCHAR(16)  NOT NULL PRIMARY KEY,
    customer_id     VARCHAR(12)  NOT NULL REFERENCES acb_core.customer(customer_id),
    account_type    CHAR(2)      NOT NULL,
    status          CHAR(1)      NOT NULL DEFAULT 'A',
    branch_code     VARCHAR(6)   NOT NULL,
    currency        CHAR(3)      NOT NULL DEFAULT 'USD',
    ledger_balance  DECIMAL(19,4) NOT NULL DEFAULT 0,
    available_balance DECIMAL(19,4) NOT NULL DEFAULT 0
);

CREATE INDEX idx_acb_account_customer ON acb_core.account(customer_id);
