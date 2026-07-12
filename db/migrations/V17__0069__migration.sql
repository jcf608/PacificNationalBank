-- Flyway migration V17.0069
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0069_00 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    col_011 TIMESTAMP,
    col_012 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0069_01 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 DECIMAL(15,2),
    col_016 DATE,
    col_017 DATE,
    col_018 VARCHAR(60),
    col_019 INT,
    col_020 DATE,
    col_021 TIMESTAMP,
    col_022 VARCHAR(60),
    col_023 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0069_02 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 INT,
    col_008 INT,
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 DATE,
    col_012 INT,
    col_013 DATE,
    col_014 VARCHAR(60),
    col_015 DATE,
    col_016 VARCHAR(60),
    col_017 INT,
    col_018 VARCHAR(60),
    col_019 VARCHAR(60),
    col_020 DATE,
    col_021 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0069_03 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 INT,
    col_008 INT,
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 DECIMAL(15,2),
    col_016 DECIMAL(15,2),
    col_017 DECIMAL(15,2),
    col_018 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0069_04 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 DATE,
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 INT,
    PRIMARY KEY (col_000)
);

