      ******************************************************************
      * GLEQUIT02V14.cbl — EQUITY GL Processing Variant 14
      * Pacific National Bank — Core Banking System
      * Generated batch program
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. GLEQUIT02V14.
       AUTHOR. PNB-CODE-GENERATOR.
       DATE-WRITTEN. 2026-05-26.
       DATE-COMPILED.
      *
      * EQUITY GL Processing Variant 14
      *
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       SOURCE-COMPUTER. LINUX.
       OBJECT-COMPUTER. LINUX.
       INPUT-OUTPUT SECTION.
       FILE-CONTROL.
           SELECT INPUT-FILE ASSIGN TO
               "GLEQUIT02V14-INPUT.DAT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-INPUT-STATUS.
           SELECT OUTPUT-FILE ASSIGN TO
               "GLEQUIT02V14-OUTPUT.DAT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-OUTPUT-STATUS.
           SELECT REPORT-FILE ASSIGN TO
               "GLEQUIT02V14-REPORT.RPT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-REPORT-STATUS.
           SELECT ERROR-FILE ASSIGN TO
               "GLEQUIT02V14-ERRORS.ERR"
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
       01  WS-GL-WORK.
           05  WS-GL-DR-TOTAL          PIC S9(17)V99 COMP-3.
           05  WS-GL-CR-TOTAL          PIC S9(17)V99 COMP-3.
           05  WS-GL-OUT-OF-BAL        PIC S9(17)V99 COMP-3.
           05  WS-GL-ENTRY-COUNT       PIC 9(09).
           05  WS-GL-BATCH-ID          PIC X(12).
           05  WS-GL-REVERSAL-FLAG     PIC X(01).
               88  GL-IS-REVERSAL      VALUE "Y".
               88  GL-NOT-REVERSAL     VALUE "N".
           05  WS-GL-SUSPENSE-01     PIC S9(15)V99
                                        COMP-3.
           05  WS-GL-SUSPENSE-02     PIC S9(15)V99
                                        COMP-3.
           05  WS-GL-SUSPENSE-03     PIC S9(15)V99
                                        COMP-3.
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
       01  WS-VARIANT-0036        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0036            PIC X(01).
           88  FLAG-0036-ON        VALUE "Y".
           88  FLAG-0036-OFF       VALUE "N".
       01  WS-VARIANT-0037        PIC S9(15)V99
                                    COMP-3 VALUE 0.
       01  WS-FLAG-0037            PIC X(01).
           88  FLAG-0037-ON        VALUE "Y".
           88  FLAG-0037-OFF       VALUE "N".
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
           DISPLAY "GLEQUIT02V14 STARTED AT "
               WS-CURR-HOUR ":" WS-CURR-MIN ":"
               WS-CURR-SEC
           SET EOF-NO TO TRUE
           SET NO-ERROR TO TRUE
           OPEN INPUT  INPUT-FILE
           IF WS-INPUT-STATUS NOT = "00"
               DISPLAY "GLEQUIT02V14: ERROR OPENING INPUT FILE"
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
           STRING "PACIFIC NATIONAL BANK - EQUITY GL Processing Variant 14"
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
           MOVE INPUT-RECORD TO WS-GL-JOURNAL-ENTRY
           PERFORM 2100-VALIDATE-JOURNAL
           IF NO-ERROR
               PERFORM 2200-CHECK-BALANCE
               IF NO-ERROR
                   PERFORM 2300-POST-ENTRIES
                   ADD 1 TO WS-RECORDS-WRITTEN
               ELSE
                   PERFORM 2400-SUSPENSE-ENTRY
                   ADD 1 TO WS-RECORDS-REJECTED
               END-IF
           ELSE
               PERFORM 2900-WRITE-ERROR
               ADD 1 TO WS-RECORDS-REJECTED
           END-IF
           READ INPUT-FILE INTO INPUT-RECORD
               AT END SET EOF-YES TO TRUE
           END-READ.
      *
       2100-VALIDATE-JOURNAL.
           SET NO-ERROR TO TRUE
           IF WS-GJ-ENTRY-ID = SPACES
               SET HAS-ERROR TO TRUE
           END-IF
           IF WS-GJ-LINE-COUNT = 0
               SET HAS-ERROR TO TRUE
           END-IF.
      *
       2200-CHECK-BALANCE.
           MOVE 0 TO WS-GL-DR-TOTAL WS-GL-CR-TOTAL
           PERFORM VARYING WS-GJ-LINE-IDX
               FROM 1 BY 1
               UNTIL WS-GJ-LINE-IDX > WS-GJ-LINE-COUNT
               IF WS-GJL-DR-CR(WS-GJ-LINE-IDX) = "D"
                   ADD WS-GJL-AMOUNT(WS-GJ-LINE-IDX)
                       TO WS-GL-DR-TOTAL
               ELSE
                   ADD WS-GJL-AMOUNT(WS-GJ-LINE-IDX)
                       TO WS-GL-CR-TOTAL
               END-IF
           END-PERFORM
           SUBTRACT WS-GL-CR-TOTAL FROM WS-GL-DR-TOTAL
               GIVING WS-GL-OUT-OF-BAL
           IF WS-GL-OUT-OF-BAL NOT = 0
               SET HAS-ERROR TO TRUE
           END-IF.
      *
       2300-POST-ENTRIES.
           ADD 1 TO WS-GL-ENTRY-COUNT
           WRITE OUTPUT-RECORD FROM WS-GL-JOURNAL-ENTRY.
      *
       2400-SUSPENSE-ENTRY.
           DISPLAY "OUT OF BALANCE: " WS-GJ-ENTRY-ID
               " DIFF=" WS-GL-OUT-OF-BAL.
      *
       2900-WRITE-ERROR.
           STRING "GL ERROR: " WS-GJ-ENTRY-ID
               DELIMITED SIZE INTO ERROR-RECORD
           WRITE ERROR-RECORD.
      *
       3140-VARIANT-14-STEP-00.
           DISPLAY "Processing variant 14 step 0"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 20
           END-IF
           CONTINUE.
      *
       3141-VARIANT-14-STEP-01.
           DISPLAY "Processing variant 14 step 1"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 20
           END-IF
           CONTINUE.
      *
       3142-VARIANT-14-STEP-02.
           DISPLAY "Processing variant 14 step 2"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 20
           END-IF
           CONTINUE.
      *
       3143-VARIANT-14-STEP-03.
           DISPLAY "Processing variant 14 step 3"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 20
           END-IF
           CONTINUE.
      *
       3144-VARIANT-14-STEP-04.
           DISPLAY "Processing variant 14 step 4"
           IF WS-RECORDS-READ > 0
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 1
           END-IF
           IF WS-RECORDS-READ > 100
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 2
           END-IF
           IF WS-RECORDS-READ > 200
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 3
           END-IF
           IF WS-RECORDS-READ > 300
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 4
           END-IF
           IF WS-RECORDS-READ > 400
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 5
           END-IF
           IF WS-RECORDS-READ > 500
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 6
           END-IF
           IF WS-RECORDS-READ > 600
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 7
           END-IF
           IF WS-RECORDS-READ > 700
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 8
           END-IF
           IF WS-RECORDS-READ > 800
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 9
           END-IF
           IF WS-RECORDS-READ > 900
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 10
           END-IF
           IF WS-RECORDS-READ > 1000
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 11
           END-IF
           IF WS-RECORDS-READ > 1100
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 12
           END-IF
           IF WS-RECORDS-READ > 1200
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 13
           END-IF
           IF WS-RECORDS-READ > 1300
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 14
           END-IF
           IF WS-RECORDS-READ > 1400
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 15
           END-IF
           IF WS-RECORDS-READ > 1500
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 16
           END-IF
           IF WS-RECORDS-READ > 1600
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 17
           END-IF
           IF WS-RECORDS-READ > 1700
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 18
           END-IF
           IF WS-RECORDS-READ > 1800
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 19
           END-IF
           IF WS-RECORDS-READ > 1900
               COMPUTE WS-VARIANT-0028 =
                   WS-VARIANT-0028 + 20
           END-IF
           CONTINUE.
      *
       9000-FINALIZE.
           CLOSE INPUT-FILE
           CLOSE OUTPUT-FILE
           PERFORM 9500-WRITE-REPORT-SUMMARY
           CLOSE REPORT-FILE
           CLOSE ERROR-FILE
           DISPLAY "GLEQUIT02V14 COMPLETE."
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
