-- Flyway migration V17.0056
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0056_00 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 DATE,
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 DATE,
    col_009 INT,
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 INT,
    col_014 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0056_01 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0056_02 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0056_03 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 DATE,
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0056_04 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

