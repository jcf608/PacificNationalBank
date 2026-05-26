-- Flyway migration V17.0017
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0017_00 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 INT,
    col_011 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0017_01 (
    col_000 TIMESTAMP,
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 DATE,
    col_013 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0017_02 (
    col_000 DATE,
    col_001 INT,
    col_002 DATE,
    col_003 DATE,
    col_004 DATE,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0017_03 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 DECIMAL(15,2),
    col_014 DATE,
    col_015 INT,
    col_016 DECIMAL(15,2),
    col_017 INT,
    col_018 DECIMAL(15,2),
    col_019 VARCHAR(60),
    col_020 VARCHAR(60),
    col_021 DATE,
    col_022 TIMESTAMP,
    col_023 VARCHAR(60),
    col_024 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0017_04 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    col_013 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

