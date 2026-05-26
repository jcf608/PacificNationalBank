-- Flyway migration V17.0079
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0079_00 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 INT,
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0079_01 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 DATE,
    col_011 DATE,
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 TIMESTAMP,
    col_015 DATE,
    col_016 TIMESTAMP,
    col_017 DECIMAL(15,2),
    col_018 VARCHAR(60),
    col_019 TIMESTAMP,
    col_020 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0079_02 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 INT,
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 DECIMAL(15,2),
    col_014 DECIMAL(15,2),
    col_015 INT,
    col_016 DATE,
    col_017 DATE,
    col_018 INT,
    col_019 VARCHAR(60),
    col_020 DECIMAL(15,2),
    col_021 DATE,
    col_022 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0079_03 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 DATE,
    col_013 DATE,
    col_014 TIMESTAMP,
    col_015 DATE,
    col_016 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0079_04 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

