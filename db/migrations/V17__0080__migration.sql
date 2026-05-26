-- Flyway migration V17.0080
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0080_00 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0080_01 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 DATE,
    col_013 VARCHAR(60),
    col_014 DECIMAL(15,2),
    col_015 TIMESTAMP,
    col_016 VARCHAR(60),
    col_017 INT,
    col_018 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0080_02 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 INT,
    col_008 DATE,
    col_009 DATE,
    col_010 INT,
    col_011 TIMESTAMP,
    col_012 VARCHAR(60),
    col_013 DATE,
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 VARCHAR(60),
    col_017 INT,
    col_018 TIMESTAMP,
    col_019 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0080_03 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 DATE,
    col_005 INT,
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 INT,
    col_016 INT,
    col_017 VARCHAR(60),
    col_018 TIMESTAMP,
    col_019 DECIMAL(15,2),
    col_020 DATE,
    col_021 DATE,
    col_022 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0080_04 (
    col_000 INT,
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 INT,
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 VARCHAR(60),
    col_013 DATE,
    col_014 DATE,
    col_015 DATE,
    col_016 INT,
    col_017 DATE,
    col_018 VARCHAR(60),
    col_019 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

