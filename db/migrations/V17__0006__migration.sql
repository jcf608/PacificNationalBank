-- Flyway migration V17.0006
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0006_00 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 DATE,
    col_008 DATE,
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0006_01 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 DATE,
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0006_02 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 DECIMAL(15,2),
    col_016 VARCHAR(60),
    col_017 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0006_03 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 INT,
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0006_04 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 DATE,
    PRIMARY KEY (col_000)
);

