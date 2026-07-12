-- Flyway migration V17.0005
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0005_00 (
    col_000 DATE,
    col_001 DATE,
    col_002 DATE,
    col_003 DATE,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 INT,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 DATE,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 DATE,
    col_017 VARCHAR(60),
    col_018 DATE,
    col_019 INT,
    col_020 TIMESTAMP,
    col_021 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0005_01 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0005_02 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0005_03 (
    col_000 DATE,
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0005_04 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 INT,
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 INT,
    col_014 DECIMAL(15,2),
    col_015 DATE,
    col_016 VARCHAR(60),
    col_017 VARCHAR(60),
    col_018 TIMESTAMP,
    col_019 DECIMAL(15,2),
    col_020 DECIMAL(15,2),
    col_021 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

