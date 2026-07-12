      ******************************************************************
      * REGCTR16V10.cbl — CTR Regulatory Reporting Variant 10
      * Pacific National Bank — Core Banking System
      * Generated batch program
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. REGCTR16V10.
       AUTHOR. PNB-CODE-GENERATOR.
       DATE-WRITTEN. 2026-05-26.
       DATE-COMPILED.
      *
      * CTR Regulatory Reporting Variant 10
      *
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       SOURCE-COMPUTER. LINUX.
       OBJECT-COMPUTER. LINUX.
       INPUT-OUTPUT SECTION.
       FILE-CONTROL.
           SELECT INPUT-FILE ASSIGN TO
               "REGCTR16V10-INPUT.DAT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-INPUT-STATUS.
           SELECT OUTPUT-FILE ASSIGN TO
               "REGCTR16V10-OUTPUT.DAT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-OUTPUT-STATUS.
           SELECT REPORT-FILE ASSIGN TO
               "REGCTR16V10-REPORT.RPT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-REPORT-STATUS.
           SELECT ERROR-FILE ASSIGN TO
               "REGCTR16V10-ERRORS.ERR"
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
       01  WS-REG-CTR-FIELDS.
           05  WS-REG-REPORT-ID        PIC X(20).
           05  WS-REG-PERIOD-START     PIC X(10).
           05  WS-REG-PERIOD-END       PIC X(10).
           05  WS-REG-THRESHOLD        PIC S9(13)V99 COMP-3.
           05  WS-REG-TOTAL-COUNT      PIC 9(09).
           05  WS-REG-TOTAL-AMOUNT     PIC S9(15)V99 COMP-3.
           05  WS-REG-ALERT-COUNT      PIC 9(07).
           05  WS-REG-FLAG-01         PIC X(01).
               88  REG-FLAG-01-YES    VALUE "Y".
               88  REG-FLAG-01-NO     VALUE "N".
           05  WS-REG-FLAG-02         PIC X(01).
               88  REG-FLAG-02-YES    VALUE "Y".
               88  REG-FLAG-02-NO     VALUE "N".
       01  WS-VARIANT-0020        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0020            PIC X(01).
           88  FLAG-0020-ON        VALUE "Y".
           88  FLAG-0020-OFF       VALUE "N".
       01  WS-VARIANT-0021        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0021            PIC X(01).
           88  FLAG-0021-ON        VALUE "Y".
           88  FLAG-0021-OFF       VALUE "N".
       01  WS-VARIANT-0022        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0022            PIC X(01).
           88  FLAG-0022-ON        VALUE "Y".
           88  FLAG-0022-OFF       VALUE "N".
       01  WS-VARIANT-0023        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0023            PIC X(01).
           88  FLAG-0023-ON        VALUE "Y".
           88  FLAG-0023-OFF       VALUE "N".
       01  WS-VARIANT-0024        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0024            PIC X(01).
           88  FLAG-0024-ON        VALUE "Y".
           88  FLAG-0024-OFF       VALUE "N".
       01  WS-VARIANT-0025        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0025            PIC X(01).
           88  FLAG-0025-ON        VALUE "Y".
           88  FLAG-0025-OFF       VALUE "N".
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
           DISPLAY "REGCTR16V10 STARTED AT "
               WS-CURR-HOUR ":" WS-CURR-MIN ":"
               WS-CURR-SEC
           SET EOF-NO TO TRUE
           SET NO-ERROR TO TRUE
           OPEN INPUT  INPUT-FILE
           IF WS-INPUT-STATUS NOT = "00"
               DISPLAY "REGCTR16V10: ERROR OPENING INPUT FILE"
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
           STRING "PACIFIC NATIONAL BANK - CTR Regulatory Reporting Variant 10"
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
           MOVE INPUT-RECORD TO WS-ACCOUNT-RECORD
           PERFORM 2100-CHECK-CTR-THRESHOLD
           IF NO-ERROR
               PERFORM 2200-EVALUATE-CTR-RULES
               IF WS-REG-ALERT-COUNT > 0
                   PERFORM 2300-GENERATE-CTR-ALERT
               END-IF
               ADD 1 TO WS-RECORDS-WRITTEN
           ELSE
               ADD 1 TO WS-RECORDS-REJECTED
           END-IF
           READ INPUT-FILE INTO INPUT-RECORD
               AT END SET EOF-YES TO TRUE
           END-READ.
      *
       2100-CHECK-CTR-THRESHOLD.
           SET NO-ERROR TO TRUE
           IF WS-ACCT-CURR-BAL > WS-REG-THRESHOLD
               ADD 1 TO WS-REG-ALERT-COUNT
           END-IF.
      *
       2200-EVALUATE-CTR-RULES.
           ADD WS-ACCT-CURR-BAL TO WS-REG-TOTAL-AMOUNT
           ADD 1 TO WS-REG-TOTAL-COUNT
           IF WS-ACCT-CURR-BAL > 10000
               SET REG-FLAG-01-YES TO TRUE
           ELSE
               SET REG-FLAG-01-NO TO TRUE
           END-IF.
      *
       2300-GENERATE-CTR-ALERT.
           MOVE SPACES TO REPORT-RECORD
           STRING "CTR ALERT: ACCT=" WS-ACCT-NUMBER
               " BAL=" WS-ACCT-CURR-BAL
               DELIMITED SIZE INTO REPORT-RECORD
           WRITE REPORT-RECORD
           WRITE OUTPUT-RECORD FROM WS-ACCOUNT-RECORD.
      *
       3100-VARIANT-10-STEP-00.
           DISPLAY "Processing variant 10 step 0"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0020 =
                   WS-VARIANT-0020 + 20
           END-IF
           CONTINUE.
      *
       9000-FINALIZE.
           CLOSE INPUT-FILE
           CLOSE OUTPUT-FILE
           PERFORM 9500-WRITE-REPORT-SUMMARY
           CLOSE REPORT-FILE
           CLOSE ERROR-FILE
           DISPLAY "REGCTR16V10 COMPLETE."
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
