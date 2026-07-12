-- Flyway migration V17.0042
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0042_00 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 DECIMAL(15,2),
    col_013 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0042_01 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0042_02 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 DATE,
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 VARCHAR(60),
    col_017 VARCHAR(60),
    col_018 DECIMAL(15,2),
    col_019 TIMESTAMP,
    col_020 DECIMAL(15,2),
    col_021 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0042_03 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 INT,
    col_010 DATE,
    col_011 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0042_04 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    PRIMARY KEY (col_000)
);

