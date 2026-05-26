-- Flyway migration V17.0055
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0055_00 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 INT,
    col_003 DATE,
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0055_01 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 INT,
    col_008 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0055_02 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 INT,
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 DECIMAL(15,2),
    col_014 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0055_03 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0055_04 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

