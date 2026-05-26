-- Flyway migration V17.0069
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0069_00 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 DECIMAL(15,2),
    col_014 DATE,
    col_015 DECIMAL(15,2),
    col_016 INT,
    col_017 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0069_01 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0069_02 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 DATE,
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0069_03 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 DATE,
    col_011 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0069_04 (
    col_000 INT,
    col_001 INT,
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    PRIMARY KEY (col_000)
);

