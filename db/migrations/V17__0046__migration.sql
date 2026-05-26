-- Flyway migration V17.0046
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0046_00 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 DATE,
    col_013 DATE,
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    col_017 VARCHAR(60),
    col_018 DATE,
    col_019 DECIMAL(15,2),
    col_020 INT,
    col_021 DATE,
    col_022 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0046_01 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0046_02 (
    col_000 TIMESTAMP,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 DATE,
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0046_03 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 DATE,
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0046_04 (
    col_000 DATE,
    col_001 INT,
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 DECIMAL(15,2),
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 INT,
    col_016 TIMESTAMP,
    col_017 TIMESTAMP,
    col_018 VARCHAR(60),
    col_019 DECIMAL(15,2),
    col_020 DATE,
    col_021 VARCHAR(60),
    col_022 VARCHAR(60),
    col_023 DECIMAL(15,2),
    col_024 DATE,
    PRIMARY KEY (col_000)
);

