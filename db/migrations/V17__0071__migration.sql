-- Flyway migration V17.0071
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0071_00 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0071_01 (
    col_000 TIMESTAMP,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0071_02 (
    col_000 DATE,
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0071_03 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 DECIMAL(15,2),
    col_014 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0071_04 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 DATE,
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 DECIMAL(15,2),
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 VARCHAR(60),
    col_017 TIMESTAMP,
    col_018 INT,
    col_019 VARCHAR(60),
    col_020 VARCHAR(60),
    col_021 DATE,
    PRIMARY KEY (col_000)
);

