-- Flyway migration V17.0010
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0010_00 (
    col_000 INT,
    col_001 INT,
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    col_011 DATE,
    col_012 DATE,
    col_013 DATE,
    col_014 DECIMAL(15,2),
    col_015 VARCHAR(60),
    col_016 TIMESTAMP,
    col_017 DATE,
    col_018 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0010_01 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0010_02 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0010_03 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0010_04 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 DATE,
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 DATE,
    col_017 DATE,
    PRIMARY KEY (col_000)
);

