-- Flyway migration V17.0093
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0093_00 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0093_01 (
    col_000 INT,
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0093_02 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0093_03 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 INT,
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 INT,
    col_011 INT,
    col_012 INT,
    col_013 DATE,
    col_014 VARCHAR(60),
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    col_017 VARCHAR(60),
    col_018 DATE,
    col_019 DATE,
    col_020 DECIMAL(15,2),
    col_021 INT,
    col_022 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0093_04 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

