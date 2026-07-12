-- Flyway migration V17.0083
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0083_00 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DATE,
    col_012 DATE,
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0083_01 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 INT,
    col_004 DATE,
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 INT,
    col_010 INT,
    col_011 INT,
    col_012 INT,
    col_013 DECIMAL(15,2),
    col_014 DATE,
    col_015 DECIMAL(15,2),
    col_016 DECIMAL(15,2),
    col_017 DECIMAL(15,2),
    col_018 VARCHAR(60),
    col_019 TIMESTAMP,
    col_020 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0083_02 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0083_03 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 DATE,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 DATE,
    col_014 VARCHAR(60),
    col_015 DATE,
    col_016 DATE,
    col_017 DATE,
    col_018 TIMESTAMP,
    col_019 TIMESTAMP,
    col_020 INT,
    col_021 DECIMAL(15,2),
    col_022 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0083_04 (
    col_000 DATE,
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

