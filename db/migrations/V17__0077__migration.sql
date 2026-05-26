-- Flyway migration V17.0077
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0077_00 (
    col_000 TIMESTAMP,
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 DECIMAL(15,2),
    col_014 TIMESTAMP,
    col_015 DATE,
    col_016 VARCHAR(60),
    col_017 DECIMAL(15,2),
    col_018 DATE,
    col_019 DATE,
    col_020 INT,
    col_021 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0077_01 (
    col_000 DATE,
    col_001 INT,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 INT,
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 DATE,
    col_014 DATE,
    col_015 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0077_02 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0077_03 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 DATE,
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 INT,
    col_010 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0077_04 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 DATE,
    col_008 INT,
    col_009 DATE,
    col_010 DATE,
    col_011 DATE,
    col_012 VARCHAR(60),
    col_013 VARCHAR(60),
    col_014 DECIMAL(15,2),
    col_015 TIMESTAMP,
    col_016 INT,
    col_017 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

