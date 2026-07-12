-- Flyway migration V17.0082
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0082_00 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 INT,
    col_017 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0082_01 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 VARCHAR(60),
    col_009 INT,
    col_010 DATE,
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 INT,
    col_017 DATE,
    col_018 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0082_02 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 DECIMAL(15,2),
    col_010 DATE,
    col_011 INT,
    col_012 INT,
    col_013 INT,
    col_014 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0082_03 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0082_04 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 VARCHAR(60),
    col_009 INT,
    col_010 INT,
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 VARCHAR(60),
    PRIMARY KEY (col_000)
);

