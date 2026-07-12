-- Flyway migration V17.0066
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0066_00 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 DATE,
    col_012 DATE,
    col_013 VARCHAR(60),
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    col_017 VARCHAR(60),
    col_018 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0066_01 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 DECIMAL(15,2),
    col_012 DECIMAL(15,2),
    col_013 INT,
    col_014 DATE,
    col_015 VARCHAR(60),
    col_016 DECIMAL(15,2),
    col_017 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0066_02 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0066_03 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 INT,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 DECIMAL(15,2),
    col_015 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0066_04 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 DATE,
    col_007 DATE,
    col_008 INT,
    col_009 INT,
    PRIMARY KEY (col_000)
);

