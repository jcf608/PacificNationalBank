-- Flyway migration V17.0049
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0049_00 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 INT,
    col_010 INT,
    col_011 DATE,
    col_012 INT,
    col_013 DATE,
    col_014 DECIMAL(15,2),
    col_015 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0049_01 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0049_02 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0049_03 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 DATE,
    col_013 INT,
    col_014 INT,
    col_015 INT,
    col_016 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0049_04 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 DECIMAL(15,2),
    col_013 INT,
    col_014 INT,
    col_015 INT,
    col_016 TIMESTAMP,
    col_017 DATE,
    col_018 DATE,
    col_019 VARCHAR(60),
    col_020 DATE,
    col_021 TIMESTAMP,
    col_022 INT,
    col_023 DATE,
    col_024 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

