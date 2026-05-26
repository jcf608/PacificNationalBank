-- Flyway migration V17.0084
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0084_00 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 DATE,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0084_01 (
    col_000 DATE,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 DATE,
    col_011 DATE,
    col_012 DATE,
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 DATE,
    col_017 VARCHAR(60),
    col_018 DATE,
    col_019 INT,
    col_020 TIMESTAMP,
    col_021 DECIMAL(15,2),
    col_022 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0084_02 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 DATE,
    col_013 DATE,
    col_014 VARCHAR(60),
    col_015 DATE,
    col_016 INT,
    col_017 DECIMAL(15,2),
    col_018 DECIMAL(15,2),
    col_019 INT,
    col_020 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0084_03 (
    col_000 DATE,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DATE,
    col_012 VARCHAR(60),
    col_013 DATE,
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 INT,
    col_017 INT,
    col_018 TIMESTAMP,
    col_019 VARCHAR(60),
    col_020 TIMESTAMP,
    col_021 VARCHAR(60),
    col_022 VARCHAR(60),
    col_023 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0084_04 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 INT,
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 INT,
    PRIMARY KEY (col_000)
);

