-- Flyway migration V17.0050
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0050_00 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 DATE,
    col_007 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0050_01 (
    col_000 INT,
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 VARCHAR(60),
    col_013 DECIMAL(15,2),
    col_014 DECIMAL(15,2),
    col_015 DECIMAL(15,2),
    col_016 TIMESTAMP,
    col_017 DECIMAL(15,2),
    col_018 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0050_02 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 INT,
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0050_03 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 DECIMAL(15,2),
    col_012 VARCHAR(60),
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 VARCHAR(60),
    col_016 TIMESTAMP,
    col_017 INT,
    col_018 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0050_04 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 DATE,
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 INT,
    col_017 INT,
    col_018 DATE,
    col_019 VARCHAR(60),
    col_020 TIMESTAMP,
    col_021 VARCHAR(60),
    col_022 DECIMAL(15,2),
    col_023 DECIMAL(15,2),
    col_024 INT,
    PRIMARY KEY (col_000)
);

