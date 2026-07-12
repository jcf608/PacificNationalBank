-- Flyway migration V17.0031
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0031_00 (
    col_000 INT,
    col_001 DATE,
    col_002 INT,
    col_003 DATE,
    col_004 DATE,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0031_01 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 VARCHAR(60),
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    col_013 INT,
    col_014 INT,
    col_015 DECIMAL(15,2),
    col_016 DECIMAL(15,2),
    col_017 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0031_02 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 DATE,
    col_016 TIMESTAMP,
    col_017 INT,
    col_018 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0031_03 (
    col_000 INT,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 DATE,
    col_010 DATE,
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 DATE,
    col_014 INT,
    col_015 INT,
    col_016 DATE,
    col_017 INT,
    col_018 INT,
    col_019 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0031_04 (
    col_000 DATE,
    col_001 DATE,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 DATE,
    col_011 DATE,
    col_012 INT,
    PRIMARY KEY (col_000)
);

