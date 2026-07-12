-- Flyway migration V17.0044
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0044_00 (
    col_000 DATE,
    col_001 INT,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0044_01 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 INT,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 VARCHAR(60),
    col_015 DATE,
    col_016 TIMESTAMP,
    col_017 INT,
    col_018 TIMESTAMP,
    col_019 INT,
    col_020 DATE,
    col_021 DATE,
    col_022 VARCHAR(60),
    col_023 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0044_02 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 TIMESTAMP,
    col_012 VARCHAR(60),
    col_013 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0044_03 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 VARCHAR(60),
    col_009 DECIMAL(15,2),
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 VARCHAR(60),
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0044_04 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DATE,
    col_012 DATE,
    col_013 TIMESTAMP,
    PRIMARY KEY (col_000)
);

