-- Flyway migration V17.0022
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0022_00 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    col_011 DATE,
    col_012 VARCHAR(60),
    col_013 DECIMAL(15,2),
    col_014 DATE,
    col_015 DATE,
    col_016 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0022_01 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    col_011 TIMESTAMP,
    col_012 DATE,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 TIMESTAMP,
    col_016 VARCHAR(60),
    col_017 TIMESTAMP,
    col_018 VARCHAR(60),
    col_019 DECIMAL(15,2),
    col_020 TIMESTAMP,
    col_021 VARCHAR(60),
    col_022 DECIMAL(15,2),
    col_023 VARCHAR(60),
    col_024 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0022_02 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 DATE,
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 VARCHAR(60),
    col_009 DECIMAL(15,2),
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 DECIMAL(15,2),
    col_013 INT,
    col_014 VARCHAR(60),
    col_015 TIMESTAMP,
    col_016 DECIMAL(15,2),
    col_017 DECIMAL(15,2),
    col_018 INT,
    col_019 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0022_03 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0022_04 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    PRIMARY KEY (col_000)
);

