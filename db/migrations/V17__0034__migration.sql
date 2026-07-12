-- Flyway migration V17.0034
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0034_00 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 DATE,
    col_015 VARCHAR(60),
    col_016 TIMESTAMP,
    col_017 VARCHAR(60),
    col_018 DECIMAL(15,2),
    col_019 DECIMAL(15,2),
    col_020 DECIMAL(15,2),
    col_021 DATE,
    col_022 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0034_01 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 DATE,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0034_02 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 DATE,
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0034_03 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    col_013 TIMESTAMP,
    col_014 TIMESTAMP,
    col_015 DATE,
    col_016 TIMESTAMP,
    col_017 DECIMAL(15,2),
    col_018 INT,
    col_019 VARCHAR(60),
    col_020 INT,
    col_021 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0034_04 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 INT,
    col_011 DATE,
    col_012 VARCHAR(60),
    col_013 TIMESTAMP,
    col_014 TIMESTAMP,
    col_015 DATE,
    col_016 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

