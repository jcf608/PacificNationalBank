-- Flyway migration V17.0052
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0052_00 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 INT,
    col_011 DATE,
    col_012 VARCHAR(60),
    col_013 VARCHAR(60),
    col_014 DECIMAL(15,2),
    col_015 DATE,
    col_016 DATE,
    col_017 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0052_01 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 DATE,
    col_007 INT,
    col_008 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0052_02 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 DATE,
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0052_03 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 VARCHAR(60),
    col_016 DECIMAL(15,2),
    col_017 DECIMAL(15,2),
    col_018 DATE,
    col_019 VARCHAR(60),
    col_020 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0052_04 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 DATE,
    col_013 DECIMAL(15,2),
    col_014 VARCHAR(60),
    col_015 DATE,
    col_016 INT,
    col_017 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

