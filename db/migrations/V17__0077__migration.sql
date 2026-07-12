-- Flyway migration V17.0077
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0077_00 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 INT,
    col_006 DATE,
    col_007 INT,
    col_008 INT,
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0077_01 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 DATE,
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 INT,
    col_010 INT,
    col_011 INT,
    col_012 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0077_02 (
    col_000 DATE,
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0077_03 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 VARCHAR(60),
    col_011 TIMESTAMP,
    col_012 DATE,
    col_013 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0077_04 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 DATE,
    col_010 INT,
    PRIMARY KEY (col_000)
);

