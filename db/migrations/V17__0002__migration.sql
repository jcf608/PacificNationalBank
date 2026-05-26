-- Flyway migration V17.0002
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0002_00 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 INT,
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 VARCHAR(60),
    col_016 INT,
    col_017 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0002_01 (
    col_000 INT,
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 INT,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    col_013 DATE,
    col_014 DECIMAL(15,2),
    col_015 INT,
    col_016 VARCHAR(60),
    col_017 VARCHAR(60),
    col_018 INT,
    col_019 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0002_02 (
    col_000 INT,
    col_001 INT,
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 TIMESTAMP,
    col_013 DATE,
    col_014 TIMESTAMP,
    col_015 DECIMAL(15,2),
    col_016 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0002_03 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 INT,
    col_003 DATE,
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    col_011 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0002_04 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 DATE,
    col_003 INT,
    col_004 DATE,
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 INT,
    col_017 VARCHAR(60),
    col_018 DATE,
    PRIMARY KEY (col_000)
);

