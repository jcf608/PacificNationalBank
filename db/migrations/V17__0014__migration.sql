-- Flyway migration V17.0014
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0014_00 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0014_01 (
    col_000 DATE,
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 INT,
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 VARCHAR(60),
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 DECIMAL(15,2),
    col_016 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0014_02 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 DATE,
    col_003 DATE,
    col_004 DATE,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 DATE,
    col_011 INT,
    col_012 DATE,
    col_013 DATE,
    col_014 DATE,
    col_015 TIMESTAMP,
    col_016 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0014_03 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 INT,
    col_015 DECIMAL(15,2),
    col_016 INT,
    col_017 VARCHAR(60),
    col_018 DATE,
    col_019 VARCHAR(60),
    col_020 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0014_04 (
    col_000 DATE,
    col_001 INT,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 VARCHAR(60),
    col_013 VARCHAR(60),
    col_014 VARCHAR(60),
    col_015 VARCHAR(60),
    col_016 VARCHAR(60),
    col_017 DECIMAL(15,2),
    col_018 TIMESTAMP,
    col_019 TIMESTAMP,
    col_020 DECIMAL(15,2),
    col_021 VARCHAR(60),
    col_022 INT,
    col_023 TIMESTAMP,
    PRIMARY KEY (col_000)
);

