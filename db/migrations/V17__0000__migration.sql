-- Flyway migration V17.0000
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0000_00 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    col_013 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0000_01 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0000_02 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 VARCHAR(60),
    col_011 DATE,
    col_012 DATE,
    col_013 VARCHAR(60),
    col_014 VARCHAR(60),
    col_015 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0000_03 (
    col_000 TIMESTAMP,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 INT,
    col_011 DATE,
    col_012 VARCHAR(60),
    col_013 TIMESTAMP,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    col_017 INT,
    col_018 TIMESTAMP,
    col_019 DECIMAL(15,2),
    col_020 VARCHAR(60),
    col_021 TIMESTAMP,
    col_022 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0000_04 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    PRIMARY KEY (col_000)
);

