-- Flyway migration V17.0086
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0086_00 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0086_01 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 DECIMAL(15,2),
    col_014 TIMESTAMP,
    col_015 DECIMAL(15,2),
    col_016 DATE,
    col_017 TIMESTAMP,
    col_018 INT,
    col_019 VARCHAR(60),
    col_020 INT,
    col_021 INT,
    col_022 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0086_02 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0086_03 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 DECIMAL(15,2),
    col_016 INT,
    col_017 INT,
    col_018 INT,
    col_019 DATE,
    col_020 DECIMAL(15,2),
    col_021 INT,
    col_022 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0086_04 (
    col_000 DATE,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 VARCHAR(60),
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 DECIMAL(15,2),
    col_014 DECIMAL(15,2),
    col_015 VARCHAR(60),
    PRIMARY KEY (col_000)
);

