-- Flyway migration V17.0037
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0037_00 (
    col_000 INT,
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 DECIMAL(15,2),
    col_013 VARCHAR(60),
    col_014 DATE,
    col_015 INT,
    col_016 DECIMAL(15,2),
    col_017 INT,
    col_018 VARCHAR(60),
    col_019 VARCHAR(60),
    col_020 DATE,
    col_021 INT,
    col_022 DECIMAL(15,2),
    col_023 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0037_01 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 DATE,
    col_006 DATE,
    col_007 DATE,
    col_008 DATE,
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 VARCHAR(60),
    col_012 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0037_02 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 VARCHAR(60),
    col_013 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0037_03 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 INT,
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 DATE,
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 DATE,
    col_016 INT,
    col_017 DECIMAL(15,2),
    col_018 DECIMAL(15,2),
    col_019 DATE,
    col_020 VARCHAR(60),
    col_021 DECIMAL(15,2),
    col_022 DECIMAL(15,2),
    col_023 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0037_04 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 TIMESTAMP,
    col_013 VARCHAR(60),
    PRIMARY KEY (col_000)
);

