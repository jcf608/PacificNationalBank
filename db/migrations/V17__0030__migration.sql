-- Flyway migration V17.0030
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0030_00 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 INT,
    col_011 TIMESTAMP,
    col_012 DATE,
    col_013 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0030_01 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 DATE,
    col_013 DATE,
    col_014 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0030_02 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0030_03 (
    col_000 INT,
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 DATE,
    col_012 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0030_04 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    PRIMARY KEY (col_000)
);

