-- Flyway migration V17.0011
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0011_00 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 DATE,
    col_014 TIMESTAMP,
    col_015 DATE,
    col_016 INT,
    col_017 VARCHAR(60),
    col_018 DECIMAL(15,2),
    col_019 INT,
    col_020 INT,
    col_021 VARCHAR(60),
    col_022 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0011_01 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 DATE,
    col_003 DATE,
    col_004 DATE,
    col_005 DATE,
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 DATE,
    col_010 INT,
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 VARCHAR(60),
    col_014 DATE,
    col_015 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0011_02 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 INT,
    col_009 INT,
    col_010 DATE,
    col_011 TIMESTAMP,
    col_012 DATE,
    col_013 DECIMAL(15,2),
    col_014 DATE,
    col_015 INT,
    col_016 DATE,
    col_017 VARCHAR(60),
    col_018 INT,
    col_019 TIMESTAMP,
    col_020 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0011_03 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 VARCHAR(60),
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0011_04 (
    col_000 TIMESTAMP,
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 INT,
    col_006 INT,
    col_007 DATE,
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 DATE,
    col_014 INT,
    col_015 INT,
    col_016 DECIMAL(15,2),
    col_017 VARCHAR(60),
    col_018 VARCHAR(60),
    col_019 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

