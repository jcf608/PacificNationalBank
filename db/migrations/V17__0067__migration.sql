-- Flyway migration V17.0067
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0067_00 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 DATE,
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    col_013 DATE,
    col_014 DECIMAL(15,2),
    col_015 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0067_01 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0067_02 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0067_03 (
    col_000 INT,
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 DATE,
    col_007 DATE,
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0067_04 (
    col_000 DATE,
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 INT,
    col_007 INT,
    PRIMARY KEY (col_000)
);

