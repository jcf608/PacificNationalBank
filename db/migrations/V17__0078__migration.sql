-- Flyway migration V17.0078
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0078_00 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 TIMESTAMP,
    col_012 VARCHAR(60),
    col_013 DECIMAL(15,2),
    col_014 DATE,
    col_015 INT,
    col_016 VARCHAR(60),
    col_017 DATE,
    col_018 TIMESTAMP,
    col_019 INT,
    col_020 TIMESTAMP,
    col_021 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0078_01 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 DATE,
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 DATE,
    col_017 INT,
    col_018 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0078_02 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 INT,
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 DECIMAL(15,2),
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 DECIMAL(15,2),
    col_016 VARCHAR(60),
    col_017 DATE,
    col_018 TIMESTAMP,
    col_019 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0078_03 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 VARCHAR(60),
    col_010 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0078_04 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 VARCHAR(60),
    PRIMARY KEY (col_000)
);

