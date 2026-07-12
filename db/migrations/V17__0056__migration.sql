-- Flyway migration V17.0056
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0056_00 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 DECIMAL(15,2),
    col_003 DECIMAL(15,2),
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 DECIMAL(15,2),
    col_011 TIMESTAMP,
    col_012 DECIMAL(15,2),
    col_013 DECIMAL(15,2),
    col_014 DECIMAL(15,2),
    col_015 INT,
    col_016 INT,
    col_017 DECIMAL(15,2),
    col_018 DECIMAL(15,2),
    col_019 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0056_01 (
    col_000 VARCHAR(60),
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 INT,
    col_004 DATE,
    col_005 DECIMAL(15,2),
    col_006 VARCHAR(60),
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 DECIMAL(15,2),
    col_010 INT,
    col_011 INT,
    col_012 VARCHAR(60),
    col_013 TIMESTAMP,
    col_014 INT,
    col_015 VARCHAR(60),
    col_016 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0056_02 (
    col_000 TIMESTAMP,
    col_001 DATE,
    col_002 INT,
    col_003 INT,
    col_004 INT,
    col_005 DECIMAL(15,2),
    col_006 INT,
    col_007 INT,
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 DATE,
    col_011 INT,
    col_012 DATE,
    col_013 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0056_03 (
    col_000 DECIMAL(15,2),
    col_001 DATE,
    col_002 INT,
    col_003 TIMESTAMP,
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 DATE,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 DATE,
    col_013 INT,
    col_014 DATE,
    col_015 DECIMAL(15,2),
    col_016 VARCHAR(60),
    col_017 DECIMAL(15,2),
    col_018 VARCHAR(60),
    col_019 INT,
    col_020 DECIMAL(15,2),
    col_021 VARCHAR(60),
    col_022 DATE,
    col_023 VARCHAR(60),
    col_024 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0056_04 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 TIMESTAMP,
    col_007 INT,
    col_008 DATE,
    col_009 VARCHAR(60),
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 VARCHAR(60),
    col_013 DATE,
    col_014 TIMESTAMP,
    PRIMARY KEY (col_000)
);

