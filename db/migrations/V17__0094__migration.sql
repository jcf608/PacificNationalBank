-- Flyway migration V17.0094
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0094_00 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 DATE,
    col_010 DATE,
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 VARCHAR(60),
    col_015 INT,
    col_016 VARCHAR(60),
    col_017 DATE,
    col_018 TIMESTAMP,
    col_019 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0094_01 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 INT,
    col_011 INT,
    col_012 DATE,
    col_013 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0094_02 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 INT,
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 DECIMAL(15,2),
    col_015 DECIMAL(15,2),
    col_016 DATE,
    col_017 INT,
    col_018 TIMESTAMP,
    col_019 INT,
    col_020 INT,
    col_021 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0094_03 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0094_04 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 INT,
    col_011 TIMESTAMP,
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 DATE,
    col_017 INT,
    col_018 DECIMAL(15,2),
    col_019 VARCHAR(60),
    col_020 DATE,
    PRIMARY KEY (col_000)
);

