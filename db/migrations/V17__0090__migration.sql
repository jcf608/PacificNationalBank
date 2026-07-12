-- Flyway migration V17.0090
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0090_00 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 DATE,
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0090_01 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    col_011 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0090_02 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 DATE,
    col_010 DATE,
    col_011 INT,
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 VARCHAR(60),
    col_015 INT,
    col_016 TIMESTAMP,
    col_017 DATE,
    col_018 DECIMAL(15,2),
    col_019 VARCHAR(60),
    col_020 DECIMAL(15,2),
    col_021 DATE,
    col_022 INT,
    col_023 DECIMAL(15,2),
    col_024 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0090_03 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 INT,
    col_011 TIMESTAMP,
    col_012 VARCHAR(60),
    col_013 DATE,
    col_014 VARCHAR(60),
    col_015 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0090_04 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 TIMESTAMP,
    col_014 TIMESTAMP,
    col_015 VARCHAR(60),
    col_016 VARCHAR(60),
    col_017 INT,
    col_018 DATE,
    col_019 DECIMAL(15,2),
    col_020 VARCHAR(60),
    PRIMARY KEY (col_000)
);

