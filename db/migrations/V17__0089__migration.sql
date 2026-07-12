-- Flyway migration V17.0089
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0089_00 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 DECIMAL(15,2),
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 DATE,
    col_013 TIMESTAMP,
    col_014 INT,
    col_015 VARCHAR(60),
    col_016 VARCHAR(60),
    col_017 INT,
    col_018 INT,
    col_019 VARCHAR(60),
    col_020 INT,
    col_021 VARCHAR(60),
    col_022 DATE,
    col_023 TIMESTAMP,
    col_024 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0089_01 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 VARCHAR(60),
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 DATE,
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 VARCHAR(60),
    col_015 TIMESTAMP,
    col_016 INT,
    col_017 VARCHAR(60),
    col_018 INT,
    col_019 TIMESTAMP,
    col_020 DATE,
    col_021 DATE,
    col_022 DATE,
    col_023 INT,
    col_024 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0089_02 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 INT,
    col_010 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0089_03 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 DATE,
    col_008 VARCHAR(60),
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 DATE,
    col_013 VARCHAR(60),
    col_014 VARCHAR(60),
    col_015 VARCHAR(60),
    col_016 DATE,
    col_017 TIMESTAMP,
    col_018 INT,
    col_019 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0089_04 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 DECIMAL(15,2),
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    PRIMARY KEY (col_000)
);

