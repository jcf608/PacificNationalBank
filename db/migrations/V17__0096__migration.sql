-- Flyway migration V17.0096
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0096_00 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0096_01 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 DATE,
    col_003 DATE,
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 DECIMAL(15,2),
    col_014 DATE,
    col_015 DECIMAL(15,2),
    col_016 INT,
    col_017 DATE,
    col_018 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0096_02 (
    col_000 INT,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    col_012 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0096_03 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 DATE,
    col_004 DATE,
    col_005 DATE,
    col_006 DATE,
    col_007 DATE,
    col_008 INT,
    col_009 DATE,
    col_010 INT,
    col_011 INT,
    col_012 DATE,
    col_013 VARCHAR(60),
    col_014 DECIMAL(15,2),
    col_015 DATE,
    col_016 DECIMAL(15,2),
    col_017 INT,
    col_018 VARCHAR(60),
    col_019 INT,
    col_020 VARCHAR(60),
    col_021 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0096_04 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 INT,
    col_016 INT,
    col_017 INT,
    col_018 DECIMAL(15,2),
    col_019 TIMESTAMP,
    col_020 DECIMAL(15,2),
    col_021 TIMESTAMP,
    col_022 INT,
    col_023 VARCHAR(60),
    PRIMARY KEY (col_000)
);

