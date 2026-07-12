-- Flyway migration V17.0046
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0046_00 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 INT,
    col_011 TIMESTAMP,
    col_012 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0046_01 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 DECIMAL(15,2),
    col_013 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0046_02 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 DECIMAL(15,2),
    col_017 INT,
    col_018 INT,
    col_019 INT,
    col_020 DATE,
    col_021 INT,
    col_022 DATE,
    col_023 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0046_03 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0046_04 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    PRIMARY KEY (col_000)
);

