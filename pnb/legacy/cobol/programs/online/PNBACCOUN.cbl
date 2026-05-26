      ******************************************************************
      * PNBACCOUN.cbl — Account master & balances
      * Pacific National Bank (PNB) — IMS/TM online program
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. PNBACCOUN.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
           COPY CPYACCT.
           COPY CPYCUST.
           COPY CPYTXN.
       01  WS-COMMAREA.
           05  WS-CA-FUNCTION           PIC X(04).
           05  WS-CA-ACCT-NUM             PIC X(16).
           05  WS-CA-AMOUNT               PIC S9(13)V99 COMP-3.
           05  WS-CA-RETURN-CODE          PIC X(02).
           05  WS-CA-MESSAGE              PIC X(60).
       LINKAGE SECTION.
       01  DFHCOMMAREA                  PIC X(512).
       PROCEDURE DIVISION.
           MOVE DFHCOMMAREA TO WS-COMMAREA
           EVALUATE WS-CA-FUNCTION
               WHEN 'INQ '
                   PERFORM 1000-INQUIRE
               WHEN 'POST'
                   PERFORM 2000-POST
               WHEN OTHER
                   MOVE '96' TO WS-CA-RETURN-CODE
                   MOVE 'INVALID FUNCTION' TO WS-CA-MESSAGE
           END-EVALUATE
           MOVE WS-COMMAREA TO DFHCOMMAREA
           EXEC CICS RETURN END-EXEC.
       1000-INQUIRE.
           MOVE '00' TO WS-CA-RETURN-CODE
           MOVE 'PNB account OK' TO WS-CA-MESSAGE.
       2000-POST.
           MOVE '00' TO WS-CA-RETURN-CODE
           MOVE 'POSTED' TO WS-CA-MESSAGE.
