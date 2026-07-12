-- Flyway migration V17.0094
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0094_00 (
    col_000 DATE,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 DECIMAL(15,2),
    col_014 DATE,
    col_015 VARCHAR(60),
    col_016 DECIMAL(15,2),
    col_017 INT,
    col_018 DECIMAL(15,2),
    col_019 INT,
    col_020 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0094_01 (
    col_000 DATE,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 DATE,
    col_008 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0094_02 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 INT,
    col_014 DATE,
    col_015 INT,
    col_016 DATE,
    col_017 DATE,
    col_018 DECIMAL(15,2),
    col_019 TIMESTAMP,
    col_020 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0094_03 (
    col_000 TIMESTAMP,
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0094_04 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 INT,
    col_008 DATE,
    col_009 DATE,
    col_010 INT,
    col_011 DATE,
    col_012 INT,
    col_013 DATE,
    col_014 DATE,
    col_015 DATE,
    col_016 DATE,
    col_017 DATE,
    col_018 DATE,
    PRIMARY KEY (col_000)
);

