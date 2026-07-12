-- Flyway migration V17.0051
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0051_00 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0051_01 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 INT,
    col_008 INT,
    col_009 DATE,
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 VARCHAR(60),
    col_014 INT,
    col_015 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0051_02 (
    col_000 DATE,
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 DATE,
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    col_012 DATE,
    col_013 DATE,
    col_014 INT,
    col_015 DECIMAL(15,2),
    col_016 TIMESTAMP,
    col_017 INT,
    col_018 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0051_03 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 INT,
    col_007 INT,
    col_008 DATE,
    col_009 INT,
    col_010 INT,
    col_011 DATE,
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 TIMESTAMP,
    col_015 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0051_04 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 VARCHAR(60),
    col_014 DECIMAL(15,2),
    col_015 VARCHAR(60),
    col_016 INT,
    col_017 DATE,
    col_018 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

