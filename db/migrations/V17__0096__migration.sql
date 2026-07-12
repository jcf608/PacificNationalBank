-- Flyway migration V17.0096
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0096_00 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0096_01 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 INT,
    col_011 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0096_02 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 DATE,
    col_003 INT,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 VARCHAR(60),
    col_011 VARCHAR(60),
    col_012 DATE,
    col_013 VARCHAR(60),
    col_014 DECIMAL(15,2),
    col_015 DECIMAL(15,2),
    col_016 TIMESTAMP,
    col_017 VARCHAR(60),
    col_018 DECIMAL(15,2),
    col_019 DECIMAL(15,2),
    col_020 INT,
    col_021 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0096_03 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    col_011 DATE,
    col_012 INT,
    col_013 VARCHAR(60),
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 VARCHAR(60),
    col_017 VARCHAR(60),
    col_018 VARCHAR(60),
    col_019 INT,
    col_020 DATE,
    col_021 TIMESTAMP,
    col_022 DATE,
    col_023 DECIMAL(15,2),
    col_024 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0096_04 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 INT,
    PRIMARY KEY (col_000)
);

