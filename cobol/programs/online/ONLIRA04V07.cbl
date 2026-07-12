      ******************************************************************
      * ONLIRA04V07.cbl — Online IRA Inquiry V7
      * Pacific National Bank — Online Transaction Processing
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. ONLIRA04V07.
       AUTHOR. PNB-CODE-GENERATOR.
      *
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01  WS-COMMAREA.
           05  WS-CA-FUNCTION           PIC X(04).
               88  CA-INQUIRY            VALUE "INQ ".
               88  CA-ADD                VALUE "ADD ".
               88  CA-UPDATE             VALUE "UPD ".
               88  CA-DELETE             VALUE "DEL ".
           05  WS-CA-RETURN-CODE         PIC X(02).
               88  CA-SUCCESS            VALUE "00".
               88  CA-NOT-FOUND          VALUE "01".
               88  CA-DUPLICATE          VALUE "02".
               88  CA-ERROR              VALUE "99".
           05  WS-CA-MESSAGE             PIC X(60).
           05  WS-CA-ACCT-NUMBER       PIC X(16).
           05  WS-CA-CUST-ID           PIC X(12).
           05  WS-CA-AMOUNT             PIC S9(13)V99 COMP-3.
           05  WS-CA-BALANCE            PIC S9(13)V99 COMP-3.
           05  WS-CA-TXN-TYPE           PIC X(03).
           05  WS-CA-CHANNEL            PIC X(03).
           05  WS-CA-AUTH-CODE          PIC X(10).
           05  WS-OL-FIELD-0021   PIC X(20).
           05  WS-OL-AMT-0021     PIC S9(13)V99
                                    COMP-3.
           05  WS-OL-FIELD-0022   PIC X(20).
           05  WS-OL-AMT-0022     PIC S9(13)V99
                                    COMP-3.
           05  WS-OL-FIELD-0023   PIC X(20).
           05  WS-OL-AMT-0023     PIC S9(13)V99
                                    COMP-3.
           05  WS-OL-FIELD-0024   PIC X(20).
           05  WS-OL-AMT-0024     PIC S9(13)V99
                                    COMP-3.
           05  WS-OL-FIELD-0025   PIC X(20).
           05  WS-OL-AMT-0025     PIC S9(13)V99
                                    COMP-3.
           05  WS-OL-FIELD-0026   PIC X(20).
           05  WS-OL-AMT-0026     PIC S9(13)V99
                                    COMP-3.
           05  WS-OL-FIELD-0027   PIC X(20).
           05  WS-OL-AMT-0027     PIC S9(13)V99
                                    COMP-3.
           05  WS-OL-FIELD-0028   PIC X(20).
           05  WS-OL-AMT-0028     PIC S9(13)V99
                                    COMP-3.
      *
       01  WS-RESPONSE-CODE             PIC S9(08) COMP.
       01  WS-RESPONSE-2                PIC S9(08) COMP.
       01  WS-DB-STATUS                 PIC X(02).
      *
       COPY CPYACCT.
       COPY CPYCUST.
       COPY CPYTXN.
      *
       LINKAGE SECTION.
       01  DFHCOMMAREA                  PIC X(2000).
      *
       PROCEDURE DIVISION.
       0000-MAIN.
           PERFORM 0100-INITIALIZE
           EVALUATE TRUE
               WHEN CA-INQUIRY
                   PERFORM 1000-INQUIRY
               WHEN CA-ADD
                   PERFORM 2000-ADD
               WHEN CA-UPDATE
                   PERFORM 3000-UPDATE
               WHEN CA-DELETE
                   PERFORM 4000-DELETE
               WHEN OTHER
                   MOVE "99" TO WS-CA-RETURN-CODE
                   MOVE "INVALID FUNCTION" TO
                       WS-CA-MESSAGE
           END-EVALUATE
           PERFORM 9000-RETURN.
      *
       0100-INITIALIZE.
           MOVE LOW-VALUES TO WS-CA-RETURN-CODE
           MOVE SPACES TO WS-CA-MESSAGE
           IF EIBCALEN > 0
               MOVE DFHCOMMAREA TO WS-COMMAREA
           END-IF.
      *
       1000-INQUIRY.
           MOVE WS-CA-ACCT-NUMBER TO WS-ACCT-NUMBER
           EXEC CICS READ
               DATASET("ACCTMAST")
               INTO(WS-ACCOUNT-RECORD)
               RIDFLD(WS-ACCT-NUMBER)
               RESP(WS-RESPONSE-CODE)
               RESP2(WS-RESPONSE-2)
           END-EXEC
           EVALUATE WS-RESPONSE-CODE
               WHEN DFHRESP(NORMAL)
                   MOVE "00" TO WS-CA-RETURN-CODE
                   MOVE WS-ACCT-CURR-BAL TO WS-CA-BALANCE
               WHEN DFHRESP(NOTFND)
                   MOVE "01" TO WS-CA-RETURN-CODE
                   MOVE "ACCOUNT NOT FOUND" TO
                       WS-CA-MESSAGE
               WHEN OTHER
                   MOVE "99" TO WS-CA-RETURN-CODE
                   MOVE "DATABASE ERROR" TO WS-CA-MESSAGE
           END-EVALUATE.
      *
       2000-ADD.
           MOVE WS-CA-ACCT-NUMBER TO WS-ACCT-NUMBER
           MOVE WS-CA-CUST-ID TO WS-ACCT-CUST-ID
           MOVE "A" TO WS-ACCT-STATUS
           MOVE 0 TO WS-ACCT-CURR-BAL
           EXEC CICS WRITE
               DATASET("ACCTMAST")
               FROM(WS-ACCOUNT-RECORD)
               RIDFLD(WS-ACCT-NUMBER)
               RESP(WS-RESPONSE-CODE)
           END-EXEC
           IF WS-RESPONSE-CODE = DFHRESP(NORMAL)
               MOVE "00" TO WS-CA-RETURN-CODE
               MOVE "ACCOUNT CREATED" TO WS-CA-MESSAGE
           ELSE
               MOVE "99" TO WS-CA-RETURN-CODE
               MOVE "CREATE FAILED" TO WS-CA-MESSAGE
           END-IF.
      *
       3000-UPDATE.
           MOVE WS-CA-ACCT-NUMBER TO WS-ACCT-NUMBER
           EXEC CICS READ
               DATASET("ACCTMAST")
               INTO(WS-ACCOUNT-RECORD)
               RIDFLD(WS-ACCT-NUMBER)
               UPDATE
               RESP(WS-RESPONSE-CODE)
           END-EXEC
           IF WS-RESPONSE-CODE = DFHRESP(NORMAL)
               ADD WS-CA-AMOUNT TO WS-ACCT-CURR-BAL
               EXEC CICS REWRITE
                   DATASET("ACCTMAST")
                   FROM(WS-ACCOUNT-RECORD)
                   RESP(WS-RESPONSE-CODE)
               END-EXEC
               MOVE "00" TO WS-CA-RETURN-CODE
           ELSE
               MOVE "99" TO WS-CA-RETURN-CODE
           END-IF.
      *
       4000-DELETE.
           MOVE WS-CA-ACCT-NUMBER TO WS-ACCT-NUMBER
           MOVE "C" TO WS-ACCT-STATUS
           EXEC CICS READ
               DATASET("ACCTMAST")
               INTO(WS-ACCOUNT-RECORD)
               RIDFLD(WS-ACCT-NUMBER)
               UPDATE
               RESP(WS-RESPONSE-CODE)
           END-EXEC
           IF WS-RESPONSE-CODE = DFHRESP(NORMAL)
               EXEC CICS REWRITE
                   DATASET("ACCTMAST")
                   FROM(WS-ACCOUNT-RECORD)
                   RESP(WS-RESPONSE-CODE)
               END-EXEC
               MOVE "00" TO WS-CA-RETURN-CODE
               MOVE "ACCOUNT CLOSED" TO WS-CA-MESSAGE
           ELSE
               MOVE "99" TO WS-CA-RETURN-CODE
           END-IF.
      *
       5070-ONLINE-STEP-00.
           EXEC CICS LINK
               PROGRAM("SUB00700")
               COMMAREA(WS-COMMAREA)
               LENGTH(LENGTH OF WS-COMMAREA)
               RESP(WS-RESPONSE-CODE)
           END-EXEC
           IF WS-RESPONSE-CODE NOT =
               DFHRESP(NORMAL)
               MOVE "99" TO WS-CA-RETURN-CODE
               MOVE "LINK FAILED" TO
                   WS-CA-MESSAGE
           END-IF.
           MOVE WS-OL-FIELD-0021
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0022
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0023
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0024
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0025
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0026
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0027
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0028
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0021
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0022
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0023
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0024
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0025
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0026
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0027
               TO WS-CA-MESSAGE
      *
       5071-ONLINE-STEP-01.
           EXEC CICS LINK
               PROGRAM("SUB00701")
               COMMAREA(WS-COMMAREA)
               LENGTH(LENGTH OF WS-COMMAREA)
               RESP(WS-RESPONSE-CODE)
           END-EXEC
           IF WS-RESPONSE-CODE NOT =
               DFHRESP(NORMAL)
               MOVE "99" TO WS-CA-RETURN-CODE
               MOVE "LINK FAILED" TO
                   WS-CA-MESSAGE
           END-IF.
           MOVE WS-OL-FIELD-0021
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0022
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0023
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0024
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0025
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0026
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0027
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0028
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0021
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0022
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0023
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0024
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0025
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0026
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0027
               TO WS-CA-MESSAGE
      *
       5072-ONLINE-STEP-02.
           EXEC CICS LINK
               PROGRAM("SUB00702")
               COMMAREA(WS-COMMAREA)
               LENGTH(LENGTH OF WS-COMMAREA)
               RESP(WS-RESPONSE-CODE)
           END-EXEC
           IF WS-RESPONSE-CODE NOT =
               DFHRESP(NORMAL)
               MOVE "99" TO WS-CA-RETURN-CODE
               MOVE "LINK FAILED" TO
                   WS-CA-MESSAGE
           END-IF.
           MOVE WS-OL-FIELD-0021
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0022
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0023
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0024
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0025
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0026
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0027
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0028
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0021
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0022
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0023
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0024
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0025
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0026
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0027
               TO WS-CA-MESSAGE
      *
       5073-ONLINE-STEP-03.
           EXEC CICS LINK
               PROGRAM("SUB00703")
               COMMAREA(WS-COMMAREA)
               LENGTH(LENGTH OF WS-COMMAREA)
               RESP(WS-RESPONSE-CODE)
           END-EXEC
           IF WS-RESPONSE-CODE NOT =
               DFHRESP(NORMAL)
               MOVE "99" TO WS-CA-RETURN-CODE
               MOVE "LINK FAILED" TO
                   WS-CA-MESSAGE
           END-IF.
           MOVE WS-OL-FIELD-0021
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0022
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0023
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0024
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0025
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0026
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0027
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0028
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0021
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0022
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0023
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0024
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0025
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0026
               TO WS-CA-MESSAGE
           MOVE WS-OL-FIELD-0027
               TO WS-CA-MESSAGE
      *
       9000-RETURN.
           MOVE WS-COMMAREA TO DFHCOMMAREA
           EXEC CICS RETURN
               TRANSID("ONLI")
               COMMAREA(DFHCOMMAREA)
               LENGTH(LENGTH OF DFHCOMMAREA)
           END-EXEC.
