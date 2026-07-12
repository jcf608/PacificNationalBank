-- Flyway migration V17.0003
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0003_00 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 INT,
    col_010 DATE,
    col_011 TIMESTAMP,
    col_012 TIMESTAMP,
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0003_01 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 DATE,
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 VARCHAR(60),
    col_013 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0003_02 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 VARCHAR(60),
    col_011 VARCHAR(60),
    col_012 DATE,
    col_013 DATE,
    col_014 VARCHAR(60),
    col_015 VARCHAR(60),
    col_016 TIMESTAMP,
    col_017 VARCHAR(60),
    col_018 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0003_03 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 DATE,
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 INT,
    col_015 INT,
    col_016 INT,
    col_017 TIMESTAMP,
    col_018 DECIMAL(15,2),
    col_019 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0003_04 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 DATE,
    col_004 DATE,
    col_005 INT,
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 DATE,
    col_011 TIMESTAMP,
    col_012 VARCHAR(60),
    col_013 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

