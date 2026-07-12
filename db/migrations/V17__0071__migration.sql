-- Flyway migration V17.0071
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0071_00 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 INT,
    col_011 DATE,
    col_012 INT,
    col_013 VARCHAR(60),
    col_014 DATE,
    col_015 TIMESTAMP,
    col_016 INT,
    col_017 DECIMAL(15,2),
    col_018 INT,
    col_019 INT,
    col_020 INT,
    col_021 VARCHAR(60),
    col_022 DATE,
    col_023 INT,
    col_024 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0071_01 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 VARCHAR(60),
    col_014 VARCHAR(60),
    col_015 TIMESTAMP,
    col_016 DATE,
    col_017 DATE,
    col_018 VARCHAR(60),
    col_019 VARCHAR(60),
    col_020 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0071_02 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0071_03 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0071_04 (
    col_000 TIMESTAMP,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 VARCHAR(60),
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 TIMESTAMP,
    col_017 VARCHAR(60),
    PRIMARY KEY (col_000)
);

