-- Flyway migration V17.0045
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0045_00 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    col_013 DATE,
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 VARCHAR(60),
    col_017 VARCHAR(60),
    col_018 VARCHAR(60),
    col_019 INT,
    col_020 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0045_01 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0045_02 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 VARCHAR(60),
    col_013 VARCHAR(60),
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 DATE,
    col_017 VARCHAR(60),
    col_018 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0045_03 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 DECIMAL(15,2),
    col_014 VARCHAR(60),
    col_015 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0045_04 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 INT,
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 DECIMAL(15,2),
    col_011 DECIMAL(15,2),
    col_012 DECIMAL(15,2),
    col_013 TIMESTAMP,
    col_014 INT,
    col_015 INT,
    col_016 VARCHAR(60),
    col_017 DECIMAL(15,2),
    col_018 DECIMAL(15,2),
    col_019 DECIMAL(15,2),
    col_020 INT,
    col_021 TIMESTAMP,
    col_022 VARCHAR(60),
    PRIMARY KEY (col_000)
);

