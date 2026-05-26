-- Flyway migration V17.0074
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0074_00 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 DATE,
    col_003 DATE,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 DATE,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0074_01 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0074_02 (
    col_000 DATE,
    col_001 INT,
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0074_03 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0074_04 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 INT,
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 DATE,
    col_007 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

