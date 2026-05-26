-- Flyway migration V17.0026
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0026_00 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0026_01 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 INT,
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0026_02 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0026_03 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 INT,
    col_008 DATE,
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 VARCHAR(60),
    col_014 DECIMAL(15,2),
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    col_017 TIMESTAMP,
    col_018 TIMESTAMP,
    col_019 INT,
    col_020 VARCHAR(60),
    col_021 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0026_04 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 TIMESTAMP,
    PRIMARY KEY (col_000)
);

