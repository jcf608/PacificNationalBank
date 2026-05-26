      ******************************************************************
      * TXNREVE13V02.cbl — REVERSAL Transaction Processing Variant 2
      * Pacific National Bank — Core Banking System
      * Generated batch program
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. TXNREVE13V02.
       AUTHOR. PNB-CODE-GENERATOR.
       DATE-WRITTEN. 2026-05-26.
       DATE-COMPILED.
      *
      * REVERSAL Transaction Processing Variant 2
      *
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       SOURCE-COMPUTER. LINUX.
       OBJECT-COMPUTER. LINUX.
       INPUT-OUTPUT SECTION.
       FILE-CONTROL.
           SELECT INPUT-FILE ASSIGN TO
               "TXNREVE13V02-INPUT.DAT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-INPUT-STATUS.
           SELECT OUTPUT-FILE ASSIGN TO
               "TXNREVE13V02-OUTPUT.DAT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-OUTPUT-STATUS.
           SELECT REPORT-FILE ASSIGN TO
               "TXNREVE13V02-REPORT.RPT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-REPORT-STATUS.
           SELECT ERROR-FILE ASSIGN TO
               "TXNREVE13V02-ERRORS.ERR"
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
       01  WS-STMT-FIELDS.
           05  WS-STMT-PERIOD-START    PIC X(10).
           05  WS-STMT-PERIOD-END      PIC X(10).
           05  WS-STMT-OPEN-BAL        PIC S9(13)V99 COMP-3.
           05  WS-STMT-CLOSE-BAL       PIC S9(13)V99 COMP-3.
           05  WS-STMT-TOTAL-DR        PIC S9(13)V99 COMP-3.
           05  WS-STMT-TOTAL-CR        PIC S9(13)V99 COMP-3.
           05  WS-STMT-TXN-COUNT       PIC 9(05).
           05  WS-STMT-PAGE-NUM        PIC 9(04) VALUE 1.
           05  WS-STMT-LINE-NUM        PIC 9(02) VALUE 0.
           05  WS-STMT-LINES-PER-PAGE  PIC 9(02) VALUE 55.
           05  WS-FMT-AMT-1          PIC Z(12)9.99-.
           05  WS-FMT-AMT-2          PIC Z(12)9.99-.
           05  WS-FMT-AMT-3          PIC Z(12)9.99-.
           05  WS-FMT-AMT-4          PIC Z(12)9.99-.
           05  WS-FMT-AMT-5          PIC Z(12)9.99-.
       01  WS-VARIANT-0004        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0004            PIC X(01).
           88  FLAG-0004-ON        VALUE "Y".
           88  FLAG-0004-OFF       VALUE "N".
       01  WS-VARIANT-0005        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0005            PIC X(01).
           88  FLAG-0005-ON        VALUE "Y".
           88  FLAG-0005-OFF       VALUE "N".
       01  WS-VARIANT-0006        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0006            PIC X(01).
           88  FLAG-0006-ON        VALUE "Y".
           88  FLAG-0006-OFF       VALUE "N".
       01  WS-VARIANT-0007        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0007            PIC X(01).
           88  FLAG-0007-ON        VALUE "Y".
           88  FLAG-0007-OFF       VALUE "N".
       01  WS-VARIANT-0008        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0008            PIC X(01).
           88  FLAG-0008-ON        VALUE "Y".
           88  FLAG-0008-OFF       VALUE "N".
       01  WS-VARIANT-0009        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0009            PIC X(01).
           88  FLAG-0009-ON        VALUE "Y".
           88  FLAG-0009-OFF       VALUE "N".
       01  WS-VARIANT-0010        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0010            PIC X(01).
           88  FLAG-0010-ON        VALUE "Y".
           88  FLAG-0010-OFF       VALUE "N".
       01  WS-VARIANT-0011        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0011            PIC X(01).
           88  FLAG-0011-ON        VALUE "Y".
           88  FLAG-0011-OFF       VALUE "N".
       01  WS-VARIANT-0012        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0012            PIC X(01).
           88  FLAG-0012-ON        VALUE "Y".
           88  FLAG-0012-OFF       VALUE "N".
       01  WS-VARIANT-0013        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0013            PIC X(01).
           88  FLAG-0013-ON        VALUE "Y".
           88  FLAG-0013-OFF       VALUE "N".
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
           DISPLAY "TXNREVE13V02 STARTED AT "
               WS-CURR-HOUR ":" WS-CURR-MIN ":"
               WS-CURR-SEC
           SET EOF-NO TO TRUE
           SET NO-ERROR TO TRUE
           OPEN INPUT  INPUT-FILE
           IF WS-INPUT-STATUS NOT = "00"
               DISPLAY "TXNREVE13V02: ERROR OPENING INPUT FILE"
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
           STRING "PACIFIC NATIONAL BANK - REVERSAL Transaction Processing Variant 2"
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
           PERFORM 2100-VALIDATE-ACCOUNT
           IF NO-ERROR
               PERFORM 2200-FORMAT-HEADER
               PERFORM 2300-RETRIEVE-TRANSACTIONS
               PERFORM 2400-FORMAT-SUMMARY
               PERFORM 2500-WRITE-STATEMENT
               ADD 1 TO WS-RECORDS-WRITTEN
           ELSE
               PERFORM 2900-WRITE-ERROR
               ADD 1 TO WS-RECORDS-REJECTED
           END-IF
           READ INPUT-FILE INTO INPUT-RECORD
               AT END SET EOF-YES TO TRUE
           END-READ.
      *
       2100-VALIDATE-ACCOUNT.
           SET NO-ERROR TO TRUE
           IF NOT ACCT-ACTIVE
               IF NOT ACCT-DORMANT
                   SET HAS-ERROR TO TRUE
                   MOVE "ACCOUNT NOT ELIGIBLE" TO
                       WS-CA-MESSAGE
               END-IF
           END-IF.
      *
       2200-FORMAT-HEADER.
           MOVE SPACES TO REPORT-RECORD
           STRING "PACIFIC NATIONAL BANK" DELIMITED SIZE
               INTO REPORT-RECORD
           WRITE REPORT-RECORD
           MOVE SPACES TO REPORT-RECORD
           STRING "ACCOUNT STATEMENT" DELIMITED SIZE
               INTO REPORT-RECORD
           WRITE REPORT-RECORD
           MOVE SPACES TO REPORT-RECORD
           STRING "ACCOUNT: " WS-ACCT-NUMBER
               DELIMITED SIZE INTO REPORT-RECORD
           WRITE REPORT-RECORD.
      *
       2300-RETRIEVE-TRANSACTIONS.
           MOVE 0 TO WS-STMT-TXN-COUNT
           MOVE 0 TO WS-STMT-TOTAL-DR
           MOVE 0 TO WS-STMT-TOTAL-CR
           DISPLAY "RETRIEVING TXNS FOR " WS-ACCT-NUMBER.
      *
       2400-FORMAT-SUMMARY.
           MOVE WS-STMT-TOTAL-DR TO WS-FMT-AMT-1
           MOVE WS-STMT-TOTAL-CR TO WS-FMT-AMT-2
           MOVE WS-STMT-CLOSE-BAL TO WS-FMT-AMT-3
           MOVE SPACES TO REPORT-RECORD
           STRING "TOTAL DEBITS:  " WS-FMT-AMT-1
               DELIMITED SIZE INTO REPORT-RECORD
           WRITE REPORT-RECORD.
      *
       2500-WRITE-STATEMENT.
           WRITE OUTPUT-RECORD FROM WS-ACCOUNT-RECORD.
      *
       2900-WRITE-ERROR.
           STRING "STMT ERROR: " WS-ACCT-NUMBER
               DELIMITED SIZE INTO ERROR-RECORD
           WRITE ERROR-RECORD.
      *
       3020-VARIANT-02-STEP-00.
           DISPLAY "Processing variant 2 step 0"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 20
           END-IF
           CONTINUE.
      *
       3021-VARIANT-02-STEP-01.
           DISPLAY "Processing variant 2 step 1"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 20
           END-IF
           CONTINUE.
      *
       3022-VARIANT-02-STEP-02.
           DISPLAY "Processing variant 2 step 2"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0004 =
                   WS-VARIANT-0004 + 20
           END-IF
           CONTINUE.
      *
       9000-FINALIZE.
           CLOSE INPUT-FILE
           CLOSE OUTPUT-FILE
           PERFORM 9500-WRITE-REPORT-SUMMARY
           CLOSE REPORT-FILE
           CLOSE ERROR-FILE
           DISPLAY "TXNREVE13V02 COMPLETE."
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
