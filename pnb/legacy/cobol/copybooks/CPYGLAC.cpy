      ******************************************************************
      * CPYGLAC.cpy — General Ledger Account Record Layout
      * Pacific National Bank — GL Subsystem
      * Used by: GLPOST, GLEOD, GLTRIAL, GLRECON
      ******************************************************************
       01  WS-GL-RECORD.
           05  WS-GL-ACCOUNT-NUM           PIC X(12).
           05  WS-GL-ACCOUNT-NAME          PIC X(40).
           05  WS-GL-ACCOUNT-TYPE          PIC X(01).
               88  GL-ASSET               VALUE 'A'.
               88  GL-LIABILITY           VALUE 'L'.
               88  GL-EQUITY              VALUE 'Q'.
               88  GL-REVENUE             VALUE 'R'.
               88  GL-EXPENSE             VALUE 'E'.
           05  WS-GL-NORMAL-BAL            PIC X(01).
               88  GL-NORM-DEBIT          VALUE 'D'.
               88  GL-NORM-CREDIT         VALUE 'C'.
           05  WS-GL-COST-CENTER           PIC X(06).
           05  WS-GL-DEPARTMENT            PIC X(04).
           05  WS-GL-CURRENCY              PIC X(03).
           05  WS-GL-BALANCES.
               10  WS-GL-OPENING-BAL      PIC S9(15)V99 COMP-3.
               10  WS-GL-PERIOD-DR        PIC S9(15)V99 COMP-3.
               10  WS-GL-PERIOD-CR        PIC S9(15)V99 COMP-3.
               10  WS-GL-CLOSING-BAL      PIC S9(15)V99 COMP-3.
               10  WS-GL-YTD-DR           PIC S9(15)V99 COMP-3.
               10  WS-GL-YTD-CR           PIC S9(15)V99 COMP-3.
           05  WS-GL-STATUS                PIC X(01).
               88  GL-ACTIVE              VALUE 'A'.
               88  GL-FROZEN              VALUE 'F'.
               88  GL-CLOSED              VALUE 'C'.
           05  WS-GL-LAST-POST-DATE        PIC X(10).
           05  WS-GL-PERIOD                PIC 9(02).
           05  WS-GL-FISCAL-YEAR           PIC 9(04).
           05  FILLER                       PIC X(20).

      ******************************************************************
      * GL Journal Entry Layout
      ******************************************************************
       01  WS-GL-JOURNAL-ENTRY.
           05  WS-GJ-ENTRY-ID             PIC X(16).
           05  WS-GJ-DATE                 PIC X(10).
           05  WS-GJ-SOURCE               PIC X(06).
           05  WS-GJ-DESCRIPTION          PIC X(60).
           05  WS-GJ-STATUS               PIC X(01).
               88  GJ-UNPOSTED            VALUE 'U'.
               88  GJ-POSTED              VALUE 'P'.
               88  GJ-REVERSED            VALUE 'R'.
           05  WS-GJ-LINE-COUNT           PIC 9(04).
           05  WS-GJ-LINES                OCCURS 20 TIMES
                                            INDEXED BY WS-GJ-LINE-IDX.
               10  WS-GJL-GL-ACCT         PIC X(12).
               10  WS-GJL-DR-CR           PIC X(01).
               10  WS-GJL-AMOUNT          PIC S9(15)V99 COMP-3.
               10  WS-GJL-MEMO            PIC X(40).
