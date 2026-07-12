-- Flyway migration V17.0075
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0075_00 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 INT,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 INT,
    col_017 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0075_01 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0075_02 (
    col_000 DATE,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 INT,
    col_011 DATE,
    col_012 VARCHAR(60),
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 DECIMAL(15,2),
    col_016 INT,
    col_017 INT,
    col_018 DATE,
    col_019 DATE,
    col_020 DATE,
    col_021 INT,
    col_022 DECIMAL(15,2),
    col_023 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0075_03 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    col_013 VARCHAR(60),
    col_014 VARCHAR(60),
    col_015 DATE,
    col_016 DECIMAL(15,2),
    col_017 VARCHAR(60),
    col_018 TIMESTAMP,
    col_019 TIMESTAMP,
    col_020 TIMESTAMP,
    col_021 DATE,
    col_022 INT,
    col_023 INT,
    col_024 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0075_04 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 DATE,
    col_013 VARCHAR(60),
    PRIMARY KEY (col_000)
);

