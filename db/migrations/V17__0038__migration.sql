-- Flyway migration V17.0038
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0038_00 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 DATE,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 DATE,
    col_010 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0038_01 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 TIMESTAMP,
    col_012 TIMESTAMP,
    col_013 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0038_02 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 DATE,
    col_011 INT,
    col_012 DECIMAL(15,2),
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 DATE,
    col_016 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0038_03 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    col_013 INT,
    col_014 DECIMAL(15,2),
    col_015 DATE,
    col_016 INT,
    col_017 INT,
    col_018 DATE,
    col_019 VARCHAR(60),
    col_020 VARCHAR(60),
    col_021 DECIMAL(15,2),
    col_022 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0038_04 (
    col_000 INT,
    col_001 INT,
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 INT,
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 VARCHAR(60),
    col_015 INT,
    col_016 INT,
    PRIMARY KEY (col_000)
);

