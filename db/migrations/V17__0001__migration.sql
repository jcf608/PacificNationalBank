-- Flyway migration V17.0001
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0001_00 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 DATE,
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 DECIMAL(15,2),
    col_016 DATE,
    col_017 DECIMAL(15,2),
    col_018 INT,
    col_019 TIMESTAMP,
    col_020 VARCHAR(60),
    col_021 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0001_01 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0001_02 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 DATE,
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 DATE,
    col_017 DATE,
    col_018 VARCHAR(60),
    col_019 VARCHAR(60),
    col_020 DATE,
    col_021 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0001_03 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0001_04 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    PRIMARY KEY (col_000)
);

