-- Flyway migration V17.0049
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0049_00 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 INT,
    col_012 INT,
    col_013 DECIMAL(15,2),
    col_014 DECIMAL(15,2),
    col_015 VARCHAR(60),
    col_016 INT,
    col_017 DECIMAL(15,2),
    col_018 INT,
    col_019 TIMESTAMP,
    col_020 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0049_01 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 INT,
    col_010 INT,
    col_011 DECIMAL(15,2),
    col_012 DECIMAL(15,2),
    col_013 DATE,
    col_014 DECIMAL(15,2),
    col_015 VARCHAR(60),
    col_016 INT,
    col_017 VARCHAR(60),
    col_018 DECIMAL(15,2),
    col_019 TIMESTAMP,
    col_020 VARCHAR(60),
    col_021 DECIMAL(15,2),
    col_022 VARCHAR(60),
    col_023 VARCHAR(60),
    col_024 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0049_02 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 INT,
    col_010 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0049_03 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 DECIMAL(15,2),
    col_014 INT,
    col_015 INT,
    col_016 DATE,
    col_017 INT,
    col_018 INT,
    col_019 VARCHAR(60),
    col_020 TIMESTAMP,
    col_021 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0049_04 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 VARCHAR(60),
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 TIMESTAMP,
    PRIMARY KEY (col_000)
);

