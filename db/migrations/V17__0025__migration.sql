-- Flyway migration V17.0025
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0025_00 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    col_012 VARCHAR(60),
    col_013 INT,
    col_014 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0025_01 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 INT,
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    col_012 VARCHAR(60),
    col_013 DATE,
    col_014 DECIMAL(15,2),
    col_015 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0025_02 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 INT,
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 DATE,
    col_009 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0025_03 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 INT,
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 DECIMAL(15,2),
    col_015 DATE,
    col_016 TIMESTAMP,
    col_017 TIMESTAMP,
    col_018 DATE,
    col_019 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0025_04 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 INT,
    col_016 INT,
    col_017 DATE,
    col_018 DECIMAL(15,2),
    col_019 DECIMAL(15,2),
    col_020 VARCHAR(60),
    col_021 DATE,
    col_022 DATE,
    col_023 TIMESTAMP,
    PRIMARY KEY (col_000)
);

