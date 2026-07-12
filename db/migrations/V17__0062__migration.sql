-- Flyway migration V17.0062
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0062_00 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 INT,
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0062_01 (
    col_000 INT,
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    col_012 DATE,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0062_02 (
    col_000 DATE,
    col_001 INT,
    col_002 DATE,
    col_003 INT,
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 DECIMAL(15,2),
    col_012 VARCHAR(60),
    col_013 TIMESTAMP,
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 VARCHAR(60),
    col_017 DATE,
    col_018 TIMESTAMP,
    col_019 INT,
    col_020 DECIMAL(15,2),
    col_021 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0062_03 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0062_04 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 DATE,
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 DATE,
    col_014 INT,
    col_015 DECIMAL(15,2),
    col_016 INT,
    col_017 VARCHAR(60),
    col_018 TIMESTAMP,
    col_019 TIMESTAMP,
    col_020 DECIMAL(15,2),
    col_021 DECIMAL(15,2),
    col_022 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

