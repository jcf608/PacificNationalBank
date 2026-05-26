-- Flyway migration V17.0015
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0015_00 (
    col_000 INT,
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 INT,
    col_005 DATE,
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 TIMESTAMP,
    col_012 TIMESTAMP,
    col_013 DATE,
    col_014 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0015_01 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 DATE,
    col_007 INT,
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 INT,
    col_015 DECIMAL(15,2),
    col_016 VARCHAR(60),
    col_017 TIMESTAMP,
    col_018 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0015_02 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 INT,
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 VARCHAR(60),
    col_013 TIMESTAMP,
    col_014 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0015_03 (
    col_000 DATE,
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 INT,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 DECIMAL(15,2),
    col_013 DATE,
    col_014 DECIMAL(15,2),
    col_015 VARCHAR(60),
    col_016 DATE,
    col_017 DATE,
    col_018 DECIMAL(15,2),
    col_019 INT,
    col_020 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0015_04 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 INT,
    col_006 DATE,
    col_007 TIMESTAMP,
    PRIMARY KEY (col_000)
);

