      ******************************************************************
      * REGSAR15V28.cbl — SAR Regulatory Reporting Variant 28
      * Pacific National Bank — Core Banking System
      * Generated batch program
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. REGSAR15V28.
       AUTHOR. PNB-CODE-GENERATOR.
       DATE-WRITTEN. 2026-05-26.
       DATE-COMPILED.
      *
      * SAR Regulatory Reporting Variant 28
      *
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       SOURCE-COMPUTER. LINUX.
       OBJECT-COMPUTER. LINUX.
       INPUT-OUTPUT SECTION.
       FILE-CONTROL.
           SELECT INPUT-FILE ASSIGN TO
               "REGSAR15V28-INPUT.DAT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-INPUT-STATUS.
           SELECT OUTPUT-FILE ASSIGN TO
               "REGSAR15V28-OUTPUT.DAT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-OUTPUT-STATUS.
           SELECT REPORT-FILE ASSIGN TO
               "REGSAR15V28-REPORT.RPT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-REPORT-STATUS.
           SELECT ERROR-FILE ASSIGN TO
               "REGSAR15V28-ERRORS.ERR"
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
       01  WS-REG-SAR-FIELDS.
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
           05  WS-REG-FLAG-03         PIC X(01).
               88  REG-FLAG-03-YES    VALUE "Y".
               88  REG-FLAG-03-NO     VALUE "N".
           05  WS-REG-FLAG-04         PIC X(01).
               88  REG-FLAG-04-YES    VALUE "Y".
               88  REG-FLAG-04-NO     VALUE "N".
           05  WS-REG-FLAG-05         PIC X(01).
               88  REG-FLAG-05-YES    VALUE "Y".
               88  REG-FLAG-05-NO     VALUE "N".
       01  WS-VARIANT-0056        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0056            PIC X(01).
           88  FLAG-0056-ON        VALUE "Y".
           88  FLAG-0056-OFF       VALUE "N".
       01  WS-VARIANT-0057        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0057            PIC X(01).
           88  FLAG-0057-ON        VALUE "Y".
           88  FLAG-0057-OFF       VALUE "N".
       01  WS-VARIANT-0058        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0058            PIC X(01).
           88  FLAG-0058-ON        VALUE "Y".
           88  FLAG-0058-OFF       VALUE "N".
       01  WS-VARIANT-0059        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0059            PIC X(01).
           88  FLAG-0059-ON        VALUE "Y".
           88  FLAG-0059-OFF       VALUE "N".
       01  WS-VARIANT-0060        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0060            PIC X(01).
           88  FLAG-0060-ON        VALUE "Y".
           88  FLAG-0060-OFF       VALUE "N".
       01  WS-VARIANT-0061        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0061            PIC X(01).
           88  FLAG-0061-ON        VALUE "Y".
           88  FLAG-0061-OFF       VALUE "N".
       01  WS-VARIANT-0062        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0062            PIC X(01).
           88  FLAG-0062-ON        VALUE "Y".
           88  FLAG-0062-OFF       VALUE "N".
       01  WS-VARIANT-0063        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0063            PIC X(01).
           88  FLAG-0063-ON        VALUE "Y".
           88  FLAG-0063-OFF       VALUE "N".
       01  WS-VARIANT-0064        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0064            PIC X(01).
           88  FLAG-0064-ON        VALUE "Y".
           88  FLAG-0064-OFF       VALUE "N".
       01  WS-VARIANT-0065        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0065            PIC X(01).
           88  FLAG-0065-ON        VALUE "Y".
           88  FLAG-0065-OFF       VALUE "N".
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
           DISPLAY "REGSAR15V28 STARTED AT "
               WS-CURR-HOUR ":" WS-CURR-MIN ":"
               WS-CURR-SEC
           SET EOF-NO TO TRUE
           SET NO-ERROR TO TRUE
           OPEN INPUT  INPUT-FILE
           IF WS-INPUT-STATUS NOT = "00"
               DISPLAY "REGSAR15V28: ERROR OPENING INPUT FILE"
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
           STRING "PACIFIC NATIONAL BANK - SAR Regulatory Reporting Variant 28"
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
           PERFORM 2100-CHECK-SAR-THRESHOLD
           IF NO-ERROR
               PERFORM 2200-EVALUATE-SAR-RULES
               IF WS-REG-ALERT-COUNT > 0
                   PERFORM 2300-GENERATE-SAR-ALERT
               END-IF
               ADD 1 TO WS-RECORDS-WRITTEN
           ELSE
               ADD 1 TO WS-RECORDS-REJECTED
           END-IF
           READ INPUT-FILE INTO INPUT-RECORD
               AT END SET EOF-YES TO TRUE
           END-READ.
      *
       2100-CHECK-SAR-THRESHOLD.
           SET NO-ERROR TO TRUE
           IF WS-ACCT-CURR-BAL > WS-REG-THRESHOLD
               ADD 1 TO WS-REG-ALERT-COUNT
           END-IF.
      *
       2200-EVALUATE-SAR-RULES.
           ADD WS-ACCT-CURR-BAL TO WS-REG-TOTAL-AMOUNT
           ADD 1 TO WS-REG-TOTAL-COUNT
           IF WS-ACCT-CURR-BAL > 10000
               SET REG-FLAG-01-YES TO TRUE
           ELSE
               SET REG-FLAG-01-NO TO TRUE
           END-IF.
      *
       2300-GENERATE-SAR-ALERT.
           MOVE SPACES TO REPORT-RECORD
           STRING "SAR ALERT: ACCT=" WS-ACCT-NUMBER
               " BAL=" WS-ACCT-CURR-BAL
               DELIMITED SIZE INTO REPORT-RECORD
           WRITE REPORT-RECORD
           WRITE OUTPUT-RECORD FROM WS-ACCOUNT-RECORD.
      *
       3280-VARIANT-28-STEP-00.
           DISPLAY "Processing variant 28 step 0"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 20
           END-IF
           CONTINUE.
      *
       3281-VARIANT-28-STEP-01.
           DISPLAY "Processing variant 28 step 1"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 20
           END-IF
           CONTINUE.
      *
       3282-VARIANT-28-STEP-02.
           DISPLAY "Processing variant 28 step 2"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 20
           END-IF
           CONTINUE.
      *
       3283-VARIANT-28-STEP-03.
           DISPLAY "Processing variant 28 step 3"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0056 =
                   WS-VARIANT-0056 + 20
           END-IF
           CONTINUE.
      *
       9000-FINALIZE.
           CLOSE INPUT-FILE
           CLOSE OUTPUT-FILE
           PERFORM 9500-WRITE-REPORT-SUMMARY
           CLOSE REPORT-FILE
           CLOSE ERROR-FILE
           DISPLAY "REGSAR15V28 COMPLETE."
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
