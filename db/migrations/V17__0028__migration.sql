-- Flyway migration V17.0028
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0028_00 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 VARCHAR(60),
    col_014 DATE,
    col_015 INT,
    col_016 VARCHAR(60),
    col_017 VARCHAR(60),
    col_018 DECIMAL(15,2),
    col_019 DATE,
    col_020 INT,
    col_021 VARCHAR(60),
    col_022 INT,
    col_023 VARCHAR(60),
    col_024 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0028_01 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 DECIMAL(15,2),
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0028_02 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 INT,
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0028_03 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0028_04 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 INT,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 VARCHAR(60),
    col_009 INT,
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 INT,
    col_013 INT,
    col_014 TIMESTAMP,
    PRIMARY KEY (col_000)
);

