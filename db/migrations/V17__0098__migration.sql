-- Flyway migration V17.0098
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0098_00 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 INT,
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 DECIMAL(15,2),
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 TIMESTAMP,
    col_016 DATE,
    col_017 TIMESTAMP,
    col_018 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0098_01 (
    col_000 VARCHAR(60),
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 TIMESTAMP,
    col_009 INT,
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 DATE,
    col_013 DECIMAL(15,2),
    col_014 DATE,
    col_015 DATE,
    col_016 DATE,
    col_017 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0098_02 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 DECIMAL(15,2),
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 INT,
    col_013 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0098_03 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 DECIMAL(15,2),
    col_015 DATE,
    col_016 DECIMAL(15,2),
    col_017 TIMESTAMP,
    col_018 DECIMAL(15,2),
    col_019 TIMESTAMP,
    col_020 TIMESTAMP,
    col_021 VARCHAR(60),
    col_022 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0098_04 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 INT,
    col_010 INT,
    col_011 DATE,
    col_012 DATE,
    col_013 VARCHAR(60),
    col_014 DATE,
    col_015 INT,
    col_016 TIMESTAMP,
    col_017 VARCHAR(60),
    col_018 DECIMAL(15,2),
    col_019 DECIMAL(15,2),
    col_020 INT,
    PRIMARY KEY (col_000)
);

