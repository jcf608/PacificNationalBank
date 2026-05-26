-- Flyway migration V17.0086
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0086_00 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 INT,
    col_010 DATE,
    col_011 DATE,
    col_012 VARCHAR(60),
    col_013 DATE,
    col_014 TIMESTAMP,
    col_015 INT,
    col_016 DATE,
    col_017 DATE,
    col_018 VARCHAR(60),
    col_019 DECIMAL(15,2),
    col_020 INT,
    col_021 DECIMAL(15,2),
    col_022 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0086_01 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 DATE,
    col_011 DATE,
    col_012 INT,
    col_013 DATE,
    col_014 DECIMAL(15,2),
    col_015 TIMESTAMP,
    col_016 DECIMAL(15,2),
    col_017 INT,
    col_018 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0086_02 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 DATE,
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 DATE,
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 DECIMAL(15,2),
    col_012 TIMESTAMP,
    col_013 VARCHAR(60),
    col_014 VARCHAR(60),
    col_015 INT,
    col_016 INT,
    col_017 INT,
    col_018 DECIMAL(15,2),
    col_019 DECIMAL(15,2),
    col_020 TIMESTAMP,
    col_021 VARCHAR(60),
    col_022 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0086_03 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 INT,
    col_009 INT,
    col_010 INT,
    col_011 VARCHAR(60),
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 DECIMAL(15,2),
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    col_017 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0086_04 (
    col_000 DATE,
    col_001 DATE,
    col_002 VARCHAR(60),
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    PRIMARY KEY (col_000)
);

