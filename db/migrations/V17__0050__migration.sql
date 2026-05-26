-- Flyway migration V17.0050
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0050_00 (
    col_000 INT,
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 INT,
    col_011 INT,
    col_012 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0050_01 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 INT,
    col_003 DATE,
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 DECIMAL(15,2),
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0050_02 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    col_013 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0050_03 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0050_04 (
    col_000 INT,
    col_001 INT,
    col_002 DATE,
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

