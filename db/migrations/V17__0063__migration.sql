-- Flyway migration V17.0063
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0063_00 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 DATE,
    col_004 INT,
    col_005 DATE,
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0063_01 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 INT,
    col_004 DATE,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 DATE,
    col_012 DATE,
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 INT,
    col_016 TIMESTAMP,
    col_017 TIMESTAMP,
    col_018 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0063_02 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 DECIMAL(15,2),
    col_013 TIMESTAMP,
    col_014 DECIMAL(15,2),
    col_015 TIMESTAMP,
    col_016 DECIMAL(15,2),
    col_017 DATE,
    col_018 DATE,
    col_019 VARCHAR(60),
    col_020 INT,
    col_021 DECIMAL(15,2),
    col_022 TIMESTAMP,
    col_023 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0063_03 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 VARCHAR(60),
    col_015 DATE,
    col_016 DECIMAL(15,2),
    col_017 INT,
    col_018 DATE,
    col_019 VARCHAR(60),
    col_020 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0063_04 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 INT,
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

