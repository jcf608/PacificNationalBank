-- Flyway migration V17.0068
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0068_00 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 INT,
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 DATE,
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 DATE,
    col_016 VARCHAR(60),
    col_017 INT,
    col_018 DATE,
    col_019 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0068_01 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 DATE,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 VARCHAR(60),
    col_016 VARCHAR(60),
    col_017 INT,
    col_018 VARCHAR(60),
    col_019 INT,
    col_020 VARCHAR(60),
    col_021 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0068_02 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 VARCHAR(60),
    col_009 DECIMAL(15,2),
    col_010 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0068_03 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0068_04 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    col_012 VARCHAR(60),
    col_013 DECIMAL(15,2),
    col_014 DATE,
    col_015 INT,
    col_016 DATE,
    PRIMARY KEY (col_000)
);

