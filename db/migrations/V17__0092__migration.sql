-- Flyway migration V17.0092
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0092_00 (
    col_000 INT,
    col_001 INT,
    col_002 INT,
    col_003 DATE,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 INT,
    col_008 DECIMAL(15,2),
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 VARCHAR(60),
    col_013 DECIMAL(15,2),
    col_014 VARCHAR(60),
    col_015 TIMESTAMP,
    col_016 DATE,
    col_017 VARCHAR(60),
    col_018 VARCHAR(60),
    col_019 DECIMAL(15,2),
    col_020 DATE,
    col_021 TIMESTAMP,
    col_022 DATE,
    col_023 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0092_01 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 INT,
    col_007 DATE,
    col_008 TIMESTAMP,
    col_009 INT,
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 VARCHAR(60),
    col_013 VARCHAR(60),
    col_014 DATE,
    col_015 INT,
    col_016 DECIMAL(15,2),
    col_017 DATE,
    col_018 VARCHAR(60),
    col_019 DECIMAL(15,2),
    col_020 VARCHAR(60),
    col_021 INT,
    col_022 INT,
    col_023 DECIMAL(15,2),
    col_024 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0092_02 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 DATE,
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 DATE,
    col_012 VARCHAR(60),
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    col_016 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0092_03 (
    col_000 TIMESTAMP,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 DECIMAL(15,2),
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0092_04 (
    col_000 TIMESTAMP,
    col_001 INT,
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 TIMESTAMP,
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 DATE,
    col_011 VARCHAR(60),
    col_012 INT,
    col_013 DATE,
    col_014 DATE,
    PRIMARY KEY (col_000)
);

