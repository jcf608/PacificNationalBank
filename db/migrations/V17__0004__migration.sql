-- Flyway migration V17.0004
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0004_00 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 DATE,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 VARCHAR(60),
    col_015 DATE,
    col_016 INT,
    col_017 DECIMAL(15,2),
    col_018 VARCHAR(60),
    col_019 DATE,
    col_020 VARCHAR(60),
    col_021 DECIMAL(15,2),
    col_022 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0004_01 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0004_02 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 DECIMAL(15,2),
    col_013 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0004_03 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0004_04 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 DATE,
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 DATE,
    col_013 TIMESTAMP,
    col_014 DECIMAL(15,2),
    col_015 TIMESTAMP,
    PRIMARY KEY (col_000)
);

