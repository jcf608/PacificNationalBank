-- Flyway migration V17.0054
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0054_00 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 DATE,
    col_013 DATE,
    col_014 VARCHAR(60),
    col_015 DECIMAL(15,2),
    col_016 DECIMAL(15,2),
    col_017 TIMESTAMP,
    col_018 DATE,
    col_019 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0054_01 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 INT,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 INT,
    col_008 INT,
    col_009 DATE,
    col_010 DATE,
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 DECIMAL(15,2),
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 DECIMAL(15,2),
    col_017 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0054_02 (
    col_000 INT,
    col_001 INT,
    col_002 DATE,
    col_003 DATE,
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 VARCHAR(60),
    col_014 INT,
    col_015 DECIMAL(15,2),
    col_016 DECIMAL(15,2),
    col_017 INT,
    col_018 VARCHAR(60),
    col_019 INT,
    col_020 TIMESTAMP,
    col_021 TIMESTAMP,
    col_022 TIMESTAMP,
    col_023 TIMESTAMP,
    col_024 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0054_03 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0054_04 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 VARCHAR(60),
    col_015 TIMESTAMP,
    col_016 DATE,
    PRIMARY KEY (col_000)
);

