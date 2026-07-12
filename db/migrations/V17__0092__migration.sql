-- Flyway migration V17.0092
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0092_00 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 INT,
    col_011 TIMESTAMP,
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 DATE,
    col_015 DATE,
    col_016 INT,
    col_017 TIMESTAMP,
    col_018 DECIMAL(15,2),
    col_019 DECIMAL(15,2),
    col_020 DECIMAL(15,2),
    col_021 DECIMAL(15,2),
    col_022 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0092_01 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 DATE,
    col_006 INT,
    col_007 DATE,
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 INT,
    col_017 VARCHAR(60),
    col_018 DATE,
    col_019 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0092_02 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 VARCHAR(60),
    col_009 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0092_03 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 VARCHAR(60),
    col_011 TIMESTAMP,
    col_012 DATE,
    col_013 TIMESTAMP,
    col_014 DECIMAL(15,2),
    col_015 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0092_04 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 INT,
    PRIMARY KEY (col_000)
);

