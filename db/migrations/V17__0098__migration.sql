-- Flyway migration V17.0098
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0098_00 (
    col_000 DATE,
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 INT,
    col_008 DATE,
    col_009 DATE,
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 DECIMAL(15,2),
    col_016 TIMESTAMP,
    col_017 DATE,
    col_018 INT,
    col_019 DECIMAL(15,2),
    col_020 VARCHAR(60),
    col_021 DECIMAL(15,2),
    col_022 DATE,
    col_023 VARCHAR(60),
    col_024 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0098_01 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 DATE,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 VARCHAR(60),
    col_009 INT,
    col_010 DATE,
    col_011 INT,
    col_012 INT,
    col_013 DATE,
    col_014 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0098_02 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 DATE,
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0098_03 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 VARCHAR(60),
    col_012 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0098_04 (
    col_000 DATE,
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 DATE,
    col_012 INT,
    col_013 DATE,
    col_014 DECIMAL(15,2),
    col_015 DATE,
    col_016 VARCHAR(60),
    col_017 VARCHAR(60),
    PRIMARY KEY (col_000)
);

