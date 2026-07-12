-- Flyway migration V17.0048
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0048_00 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 VARCHAR(60),
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 VARCHAR(60),
    col_013 VARCHAR(60),
    col_014 VARCHAR(60),
    col_015 DECIMAL(15,2),
    col_016 INT,
    col_017 TIMESTAMP,
    col_018 DECIMAL(15,2),
    col_019 DATE,
    col_020 INT,
    col_021 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0048_01 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0048_02 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 INT,
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0048_03 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 INT,
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0048_04 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 INT,
    col_004 DATE,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 TIMESTAMP,
    PRIMARY KEY (col_000)
);

