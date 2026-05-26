-- Flyway migration V17.0030
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0030_00 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 INT,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 TIMESTAMP,
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 DATE,
    col_016 DATE,
    col_017 TIMESTAMP,
    col_018 DATE,
    col_019 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0030_01 (
    col_000 INT,
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0030_02 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 DATE,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 DECIMAL(15,2),
    col_014 VARCHAR(60),
    col_015 INT,
    col_016 VARCHAR(60),
    col_017 DATE,
    col_018 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0030_03 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 INT,
    col_013 DECIMAL(15,2),
    col_014 DECIMAL(15,2),
    col_015 DECIMAL(15,2),
    col_016 TIMESTAMP,
    col_017 INT,
    col_018 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0030_04 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 DATE,
    col_007 TIMESTAMP,
    PRIMARY KEY (col_000)
);

