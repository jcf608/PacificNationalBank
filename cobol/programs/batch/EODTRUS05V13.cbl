      ******************************************************************
      * EODTRUS05V13.cbl — End-of-Day TRUST Processing Variant 13
      * Pacific National Bank — Core Banking System
      * Generated batch program
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. EODTRUS05V13.
       AUTHOR. PNB-CODE-GENERATOR.
       DATE-WRITTEN. 2026-05-26.
       DATE-COMPILED.
      *
      * End-of-Day TRUST Processing Variant 13
      *
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       SOURCE-COMPUTER. LINUX.
       OBJECT-COMPUTER. LINUX.
       INPUT-OUTPUT SECTION.
       FILE-CONTROL.
           SELECT INPUT-FILE ASSIGN TO
               "EODTRUS05V13-INPUT.DAT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-INPUT-STATUS.
           SELECT OUTPUT-FILE ASSIGN TO
               "EODTRUS05V13-OUTPUT.DAT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-OUTPUT-STATUS.
           SELECT REPORT-FILE ASSIGN TO
               "EODTRUS05V13-REPORT.RPT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-REPORT-STATUS.
           SELECT ERROR-FILE ASSIGN TO
               "EODTRUS05V13-ERRORS.ERR"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-ERROR-STATUS.
      *
       DATA DIVISION.
       FILE SECTION.
       FD  INPUT-FILE
           RECORDING MODE IS F
           RECORD CONTAINS 400 CHARACTERS
           BLOCK CONTAINS 0 RECORDS.
       01  INPUT-RECORD                 PIC X(400).
      *
       FD  OUTPUT-FILE
           RECORDING MODE IS F
           RECORD CONTAINS 400 CHARACTERS
           BLOCK CONTAINS 0 RECORDS.
       01  OUTPUT-RECORD                PIC X(400).
      *
       FD  REPORT-FILE
           RECORDING MODE IS F
           RECORD CONTAINS 132 CHARACTERS
           BLOCK CONTAINS 0 RECORDS.
       01  REPORT-RECORD                PIC X(132).
      *
       FD  ERROR-FILE
           RECORDING MODE IS F
           RECORD CONTAINS 200 CHARACTERS.
       01  ERROR-RECORD                 PIC X(200).
      *
       WORKING-STORAGE SECTION.
       01  WS-FILE-STATUSES.
           05  WS-INPUT-STATUS          PIC X(02).
           05  WS-OUTPUT-STATUS         PIC X(02).
           05  WS-REPORT-STATUS         PIC X(02).
           05  WS-ERROR-STATUS          PIC X(02).
       01  WS-FLAGS.
           05  WS-EOF-FLAG              PIC X(01).
               88  EOF-YES              VALUE "Y".
               88  EOF-NO               VALUE "N".
           05  WS-ERROR-FLAG            PIC X(01).
               88  HAS-ERROR            VALUE "Y".
               88  NO-ERROR             VALUE "N".
       01  WS-COUNTERS.
           05  WS-RECORDS-READ          PIC 9(09) VALUE 0.
           05  WS-RECORDS-WRITTEN       PIC 9(09) VALUE 0.
           05  WS-RECORDS-REJECTED      PIC 9(09) VALUE 0.
           05  WS-TOTAL-AMOUNT          PIC S9(15)V99
                                        COMP-3 VALUE 0.
       01  WS-CURRENT-DATE-TIME.
           05  WS-CURRENT-DATE.
               10  WS-CURR-YEAR         PIC 9(04).
               10  WS-CURR-MONTH        PIC 9(02).
               10  WS-CURR-DAY          PIC 9(02).
           05  WS-CURRENT-TIME.
               10  WS-CURR-HOUR         PIC 9(02).
               10  WS-CURR-MIN          PIC 9(02).
               10  WS-CURR-SEC          PIC 9(02).
               10  WS-CURR-HUND         PIC 9(02).
      *
       COPY CPYACCT.
       COPY CPYCUST.
       COPY CPYTXN.
       COPY CPYLOAN.
       COPY CPYGLAC.
      *
       01  WS-EOD-WORK-FIELDS.
           05  WS-CALC-INTEREST        PIC S9(13)V99 COMP-3.
           05  WS-DAILY-RATE            PIC 9V9(10).
           05  WS-DAYS-IN-PERIOD         PIC 9(03).
           05  WS-PERIOD-START           PIC X(10).
           05  WS-PERIOD-END             PIC X(10).
           05  WS-ACCRUAL-METHOD         PIC X(01).
               88  METHOD-ACTUAL-365     VALUE "A".
               88  METHOD-30-360         VALUE "B".
               88  METHOD-ACTUAL-360     VALUE "C".
           05  WS-WORK-AMT-015        PIC S9(15)V99
                                        COMP-3.
           05  WS-WORK-AMT-016        PIC S9(15)V99
                                        COMP-3.
           05  WS-WORK-AMT-017        PIC S9(15)V99
                                        COMP-3.
       01  WS-VARIANT-0026        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0026            PIC X(01).
           88  FLAG-0026-ON        VALUE "Y".
           88  FLAG-0026-OFF       VALUE "N".
       01  WS-VARIANT-0027        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0027            PIC X(01).
           88  FLAG-0027-ON        VALUE "Y".
           88  FLAG-0027-OFF       VALUE "N".
       01  WS-VARIANT-0028        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0028            PIC X(01).
           88  FLAG-0028-ON        VALUE "Y".
           88  FLAG-0028-OFF       VALUE "N".
       01  WS-VARIANT-0029        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0029            PIC X(01).
           88  FLAG-0029-ON        VALUE "Y".
           88  FLAG-0029-OFF       VALUE "N".
       01  WS-VARIANT-0030        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0030            PIC X(01).
           88  FLAG-0030-ON        VALUE "Y".
           88  FLAG-0030-OFF       VALUE "N".
       01  WS-VARIANT-0031        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0031            PIC X(01).
           88  FLAG-0031-ON        VALUE "Y".
           88  FLAG-0031-OFF       VALUE "N".
       01  WS-VARIANT-0032        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0032            PIC X(01).
           88  FLAG-0032-ON        VALUE "Y".
           88  FLAG-0032-OFF       VALUE "N".
       01  WS-VARIANT-0033        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0033            PIC X(01).
           88  FLAG-0033-ON        VALUE "Y".
           88  FLAG-0033-OFF       VALUE "N".
       01  WS-VARIANT-0034        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0034            PIC X(01).
           88  FLAG-0034-ON        VALUE "Y".
           88  FLAG-0034-OFF       VALUE "N".
       01  WS-VARIANT-0035        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0035            PIC X(01).
           88  FLAG-0035-ON        VALUE "Y".
           88  FLAG-0035-OFF       VALUE "N".
      *
       PROCEDURE DIVISION.
       0000-MAIN-CONTROL.
           PERFORM 1000-INITIALIZE
           PERFORM 2000-PROCESS UNTIL EOF-YES
           PERFORM 9000-FINALIZE
           STOP RUN.
      *
       1000-INITIALIZE.
           MOVE FUNCTION CURRENT-DATE TO
               WS-CURRENT-DATE-TIME
           DISPLAY "EODTRUS05V13 STARTED AT "
               WS-CURR-HOUR ":" WS-CURR-MIN ":"
               WS-CURR-SEC
           SET EOF-NO TO TRUE
           SET NO-ERROR TO TRUE
           OPEN INPUT  INPUT-FILE
           IF WS-INPUT-STATUS NOT = "00"
               DISPLAY "EODTRUS05V13: ERROR OPENING INPUT FILE"
                   " STATUS=" WS-INPUT-STATUS
               MOVE 12 TO RETURN-CODE
               STOP RUN
           END-IF
           OPEN OUTPUT OUTPUT-FILE
           OPEN OUTPUT REPORT-FILE
           OPEN OUTPUT ERROR-FILE
           PERFORM 1500-WRITE-REPORT-HEADER
           READ INPUT-FILE INTO INPUT-RECORD
               AT END SET EOF-YES TO TRUE
           END-READ.
      *
       1500-WRITE-REPORT-HEADER.
           MOVE SPACES TO REPORT-RECORD
           STRING "PACIFIC NATIONAL BANK - End-of-Day TRUST Processing Variant 13"
               DELIMITED BY SIZE INTO REPORT-RECORD
           WRITE REPORT-RECORD
           MOVE SPACES TO REPORT-RECORD
           STRING "RUN DATE: " WS-CURR-YEAR "-"
               WS-CURR-MONTH "-" WS-CURR-DAY
               DELIMITED BY SIZE INTO REPORT-RECORD
           WRITE REPORT-RECORD
           MOVE ALL "-" TO REPORT-RECORD
           WRITE REPORT-RECORD.
      *
       2000-PROCESS.
           ADD 1 TO WS-RECORDS-READ
           PERFORM 2100-VALIDATE-RECORD
           IF NO-ERROR
               PERFORM 2200-CALCULATE-INTEREST
               PERFORM 2300-POST-ACCRUAL
               PERFORM 2400-UPDATE-BALANCES
               ADD 1 TO WS-RECORDS-WRITTEN
           ELSE
               PERFORM 2900-WRITE-ERROR
               ADD 1 TO WS-RECORDS-REJECTED
           END-IF
           READ INPUT-FILE INTO INPUT-RECORD
               AT END SET EOF-YES TO TRUE
           END-READ.
      *
       2100-VALIDATE-RECORD.
           SET NO-ERROR TO TRUE
           IF WS-ACCT-NUMBER = SPACES
               SET HAS-ERROR TO TRUE
               MOVE "MISSING ACCOUNT NUMBER" TO
                   WS-CA-MESSAGE
           END-IF
           IF WS-ACCT-CURR-BAL = 0
               CONTINUE
           END-IF.
      *
       2200-CALCULATE-INTEREST.
           IF METHOD-ACTUAL-365
               DIVIDE WS-ACCT-INT-RATE BY 36500
                   GIVING WS-DAILY-RATE
           ELSE IF METHOD-30-360
               DIVIDE WS-ACCT-INT-RATE BY 36000
                   GIVING WS-DAILY-RATE
           END-IF
           MULTIPLY WS-ACCT-CURR-BAL BY WS-DAILY-RATE
               GIVING WS-CALC-INTEREST ROUNDED
           MULTIPLY WS-CALC-INTEREST BY WS-DAYS-IN-PERIOD
               GIVING WS-CALC-INTEREST ROUNDED
           ADD WS-CALC-INTEREST TO WS-ACCT-INT-ACCRUED
           ADD WS-CALC-INTEREST TO WS-TOTAL-AMOUNT.
      *
       2300-POST-ACCRUAL.
           MOVE WS-ACCT-NUMBER TO WS-TXN-ACCT-NUMBER
           MOVE WS-CALC-INTEREST TO WS-TXN-AMOUNT
           MOVE "INT" TO WS-TXN-TYPE
           MOVE "T" TO WS-TXN-STATUS
           MOVE WS-CURRENT-DATE TO WS-TXN-DATE
           MOVE "Interest Accrual" TO WS-TXN-DESCRIPTION
           WRITE OUTPUT-RECORD FROM WS-TRANSACTION-RECORD.
      *
       2400-UPDATE-BALANCES.
           ADD WS-CALC-INTEREST TO WS-ACCT-CURR-BAL
           ADD WS-CALC-INTEREST TO WS-ACCT-INT-YTD
           MOVE WS-CURRENT-DATE TO WS-ACCT-LAST-TXN-DATE.
      *
       2900-WRITE-ERROR.
           STRING "ERROR: " WS-ACCT-NUMBER " - "
               WS-CA-MESSAGE
               DELIMITED BY SIZE INTO ERROR-RECORD
           WRITE ERROR-RECORD.
      *
       3130-VARIANT-13-STEP-00.
           DISPLAY "Processing variant 13 step 0"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 20
           END-IF
           CONTINUE.
      *
       3131-VARIANT-13-STEP-01.
           DISPLAY "Processing variant 13 step 1"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 20
           END-IF
           CONTINUE.
      *
       3132-VARIANT-13-STEP-02.
           DISPLAY "Processing variant 13 step 2"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 20
           END-IF
           CONTINUE.
      *
       3133-VARIANT-13-STEP-03.
           DISPLAY "Processing variant 13 step 3"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0026 =
                   WS-VARIANT-0026 + 20
           END-IF
           CONTINUE.
      *
       9000-FINALIZE.
           CLOSE INPUT-FILE
           CLOSE OUTPUT-FILE
           PERFORM 9500-WRITE-REPORT-SUMMARY
           CLOSE REPORT-FILE
           CLOSE ERROR-FILE
           DISPLAY "EODTRUS05V13 COMPLETE."
           DISPLAY "  RECORDS READ:     " WS-RECORDS-READ
           DISPLAY "  RECORDS WRITTEN:  "
               WS-RECORDS-WRITTEN
           DISPLAY "  RECORDS REJECTED: "
               WS-RECORDS-REJECTED
           IF WS-RECORDS-REJECTED > 0
               MOVE 4 TO RETURN-CODE
           ELSE
               MOVE 0 TO RETURN-CODE
           END-IF.
      *
       9500-WRITE-REPORT-SUMMARY.
           MOVE SPACES TO REPORT-RECORD
           MOVE ALL "=" TO REPORT-RECORD
           WRITE REPORT-RECORD
           MOVE SPACES TO REPORT-RECORD
           STRING "TOTAL RECORDS READ:     "
               WS-RECORDS-READ
               DELIMITED BY SIZE INTO REPORT-RECORD
           WRITE REPORT-RECORD
           MOVE SPACES TO REPORT-RECORD
           STRING "TOTAL RECORDS WRITTEN:  "
               WS-RECORDS-WRITTEN
               DELIMITED BY SIZE INTO REPORT-RECORD
           WRITE REPORT-RECORD
           MOVE SPACES TO REPORT-RECORD
           STRING "TOTAL RECORDS REJECTED: "
               WS-RECORDS-REJECTED
               DELIMITED BY SIZE INTO REPORT-RECORD
           WRITE REPORT-RECORD.
      *
       9999-END-OF-PROGRAM.
           EXIT.
