-- Flyway migration V17.0088
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0088_00 (
    col_000 INT,
    col_001 DATE,
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 INT,
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 DECIMAL(15,2),
    col_014 VARCHAR(60),
    col_015 VARCHAR(60),
    col_016 TIMESTAMP,
    col_017 TIMESTAMP,
    col_018 INT,
    col_019 DECIMAL(15,2),
    col_020 INT,
    col_021 DATE,
    col_022 TIMESTAMP,
    col_023 VARCHAR(60),
    col_024 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0088_01 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 INT,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 INT,
    col_012 DECIMAL(15,2),
    col_013 TIMESTAMP,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 TIMESTAMP,
    col_017 DECIMAL(15,2),
    col_018 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0088_02 (
    col_000 INT,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 DATE,
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 INT,
    col_008 TIMESTAMP,
    col_009 TIMESTAMP,
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 DATE,
    col_013 VARCHAR(60),
    col_014 DECIMAL(15,2),
    col_015 DATE,
    col_016 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0088_03 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 INT,
    col_009 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0088_04 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 DATE,
    col_008 DATE,
    col_009 DATE,
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 DECIMAL(15,2),
    col_013 TIMESTAMP,
    col_014 DECIMAL(15,2),
    col_015 DATE,
    col_016 DATE,
    col_017 DECIMAL(15,2),
    col_018 TIMESTAMP,
    col_019 TIMESTAMP,
    PRIMARY KEY (col_000)
);

