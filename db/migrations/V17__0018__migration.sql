-- Flyway migration V17.0018
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0018_00 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0018_01 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 INT,
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 DATE,
    col_014 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0018_02 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 DATE,
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 DECIMAL(15,2),
    col_013 INT,
    col_014 DECIMAL(15,2),
    col_015 DATE,
    col_016 VARCHAR(60),
    col_017 TIMESTAMP,
    col_018 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0018_03 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 INT,
    col_011 VARCHAR(60),
    col_012 TIMESTAMP,
    col_013 DECIMAL(15,2),
    col_014 VARCHAR(60),
    col_015 INT,
    col_016 DATE,
    col_017 TIMESTAMP,
    col_018 TIMESTAMP,
    col_019 VARCHAR(60),
    col_020 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0018_04 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 TIMESTAMP,
    PRIMARY KEY (col_000)
);

