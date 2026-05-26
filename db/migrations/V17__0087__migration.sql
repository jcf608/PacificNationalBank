-- Flyway migration V17.0087
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0087_00 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 INT,
    col_014 DECIMAL(15,2),
    col_015 VARCHAR(60),
    col_016 DECIMAL(15,2),
    col_017 DATE,
    col_018 DATE,
    col_019 VARCHAR(60),
    col_020 DECIMAL(15,2),
    col_021 DATE,
    col_022 INT,
    col_023 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0087_01 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 INT,
    col_004 DATE,
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 DECIMAL(15,2),
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 DATE,
    col_014 DATE,
    col_015 DATE,
    col_016 TIMESTAMP,
    col_017 INT,
    col_018 VARCHAR(60),
    col_019 DATE,
    col_020 DECIMAL(15,2),
    col_021 VARCHAR(60),
    col_022 TIMESTAMP,
    col_023 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0087_02 (
    col_000 INT,
    col_001 INT,
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0087_03 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 DATE,
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 INT,
    col_007 INT,
    col_008 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0087_04 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 INT,
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 INT,
    col_014 VARCHAR(60),
    col_015 VARCHAR(60),
    PRIMARY KEY (col_000)
);

