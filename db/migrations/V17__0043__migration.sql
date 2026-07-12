-- Flyway migration V17.0043
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0043_00 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    col_012 DECIMAL(15,2),
    col_013 DATE,
    col_014 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0043_01 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 DATE,
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 DATE,
    col_014 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0043_02 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 DATE,
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 INT,
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 TIMESTAMP,
    col_012 VARCHAR(60),
    col_013 TIMESTAMP,
    col_014 VARCHAR(60),
    col_015 VARCHAR(60),
    col_016 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0043_03 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 TIMESTAMP,
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 DECIMAL(15,2),
    col_017 DECIMAL(15,2),
    col_018 VARCHAR(60),
    col_019 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0043_04 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

