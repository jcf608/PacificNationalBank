-- Flyway migration V17.0087
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0087_00 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 DATE,
    col_013 DATE,
    col_014 VARCHAR(60),
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    col_017 DECIMAL(15,2),
    col_018 DECIMAL(15,2),
    col_019 DECIMAL(15,2),
    col_020 DECIMAL(15,2),
    col_021 INT,
    col_022 VARCHAR(60),
    col_023 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0087_01 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 INT,
    col_008 INT,
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 VARCHAR(60),
    col_013 DATE,
    col_014 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0087_02 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    col_011 TIMESTAMP,
    col_012 VARCHAR(60),
    col_013 INT,
    col_014 VARCHAR(60),
    col_015 INT,
    col_016 DECIMAL(15,2),
    col_017 DECIMAL(15,2),
    col_018 DATE,
    col_019 INT,
    col_020 DATE,
    col_021 INT,
    col_022 INT,
    col_023 INT,
    col_024 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0087_03 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 DATE,
    col_006 INT,
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0087_04 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 DATE,
    col_008 INT,
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 INT,
    col_016 DECIMAL(15,2),
    col_017 VARCHAR(60),
    col_018 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

