-- Flyway migration V17.0027
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0027_00 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 VARCHAR(60),
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    col_013 VARCHAR(60),
    col_014 DECIMAL(15,2),
    col_015 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0027_01 (
    col_000 DATE,
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 INT,
    col_010 INT,
    col_011 TIMESTAMP,
    col_012 TIMESTAMP,
    col_013 VARCHAR(60),
    col_014 DATE,
    col_015 DECIMAL(15,2),
    col_016 DATE,
    col_017 DATE,
    col_018 DATE,
    col_019 INT,
    col_020 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0027_02 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0027_03 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 DATE,
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 DATE,
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 DECIMAL(15,2),
    col_016 TIMESTAMP,
    col_017 DECIMAL(15,2),
    col_018 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0027_04 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 DATE,
    col_008 INT,
    col_009 INT,
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 TIMESTAMP,
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 DATE,
    col_017 INT,
    col_018 TIMESTAMP,
    col_019 VARCHAR(60),
    col_020 DATE,
    col_021 INT,
    col_022 VARCHAR(60),
    col_023 DATE,
    PRIMARY KEY (col_000)
);

