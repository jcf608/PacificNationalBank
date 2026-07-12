-- Flyway migration V17.0099
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0099_00 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 INT,
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 VARCHAR(60),
    col_011 DATE,
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 INT,
    col_015 DECIMAL(15,2),
    col_016 TIMESTAMP,
    col_017 DECIMAL(15,2),
    col_018 TIMESTAMP,
    col_019 DECIMAL(15,2),
    col_020 TIMESTAMP,
    col_021 DATE,
    col_022 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0099_01 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 DATE,
    col_013 TIMESTAMP,
    col_014 DATE,
    col_015 INT,
    col_016 INT,
    col_017 INT,
    col_018 INT,
    col_019 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0099_02 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 INT,
    col_007 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0099_03 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 INT,
    col_010 INT,
    col_011 INT,
    col_012 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0099_04 (
    col_000 DATE,
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 INT,
    col_011 VARCHAR(60),
    PRIMARY KEY (col_000)
);

