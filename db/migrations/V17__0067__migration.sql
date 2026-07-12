-- Flyway migration V17.0067
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0067_00 (
    col_000 INT,
    col_001 DATE,
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 INT,
    col_013 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0067_01 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 INT,
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 INT,
    col_012 VARCHAR(60),
    col_013 INT,
    col_014 DATE,
    col_015 TIMESTAMP,
    col_016 DATE,
    col_017 DATE,
    col_018 DATE,
    col_019 VARCHAR(60),
    col_020 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0067_02 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 DATE,
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 INT,
    col_011 TIMESTAMP,
    col_012 VARCHAR(60),
    col_013 DECIMAL(15,2),
    col_014 DATE,
    col_015 TIMESTAMP,
    col_016 DATE,
    col_017 DECIMAL(15,2),
    col_018 DATE,
    col_019 DECIMAL(15,2),
    col_020 VARCHAR(60),
    col_021 VARCHAR(60),
    col_022 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0067_03 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 DATE,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 INT,
    col_009 INT,
    col_010 DATE,
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 TIMESTAMP,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 INT,
    col_017 DECIMAL(15,2),
    col_018 TIMESTAMP,
    col_019 DATE,
    col_020 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0067_04 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 INT,
    col_010 DATE,
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 INT,
    col_014 DATE,
    col_015 DECIMAL(15,2),
    col_016 TIMESTAMP,
    PRIMARY KEY (col_000)
);

