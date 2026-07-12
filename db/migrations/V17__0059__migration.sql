-- Flyway migration V17.0059
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0059_00 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 INT,
    col_010 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0059_01 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 DATE,
    col_014 DATE,
    col_015 INT,
    col_016 DATE,
    col_017 VARCHAR(60),
    col_018 DECIMAL(15,2),
    col_019 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0059_02 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0059_03 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 DATE,
    col_006 DATE,
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 INT,
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 VARCHAR(60),
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 VARCHAR(60),
    col_016 VARCHAR(60),
    col_017 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0059_04 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 INT,
    col_011 DATE,
    PRIMARY KEY (col_000)
);

