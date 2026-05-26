-- Flyway migration V17.0048
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0048_00 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 DATE,
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 VARCHAR(60),
    col_016 DATE,
    col_017 INT,
    col_018 VARCHAR(60),
    col_019 TIMESTAMP,
    col_020 DECIMAL(15,2),
    col_021 DATE,
    col_022 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0048_01 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 DECIMAL(15,2),
    col_012 DECIMAL(15,2),
    col_013 DECIMAL(15,2),
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 DECIMAL(15,2),
    col_017 VARCHAR(60),
    col_018 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0048_02 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 DATE,
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0048_03 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0048_04 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 DECIMAL(15,2),
    col_017 TIMESTAMP,
    col_018 INT,
    col_019 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

