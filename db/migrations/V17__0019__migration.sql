-- Flyway migration V17.0019
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0019_00 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 DATE,
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0019_01 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0019_02 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    col_012 VARCHAR(60),
    col_013 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0019_03 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 VARCHAR(60),
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    col_017 TIMESTAMP,
    col_018 VARCHAR(60),
    col_019 TIMESTAMP,
    col_020 TIMESTAMP,
    col_021 DATE,
    col_022 INT,
    col_023 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0019_04 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    col_012 DECIMAL(15,2),
    col_013 TIMESTAMP,
    col_014 TIMESTAMP,
    col_015 DATE,
    col_016 DECIMAL(15,2),
    col_017 TIMESTAMP,
    col_018 VARCHAR(60),
    col_019 VARCHAR(60),
    col_020 DATE,
    col_021 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

