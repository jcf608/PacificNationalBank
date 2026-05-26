-- Flyway migration V17.0059
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0059_00 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 DATE,
    col_005 INT,
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    col_012 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0059_01 (
    col_000 INT,
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0059_02 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 DECIMAL(15,2),
    col_012 DECIMAL(15,2),
    col_013 DECIMAL(15,2),
    col_014 VARCHAR(60),
    col_015 DATE,
    col_016 INT,
    col_017 INT,
    col_018 DATE,
    col_019 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0059_03 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 DATE,
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0059_04 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 DATE,
    col_005 DATE,
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 DECIMAL(15,2),
    col_017 VARCHAR(60),
    col_018 DECIMAL(15,2),
    col_019 DECIMAL(15,2),
    col_020 VARCHAR(60),
    col_021 INT,
    col_022 VARCHAR(60),
    PRIMARY KEY (col_000)
);

