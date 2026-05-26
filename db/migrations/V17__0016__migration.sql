-- Flyway migration V17.0016
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0016_00 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 VARCHAR(60),
    col_013 INT,
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 DECIMAL(15,2),
    col_017 DECIMAL(15,2),
    col_018 TIMESTAMP,
    col_019 DATE,
    col_020 DATE,
    col_021 TIMESTAMP,
    col_022 INT,
    col_023 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0016_01 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 DATE,
    col_011 INT,
    col_012 INT,
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 VARCHAR(60),
    col_017 INT,
    col_018 INT,
    col_019 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0016_02 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0016_03 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 DECIMAL(15,2),
    col_014 DECIMAL(15,2),
    col_015 TIMESTAMP,
    col_016 VARCHAR(60),
    col_017 TIMESTAMP,
    col_018 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0016_04 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 VARCHAR(60),
    col_016 DECIMAL(15,2),
    col_017 TIMESTAMP,
    col_018 DATE,
    col_019 VARCHAR(60),
    col_020 TIMESTAMP,
    col_021 DATE,
    col_022 VARCHAR(60),
    col_023 DATE,
    PRIMARY KEY (col_000)
);

