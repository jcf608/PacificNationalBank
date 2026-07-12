-- Flyway migration V17.0074
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0074_00 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0074_01 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 DATE,
    col_013 VARCHAR(60),
    col_014 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0074_02 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0074_03 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0074_04 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 INT,
    col_015 VARCHAR(60),
    col_016 DECIMAL(15,2),
    col_017 VARCHAR(60),
    col_018 DATE,
    col_019 INT,
    col_020 INT,
    col_021 TIMESTAMP,
    PRIMARY KEY (col_000)
);

