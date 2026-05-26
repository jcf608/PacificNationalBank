-- Flyway migration V17.0008
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0008_00 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 DATE,
    col_004 INT,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 VARCHAR(60),
    col_011 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0008_01 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 VARCHAR(60),
    col_015 DATE,
    col_016 TIMESTAMP,
    col_017 DECIMAL(15,2),
    col_018 INT,
    col_019 TIMESTAMP,
    col_020 DATE,
    col_021 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0008_02 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 DATE,
    col_011 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0008_03 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 INT,
    col_004 INT,
    col_005 DATE,
    col_006 DATE,
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 DATE,
    col_016 INT,
    col_017 INT,
    col_018 TIMESTAMP,
    col_019 DECIMAL(15,2),
    col_020 INT,
    col_021 VARCHAR(60),
    col_022 TIMESTAMP,
    col_023 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0008_04 (
    col_000 INT,
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 DATE,
    col_013 TIMESTAMP,
    col_014 INT,
    col_015 VARCHAR(60),
    col_016 INT,
    col_017 INT,
    col_018 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

