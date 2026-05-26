-- Flyway migration V17.0032
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0032_00 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0032_01 (
    col_000 DATE,
    col_001 DATE,
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 DATE,
    col_006 DATE,
    col_007 INT,
    col_008 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0032_02 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 INT,
    col_012 VARCHAR(60),
    col_013 VARCHAR(60),
    col_014 INT,
    col_015 DECIMAL(15,2),
    col_016 DATE,
    col_017 DECIMAL(15,2),
    col_018 VARCHAR(60),
    col_019 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0032_03 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0032_04 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 INT,
    col_008 INT,
    PRIMARY KEY (col_000)
);

