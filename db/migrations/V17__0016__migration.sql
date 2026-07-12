-- Flyway migration V17.0016
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0016_00 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 VARCHAR(60),
    col_013 DECIMAL(15,2),
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 INT,
    col_017 VARCHAR(60),
    col_018 DECIMAL(15,2),
    col_019 DATE,
    col_020 TIMESTAMP,
    col_021 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0016_01 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 INT,
    col_013 DATE,
    col_014 INT,
    col_015 VARCHAR(60),
    col_016 INT,
    col_017 DECIMAL(15,2),
    col_018 DATE,
    col_019 TIMESTAMP,
    col_020 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0016_02 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    col_013 DATE,
    col_014 TIMESTAMP,
    col_015 VARCHAR(60),
    col_016 DATE,
    col_017 DATE,
    col_018 TIMESTAMP,
    col_019 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0016_03 (
    col_000 DATE,
    col_001 INT,
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 VARCHAR(60),
    col_015 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0016_04 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

