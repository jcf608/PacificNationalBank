-- Flyway migration V17.0047
-- Pacific National Bank schema migration

CREATE TABLE PNB_MIG_0047_00 (
    col_000 VARCHAR(60),
    col_001 VARCHAR(60),
    col_002 INT,
    col_003 DECIMAL(15,2),
    col_004 INT,
    col_005 VARCHAR(60),
    col_006 TIMESTAMP,
    col_007 VARCHAR(60),
    col_008 DATE,
    col_009 DATE,
    col_010 TIMESTAMP,
    col_011 TIMESTAMP,
    col_012 INT,
    col_013 TIMESTAMP,
    col_014 VARCHAR(60),
    col_015 DECIMAL(15,2),
    col_016 DATE,
    col_017 DATE,
    col_018 VARCHAR(60),
    col_019 DECIMAL(15,2),
    col_020 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0047_01 (
    col_000 DECIMAL(15,2),
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 TIMESTAMP,
    col_004 TIMESTAMP,
    col_005 DECIMAL(15,2),
    col_006 TIMESTAMP,
    col_007 DECIMAL(15,2),
    col_008 VARCHAR(60),
    col_009 INT,
    col_010 DECIMAL(15,2),
    col_011 VARCHAR(60),
    col_012 DECIMAL(15,2),
    col_013 VARCHAR(60),
    col_014 INT,
    col_015 DATE,
    col_016 INT,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0047_02 (
    col_000 DATE,
    col_001 TIMESTAMP,
    col_002 DECIMAL(15,2),
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 VARCHAR(60),
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    col_008 INT,
    col_009 TIMESTAMP,
    col_010 TIMESTAMP,
    col_011 INT,
    col_012 INT,
    col_013 INT,
    col_014 DECIMAL(15,2),
    col_015 TIMESTAMP,
    col_016 DECIMAL(15,2),
    col_017 DATE,
    col_018 DATE,
    col_019 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0047_03 (
    col_000 INT,
    col_001 DECIMAL(15,2),
    col_002 DATE,
    col_003 TIMESTAMP,
    col_004 VARCHAR(60),
    col_005 TIMESTAMP,
    col_006 VARCHAR(60),
    col_007 TIMESTAMP,
    PRIMARY KEY (col_000)
);

CREATE TABLE PNB_MIG_0047_04 (
    col_000 INT,
    col_001 VARCHAR(60),
    col_002 TIMESTAMP,
    col_003 INT,
    col_004 TIMESTAMP,
    col_005 TIMESTAMP,
    col_006 INT,
    col_007 DATE,
    col_008 DATE,
    col_009 TIMESTAMP,
    col_010 DATE,
    col_011 DECIMAL(15,2),
    col_012 INT,
    col_013 DATE,
    col_014 DATE,
    col_015 TIMESTAMP,
    col_016 VARCHAR(60),
    PRIMARY KEY (col_000)
);

