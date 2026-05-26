-- Flyway migration V17.0013
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0013_00 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 INT,
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 DATE,
    col_009 DATE,
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 DECIMAL(15,2),
    col_015 INT,
    col_016 INT,
    col_017 INT,
    col_018 DATE,
    col_019 DECIMAL(15,2),
    col_020 INT,
    col_021 TIMESTAMP,
    col_022 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0013_01 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0013_02 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 DATE,
    col_013 INT,
    col_014 DATE,
    col_015 VARCHAR(60),
    col_016 VARCHAR(60),
    col_017 DATE,
    col_018 TIMESTAMP,
    col_019 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0013_03 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 INT,
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    col_013 DATE,
    col_014 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0013_04 (
    col_000 INT,
    col_001 DATE,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 VARCHAR(60),
    col_013 DATE,
    col_014 TIMESTAMP,
    col_015 DATE,
    PRIMARY KEY (col_000)
);

