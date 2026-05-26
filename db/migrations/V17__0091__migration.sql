-- Flyway migration V17.0091
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0091_00 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 DATE,
    col_013 VARCHAR(60),
    col_014 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0091_01 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DATE,
    col_012 VARCHAR(60),
    col_013 TIMESTAMP,
    col_014 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0091_02 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0091_03 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 DATE,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 VARCHAR(60),
    col_014 DECIMAL(15,2),
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0091_04 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    PRIMARY KEY (col_000)
);

