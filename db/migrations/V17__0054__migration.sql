-- Flyway migration V17.0054
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0054_00 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    col_012 DATE,
    col_013 TIMESTAMP,
    col_014 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0054_01 (
    col_000 DATE,
    col_001 DATE,
    col_002 DATE,
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 DATE,
    col_014 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0054_02 (
    col_000 DATE,
    col_001 INT,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0054_03 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 INT,
    col_010 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0054_04 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 DATE,
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 TIMESTAMP,
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 DATE,
    col_016 VARCHAR(60),
    col_017 DATE,
    col_018 DATE,
    col_019 INT,
    col_020 VARCHAR(60),
    col_021 DECIMAL(15,2),
    col_022 TIMESTAMP,
    col_023 VARCHAR(60),
    col_024 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

