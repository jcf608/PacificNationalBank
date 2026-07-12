-- Flyway migration V17.0060
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0060_00 (
    col_000 INT,
    col_001 INT,
    col_002 INT,
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 INT,
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 VARCHAR(60),
    col_015 DATE,
    col_016 TIMESTAMP,
    col_017 VARCHAR(60),
    col_018 INT,
    col_019 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0060_01 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 INT,
    col_011 INT,
    col_012 VARCHAR(60),
    col_013 DATE,
    col_014 VARCHAR(60),
    col_015 DECIMAL(15,2),
    col_016 DATE,
    col_017 TIMESTAMP,
    col_018 VARCHAR(60),
    col_019 TIMESTAMP,
    col_020 INT,
    col_021 TIMESTAMP,
    col_022 INT,
    col_023 VARCHAR(60),
    col_024 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0060_02 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 DATE,
    col_010 DATE,
    col_011 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0060_03 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0060_04 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 DATE,
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 DECIMAL(15,2),
    col_013 TIMESTAMP,
    PRIMARY KEY (col_000)
);

