-- Flyway migration V17.0023
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0023_00 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 DATE,
    col_012 INT,
    col_013 DATE,
    col_014 DATE,
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    col_017 DECIMAL(15,2),
    col_018 INT,
    col_019 VARCHAR(60),
    col_020 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0023_01 (
    col_000 INT,
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 INT,
    col_007 INT,
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0023_02 (
    col_000 INT,
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 DATE,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 VARCHAR(60),
    col_013 DECIMAL(15,2),
    col_014 DECIMAL(15,2),
    col_015 TIMESTAMP,
    col_016 DECIMAL(15,2),
    col_017 TIMESTAMP,
    col_018 DECIMAL(15,2),
    col_019 INT,
    col_020 TIMESTAMP,
    col_021 DATE,
    col_022 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0023_03 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DATE,
    col_012 VARCHAR(60),
    col_013 DECIMAL(15,2),
    col_014 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0023_04 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 DATE,
    PRIMARY KEY (col_000)
);

