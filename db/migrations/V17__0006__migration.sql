-- Flyway migration V17.0006
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0006_00 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 INT,
    col_003 INT,
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0006_01 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 DATE,
    col_007 DATE,
    col_008 DATE,
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 INT,
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 VARCHAR(60),
    col_017 VARCHAR(60),
    col_018 DECIMAL(15,2),
    col_019 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0006_02 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 DATE,
    col_003 DATE,
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 DATE,
    col_008 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0006_03 (
    col_000 TIMESTAMP,
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0006_04 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 INT,
    col_007 INT,
    col_008 VARCHAR(60),
    PRIMARY KEY (col_000)
);

