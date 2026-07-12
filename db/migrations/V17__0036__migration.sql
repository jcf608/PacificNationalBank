-- Flyway migration V17.0036
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0036_00 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 VARCHAR(60),
    col_014 DECIMAL(15,2),
    col_015 DECIMAL(15,2),
    col_016 DATE,
    col_017 DATE,
    col_018 INT,
    col_019 DATE,
    col_020 TIMESTAMP,
    col_021 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0036_01 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DATE,
    col_012 INT,
    col_013 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0036_02 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0036_03 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 DATE,
    col_014 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0036_04 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 DATE,
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 VARCHAR(60),
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    col_017 DATE,
    col_018 TIMESTAMP,
    col_019 INT,
    col_020 VARCHAR(60),
    col_021 DECIMAL(15,2),
    col_022 INT,
    col_023 INT,
    col_024 INT,
    PRIMARY KEY (col_000)
);

