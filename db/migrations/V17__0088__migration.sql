-- Flyway migration V17.0088
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0088_00 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 INT,
    col_011 INT,
    col_012 DECIMAL(15,2),
    col_013 VARCHAR(60),
    col_014 TIMESTAMP,
    col_015 DATE,
    col_016 INT,
    col_017 VARCHAR(60),
    col_018 DATE,
    col_019 INT,
    col_020 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0088_01 (
    col_000 TIMESTAMP,
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 INT,
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0088_02 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 TIMESTAMP,
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0088_03 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0088_04 (
    col_000 DATE,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 INT,
    col_009 DATE,
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 DATE,
    col_016 DATE,
    col_017 TIMESTAMP,
    PRIMARY KEY (col_000)
);

