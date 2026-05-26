-- Flyway migration V17.0089
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0089_00 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0089_01 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 INT,
    col_009 INT,
    col_010 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0089_02 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 DATE,
    col_012 VARCHAR(60),
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0089_03 (
    col_000 DATE,
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 INT,
    col_007 DATE,
    col_008 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0089_04 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 DATE,
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DATE,
    PRIMARY KEY (col_000)
);

