-- Flyway migration V17.0085
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0085_00 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0085_01 (
    col_000 DATE,
    col_001 DATE,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 DATE,
    col_010 INT,
    col_011 VARCHAR(60),
    col_012 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0085_02 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 DATE,
    col_011 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0085_03 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 DATE,
    col_011 DATE,
    col_012 DATE,
    col_013 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0085_04 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 DATE,
    col_012 DATE,
    col_013 TIMESTAMP,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 INT,
    col_017 VARCHAR(60),
    col_018 DATE,
    col_019 DATE,
    col_020 DATE,
    col_021 TIMESTAMP,
    PRIMARY KEY (col_000)
);

