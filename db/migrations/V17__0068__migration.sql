-- Flyway migration V17.0068
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0068_00 (
    col_000 INT,
    col_001 DATE,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0068_01 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 DATE,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 VARCHAR(60),
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 DATE,
    col_016 DECIMAL(15,2),
    col_017 TIMESTAMP,
    col_018 DATE,
    col_019 DATE,
    col_020 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0068_02 (
    col_000 DATE,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 INT,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 DATE,
    col_016 VARCHAR(60),
    col_017 TIMESTAMP,
    col_018 TIMESTAMP,
    col_019 DATE,
    col_020 INT,
    col_021 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0068_03 (
    col_000 DATE,
    col_001 INT,
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 VARCHAR(60),
    col_009 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0068_04 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 DATE,
    PRIMARY KEY (col_000)
);

