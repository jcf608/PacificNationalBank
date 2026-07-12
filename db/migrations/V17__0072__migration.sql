-- Flyway migration V17.0072
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0072_00 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 DATE,
    col_008 INT,
    col_009 DATE,
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 DECIMAL(15,2),
    col_013 INT,
    col_014 VARCHAR(60),
    col_015 DECIMAL(15,2),
    col_016 TIMESTAMP,
    col_017 DATE,
    col_018 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0072_01 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0072_02 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 INT,
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0072_03 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 DATE,
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0072_04 (
    col_000 INT,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 INT,
    PRIMARY KEY (col_000)
);

