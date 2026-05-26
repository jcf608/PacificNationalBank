-- Flyway migration V17.0029
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0029_00 (
    col_000 DECIMAL(15,2),
    col_001 DECIMAL(15,2),
    col_002 INT,
    col_003 INT,
    col_004 INT,
    col_005 DATE,
    col_006 INT,
    col_007 INT,
    col_008 DATE,
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 DECIMAL(15,2),
    col_013 DECIMAL(15,2),
    col_014 TIMESTAMP,
    col_015 VARCHAR(60),
    col_016 DECIMAL(15,2),
    col_017 VARCHAR(60),
    col_018 DECIMAL(15,2),
    col_019 DATE,
    col_020 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0029_01 (
    col_000 DATE,
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 DECIMAL(15,2),
    col_005 DATE,
    col_006 INT,
    col_007 DATE,
    col_008 INT,
    col_009 VARCHAR(60),
    col_010 VARCHAR(60),
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 VARCHAR(60),
    col_015 DECIMAL(15,2),
    col_016 INT,
    col_017 DECIMAL(15,2),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0029_02 (
    col_000 DECIMAL(15,2),
    col_001 INT,
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 INT,
    col_006 INT,
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 DATE,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0029_03 (
    col_000 TIMESTAMP,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 VARCHAR(60),
    col_004 DATE,
    col_005 VARCHAR(60),
    col_006 DECIMAL(15,2),
    col_007 VARCHAR(60),
    col_008 VARCHAR(60),
    col_009 VARCHAR(60),
    col_010 DECIMAL(15,2),
    col_011 DECIMAL(15,2),
    col_012 DECIMAL(15,2),
    col_013 DATE,
    col_014 INT,
    col_015 VARCHAR(60),
    col_016 TIMESTAMP,
    col_017 TIMESTAMP,
    col_018 INT,
    col_019 VARCHAR(60),
    col_020 VARCHAR(60),
    col_021 VARCHAR(60),
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0029_04 (
    col_000 DATE,
    col_001 DECIMAL(15,2),
    col_002 VARCHAR(60),
    col_003 INT,
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 DATE,
    col_007 VARCHAR(60),
    col_008 DECIMAL(15,2),
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DATE,
    col_012 DATE,
    col_013 VARCHAR(60),
    PRIMARY KEY (col_000)
);

