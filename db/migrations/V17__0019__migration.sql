-- Flyway migration V17.0019
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0019_00 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 INT,
    col_005 DATE,
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 INT,
    col_010 INT,
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0019_01 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 INT,
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 DATE,
    col_017 INT,
    col_018 DECIMAL(15,2),
    col_019 DECIMAL(15,2),
    col_020 INT,
    col_021 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0019_02 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 INT,
    col_006 DATE,
    col_007 DATE,
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 DECIMAL(15,2),
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 DECIMAL(15,2),
    col_016 TIMESTAMP,
    col_017 VARCHAR(60),
    col_018 TIMESTAMP,
    col_019 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0019_03 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0019_04 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    col_013 TIMESTAMP,
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 INT,
    col_017 VARCHAR(60),
    col_018 TIMESTAMP,
    col_019 DATE,
    col_020 DECIMAL(15,2),
    col_021 VARCHAR(60),
    PRIMARY KEY (col_000)
);

