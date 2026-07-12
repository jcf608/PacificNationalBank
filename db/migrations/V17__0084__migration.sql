-- Flyway migration V17.0084
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0084_00 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 DATE,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    col_017 TIMESTAMP,
    col_018 INT,
    col_019 DATE,
    col_020 DECIMAL(15,2),
    col_021 TIMESTAMP,
    col_022 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0084_01 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 VARCHAR(60),
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0084_02 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 VARCHAR(60),
    col_016 VARCHAR(60),
    col_017 DATE,
    col_018 DECIMAL(15,2),
    col_019 TIMESTAMP,
    col_020 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0084_03 (
    col_000 INT,
    col_001 INT,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 DECIMAL(15,2),
    col_013 DATE,
    col_014 DATE,
    col_015 DECIMAL(15,2),
    col_016 INT,
    col_017 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0084_04 (
    col_000 DATE,
    col_001 DATE,
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 INT,
    col_014 TIMESTAMP,
    PRIMARY KEY (col_000)
);

