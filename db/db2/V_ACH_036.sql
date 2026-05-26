-- ============================================================
-- DB2 Objects for ach domain — variant 36
-- Pacific National Bank
-- ============================================================

CREATE VIEW PNB.V_ACH_036 AS
  SELECT
    COL_000,
    COL_001,
    COL_002,
    COL_003,
    COL_004,
    COL_005,
    COL_006,
    COL_007,
    COL_008,
    COL_009,
    COL_010,
  FROM PNB.ACH_MASTER
  WHERE STATUS = 'A';

CREATE TRIGGER PNB.TRG_ACH_036_UPDATE
  AFTER UPDATE ON PNB.ACH_MASTER
  REFERENCING NEW AS N OLD AS O
  FOR EACH ROW
  MODE DB2SQL
  BEGIN ATOMIC
    INSERT INTO PNB.ACH_AUDIT (
      AUDIT_ID, TABLE_NAME, OPERATION, OLD_VALUE, NEW_VALUE,
      CHANGED_BY, CHANGED_AT
    ) VALUES (
      DEFAULT, 'ACH_MASTER', 'UPDATE',
      CAST(O.COL_000 AS VARCHAR(200)),
      CAST(N.COL_000 AS VARCHAR(200)),
      CURRENT USER, CURRENT TIMESTAMP
    );
  END;

CREATE OR REPLACE PROCEDURE PNB.SP_ACH_036 (
  IN  p_key       VARCHAR(32),
  IN  p_operation VARCHAR(10),
  OUT p_status    INTEGER,
  OUT p_message   VARCHAR(200)
)
LANGUAGE SQL
DYNAMIC RESULT SETS 1
BEGIN
  DECLARE v_field_00 VARCHAR(100);
  DECLARE v_field_01 VARCHAR(100);
  DECLARE v_field_02 VARCHAR(100);
  DECLARE v_field_03 VARCHAR(100);
  DECLARE v_field_04 VARCHAR(100);
  DECLARE v_field_05 VARCHAR(100);
  DECLARE v_field_06 VARCHAR(100);
  DECLARE v_field_07 VARCHAR(100);
  DECLARE v_count INTEGER;
  DECLARE v_amount DECIMAL(15,2);
  DECLARE SQLSTATE CHAR(5);
  DECLARE EXIT HANDLER FOR SQLEXCEPTION
  BEGIN
    SET p_status = -1;
    SET p_message = 'SQL error: ' || SQLSTATE;
  END;

  IF p_operation = 'GET' THEN
    SELECT COL_000, COL_001 INTO v_field_00, v_field_01
      FROM PNB.ACH_MASTER
      WHERE COL_000 = p_key;
    SET p_status = 0;
    SET p_message = 'Record found';
  ELSEIF p_operation = 'COUNT' THEN
    SELECT COUNT(*) INTO v_count
      FROM PNB.ACH_MASTER
      WHERE STATUS = 'A';
    SET p_status = v_count;
    SET p_message = 'Count: ' || CHAR(v_count);
  ELSE
    SET p_status = -2;
    SET p_message = 'Unknown operation: ' || p_operation;
  END IF;
END;

CREATE INDEX PNB.IX_ACH_036_00
  ON PNB.ACH_MASTER (COL_000 ASC);

CREATE INDEX PNB.IX_ACH_036_01
  ON PNB.ACH_MASTER (COL_001 ASC);

