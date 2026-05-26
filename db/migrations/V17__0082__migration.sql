-- Flyway migration V17.0082
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0082_00 (
    col_000 DECIMAL(15,2),
    col_001 TIMESTAMP,
    col_002 DATE,
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 TIMESTAMP,
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 VARCHAR(60),
    col_009 DATE,
    col_010 DECIMAL(15,2),
    col_011 INT,
    col_012 DATE,
    col_013 DECIMAL(15,2),
    col_014 DATE,
    col_015 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0082_01 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 VARCHAR(60),
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 DECIMAL(15,2),
    col_007 DATE,
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 VARCHAR(60),
    col_012 VARCHAR(60),
    col_013 INT,
    col_014 TIMESTAMP,
    col_015 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0082_02 (
    col_000 INT,
    col_001 DATE,
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 TIMESTAMP,
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 INT,
    col_009 DECIMAL(15,2),
    col_010 TIMESTAMP,
    col_011 DATE,
    col_012 INT,
    col_013 DATE,
    col_014 DECIMAL(15,2),
    col_015 VARCHAR(60),
    col_016 INT,
    col_017 TIMESTAMP,
    col_018 DATE,
    col_019 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0082_03 (
    col_000 VARCHAR(60),
    col_001 INT,
    col_002 VARCHAR(60),
    col_003 DECIMAL(15,2),
    col_004 DATE,
    col_005 INT,
    col_006 INT,
    col_007 DATE,
    col_008 INT,
    col_009 INT,
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 TIMESTAMP,
    col_013 INT,
    col_014 DATE,
    col_015 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0082_04 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 TIMESTAMP,
    col_003 DATE,
    col_004 VARCHAR(60),
    col_005 DECIMAL(15,2),
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 DECIMAL(15,2),
    col_010 VARCHAR(60),
    col_011 DATE,
    col_012 INT,
    col_013 DECIMAL(15,2),
    col_014 DATE,
    col_015 DATE,
    col_016 VARCHAR(60),
    col_017 DATE,
    PRIMARY KEY (col_000)
);

