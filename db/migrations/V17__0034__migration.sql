-- Flyway migration V17.0034
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0034_00 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0034_01 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0034_02 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0034_03 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 INT,
    col_015 DATE,
    col_016 INT,
    col_017 DATE,
    col_018 DATE,
    col_019 TIMESTAMP,
    col_020 TIMESTAMP,
    col_021 DATE,
    col_022 VARCHAR(60),
    col_023 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0034_04 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 INT,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 INT,
    col_012 INT,
    col_013 VARCHAR(60),
    col_014 INT,
    col_015 INT,
    PRIMARY KEY (col_000)
);

