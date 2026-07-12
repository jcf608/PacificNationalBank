-- Flyway migration V17.0020
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0020_00 (
    col_000 INT,
    col_001 DATE,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0020_01 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 INT,
    col_016 INT,
    col_017 INT,
    col_018 TIMESTAMP,
    col_019 VARCHAR(60),
    col_020 VARCHAR(60),
    col_021 TIMESTAMP,
    col_022 INT,
    col_023 VARCHAR(60),
    col_024 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0020_02 (
    col_000 INT,
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 INT,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0020_03 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 DECIMAL(15,2),
    col_014 DATE,
    col_015 INT,
    col_016 DECIMAL(15,2),
    col_017 VARCHAR(60),
    col_018 INT,
    col_019 DECIMAL(15,2),
    col_020 DATE,
    col_021 DECIMAL(15,2),
    col_022 DECIMAL(15,2),
    col_023 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0020_04 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 DATE,
    PRIMARY KEY (col_000)
);

