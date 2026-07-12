-- Flyway migration V17.0007
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0007_00 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 INT,
    col_006 DATE,
    col_007 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0007_01 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0007_02 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 INT,
    col_007 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0007_03 (
    col_000 DATE,
    col_001 DATE,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 VARCHAR(60),
    col_012 DATE,
    col_013 VARCHAR(60),
    col_014 DECIMAL(15,2),
    col_015 VARCHAR(60),
    col_016 DECIMAL(15,2),
    col_017 INT,
    col_018 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0007_04 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 INT,
    col_004 DATE,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 DECIMAL(15,2),
    col_013 INT,
    col_014 DECIMAL(15,2),
    col_015 DECIMAL(15,2),
    col_016 DECIMAL(15,2),
    col_017 DATE,
    col_018 VARCHAR(60),
    col_019 DATE,
    col_020 DATE,
    col_021 INT,
    col_022 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

