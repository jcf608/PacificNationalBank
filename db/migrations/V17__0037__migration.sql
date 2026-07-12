-- Flyway migration V17.0037
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0037_00 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 DATE,
    col_005 DATE,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    col_013 DECIMAL(15,2),
    col_014 VARCHAR(60),
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    col_017 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0037_01 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 DATE,
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    col_013 INT,
    col_014 INT,
    col_015 VARCHAR(60),
    col_016 DATE,
    col_017 TIMESTAMP,
    col_018 DECIMAL(15,2),
    col_019 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0037_02 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 INT,
    col_011 INT,
    col_012 DATE,
    col_013 DATE,
    col_014 INT,
    col_015 VARCHAR(60),
    col_016 DECIMAL(15,2),
    col_017 DATE,
    col_018 DATE,
    col_019 INT,
    col_020 TIMESTAMP,
    col_021 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0037_03 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 INT,
    col_008 INT,
    col_009 DATE,
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    col_012 DECIMAL(15,2),
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 INT,
    col_017 DATE,
    col_018 INT,
    col_019 VARCHAR(60),
    col_020 INT,
    col_021 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0037_04 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 DATE,
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DATE,
    PRIMARY KEY (col_000)
);

