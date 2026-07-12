-- Flyway migration V17.0091
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0091_00 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0091_01 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0091_02 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0091_03 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 DECIMAL(15,2),
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 VARCHAR(60),
    col_016 TIMESTAMP,
    col_017 VARCHAR(60),
    col_018 DECIMAL(15,2),
    col_019 INT,
    col_020 DECIMAL(15,2),
    col_021 VARCHAR(60),
    col_022 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0091_04 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 INT,
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

