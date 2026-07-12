-- Flyway migration V17.0064
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0064_00 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 INT,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 DATE,
    col_012 VARCHAR(60),
    col_013 INT,
    col_014 DATE,
    col_015 INT,
    col_016 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0064_01 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 DATE,
    col_005 DATE,
    col_006 DATE,
    col_007 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0064_02 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 INT,
    col_009 DATE,
    col_010 DATE,
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 DECIMAL(15,2),
    col_014 DATE,
    col_015 DATE,
    col_016 DATE,
    col_017 DECIMAL(15,2),
    col_018 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0064_03 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0064_04 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    PRIMARY KEY (col_000)
);

