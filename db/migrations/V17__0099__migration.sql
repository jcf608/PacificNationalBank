-- Flyway migration V17.0099
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0099_00 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 DATE,
    col_004 DATE,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 INT,
    col_014 DECIMAL(15,2),
    col_015 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0099_01 (
    col_000 TIMESTAMP,
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0099_02 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0099_03 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 INT,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 DECIMAL(15,2),
    col_013 INT,
    col_014 DECIMAL(15,2),
    col_015 DECIMAL(15,2),
    col_016 VARCHAR(60),
    col_017 VARCHAR(60),
    col_018 DATE,
    col_019 VARCHAR(60),
    col_020 VARCHAR(60),
    col_021 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0099_04 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 INT,
    col_010 INT,
    col_011 TIMESTAMP,
    col_012 DECIMAL(15,2),
    col_013 TIMESTAMP,
    PRIMARY KEY (col_000)
);

