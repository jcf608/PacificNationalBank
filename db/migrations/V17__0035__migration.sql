-- Flyway migration V17.0035
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0035_00 (
    col_000 INT,
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 DATE,
    col_007 INT,
    col_008 INT,
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 DECIMAL(15,2),
    col_013 DATE,
    col_014 DECIMAL(15,2),
    col_015 DATE,
    col_016 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0035_01 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 DECIMAL(15,2),
    col_013 DECIMAL(15,2),
    col_014 DECIMAL(15,2),
    col_015 VARCHAR(60),
    col_016 DECIMAL(15,2),
    col_017 VARCHAR(60),
    col_018 DATE,
    col_019 VARCHAR(60),
    col_020 INT,
    col_021 DECIMAL(15,2),
    col_022 INT,
    col_023 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0035_02 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 DATE,
    col_011 TIMESTAMP,
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 INT,
    col_015 DECIMAL(15,2),
    col_016 INT,
    col_017 VARCHAR(60),
    col_018 INT,
    col_019 VARCHAR(60),
    col_020 DATE,
    col_021 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0035_03 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0035_04 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 INT,
    col_005 DATE,
    col_006 DATE,
    col_007 INT,
    PRIMARY KEY (col_000)
);

