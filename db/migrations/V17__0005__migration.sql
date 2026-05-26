-- Flyway migration V17.0005
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0005_00 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 DATE,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 DATE,
    col_006 DATE,
    col_007 DATE,
    col_008 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0005_01 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 DATE,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 INT,
    col_017 DATE,
    col_018 TIMESTAMP,
    col_019 TIMESTAMP,
    col_020 DATE,
    col_021 VARCHAR(60),
    col_022 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0005_02 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 INT,
    col_006 DATE,
    col_007 DATE,
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 DATE,
    col_012 INT,
    col_013 INT,
    col_014 INT,
    col_015 DECIMAL(15,2),
    col_016 DATE,
    col_017 VARCHAR(60),
    col_018 VARCHAR(60),
    col_019 VARCHAR(60),
    col_020 VARCHAR(60),
    col_021 DATE,
    col_022 VARCHAR(60),
    col_023 INT,
    col_024 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0005_03 (
    col_000 VARCHAR(60),
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 INT,
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 INT,
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 INT,
    col_014 VARCHAR(60),
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    col_017 DECIMAL(15,2),
    col_018 DECIMAL(15,2),
    col_019 DATE,
    col_020 DECIMAL(15,2),
    col_021 VARCHAR(60),
    col_022 INT,
    col_023 TIMESTAMP,
    col_024 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0005_04 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 TIMESTAMP,
    col_008 VARCHAR(60),
    col_009 TIMESTAMP,
    col_010 INT,
    PRIMARY KEY (col_000)
);

