-- Flyway migration V17.0064
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0064_00 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 INT,
    col_011 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0064_01 (
    col_000 DATE,
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 VARCHAR(60),
    col_014 VARCHAR(60),
    col_015 TIMESTAMP,
    col_016 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0064_02 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 INT,
    col_007 DATE,
    col_008 DATE,
    col_009 DATE,
    col_010 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0064_03 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 INT,
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 DECIMAL(15,2),
    col_013 VARCHAR(60),
    col_014 VARCHAR(60),
    col_015 VARCHAR(60),
    col_016 DECIMAL(15,2),
    col_017 DATE,
    col_018 DATE,
    col_019 DECIMAL(15,2),
    col_020 VARCHAR(60),
    col_021 DECIMAL(15,2),
    col_022 DATE,
    col_023 DATE,
    col_024 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0064_04 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 DATE,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 DATE,
    col_016 DECIMAL(15,2),
    col_017 TIMESTAMP,
    col_018 INT,
    col_019 DATE,
    col_020 TIMESTAMP,
    PRIMARY KEY (col_000)
);

