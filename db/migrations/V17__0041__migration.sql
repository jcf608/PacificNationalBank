-- Flyway migration V17.0041
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0041_00 (
    col_000 INT,
    col_001 INT,
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 INT,
    col_011 TIMESTAMP,
    col_012 DECIMAL(15,2),
    col_013 DECIMAL(15,2),
    col_014 DECIMAL(15,2),
    col_015 TIMESTAMP,
    col_016 INT,
    col_017 INT,
    col_018 DECIMAL(15,2),
    col_019 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0041_01 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 INT,
    col_011 DATE,
    col_012 VARCHAR(60),
    col_013 TIMESTAMP,
    col_014 VARCHAR(60),
    col_015 VARCHAR(60),
    col_016 DATE,
    col_017 DECIMAL(15,2),
    col_018 VARCHAR(60),
    col_019 VARCHAR(60),
    col_020 DECIMAL(15,2),
    col_021 INT,
    col_022 DECIMAL(15,2),
    col_023 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0041_02 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 DATE,
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    col_013 DATE,
    col_014 DECIMAL(15,2),
    col_015 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0041_03 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 DATE,
    col_003 DATE,
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0041_04 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 DATE,
    col_012 INT,
    col_013 TIMESTAMP,
    PRIMARY KEY (col_000)
);

