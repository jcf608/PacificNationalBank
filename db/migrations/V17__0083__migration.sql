-- Flyway migration V17.0083
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0083_00 (
    col_000 DATE,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 DATE,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0083_01 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 DECIMAL(15,2),
    col_015 DATE,
    col_016 VARCHAR(60),
    col_017 DECIMAL(15,2),
    col_018 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0083_02 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0083_03 (
    col_000 DATE,
    col_001 DATE,
    col_002 DATE,
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0083_04 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 DATE,
    col_013 INT,
    col_014 DECIMAL(15,2),
    col_015 DECIMAL(15,2),
    col_016 DATE,
    col_017 VARCHAR(60),
    PRIMARY KEY (col_000)
);

