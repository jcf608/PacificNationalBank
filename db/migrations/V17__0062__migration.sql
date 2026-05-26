-- Flyway migration V17.0062
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0062_00 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 VARCHAR(60),
    col_014 VARCHAR(60),
    col_015 INT,
    col_016 VARCHAR(60),
    col_017 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0062_01 (
    col_000 INT,
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0062_02 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 VARCHAR(60),
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    col_017 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0062_03 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0062_04 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 TIMESTAMP,
    col_014 TIMESTAMP,
    col_015 DATE,
    col_016 TIMESTAMP,
    col_017 INT,
    col_018 INT,
    col_019 INT,
    col_020 DECIMAL(15,2),
    col_021 TIMESTAMP,
    col_022 VARCHAR(60),
    col_023 DATE,
    col_024 TIMESTAMP,
    PRIMARY KEY (col_000)
);

