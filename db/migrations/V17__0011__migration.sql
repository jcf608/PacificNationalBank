-- Flyway migration V17.0011
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0011_00 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 INT,
    col_012 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0011_01 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 INT,
    col_012 DATE,
    col_013 DECIMAL(15,2),
    col_014 DECIMAL(15,2),
    col_015 TIMESTAMP,
    col_016 INT,
    col_017 INT,
    col_018 INT,
    col_019 INT,
    col_020 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0011_02 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0011_03 (
    col_000 TIMESTAMP,
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 DECIMAL(15,2),
    col_015 VARCHAR(60),
    col_016 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0011_04 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 DATE,
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 VARCHAR(60),
    PRIMARY KEY (col_000)
);

