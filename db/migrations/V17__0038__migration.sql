-- Flyway migration V17.0038
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0038_00 (
    col_000 INT,
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 INT,
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 DATE,
    col_014 DATE,
    col_015 TIMESTAMP,
    col_016 DATE,
    col_017 TIMESTAMP,
    col_018 DECIMAL(15,2),
    col_019 TIMESTAMP,
    col_020 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0038_01 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0038_02 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 DATE,
    col_008 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0038_03 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    col_013 DATE,
    col_014 TIMESTAMP,
    col_015 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0038_04 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 DECIMAL(15,2),
    col_013 TIMESTAMP,
    col_014 TIMESTAMP,
    col_015 DATE,
    PRIMARY KEY (col_000)
);

