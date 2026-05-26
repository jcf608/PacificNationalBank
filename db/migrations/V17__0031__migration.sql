-- Flyway migration V17.0031
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0031_00 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 DECIMAL(15,2),
    col_015 DECIMAL(15,2),
    col_016 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0031_01 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 DATE,
    col_012 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0031_02 (
    col_000 INT,
    col_001 INT,
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 DATE,
    col_007 INT,
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0031_03 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 INT,
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 TIMESTAMP,
    col_012 VARCHAR(60),
    col_013 DECIMAL(15,2),
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 TIMESTAMP,
    col_017 DECIMAL(15,2),
    col_018 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0031_04 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 INT,
    col_010 DATE,
    PRIMARY KEY (col_000)
);

