      ******************************************************************
      * CPYACCT.cpy — Account Master Record Layout
      * Pacific National Bank — Core Banking System
      * Used by: ACCTMAST, ACCTINQ, ACCTTXN, EODPROC, STMTGEN
      ******************************************************************
       01  WS-ACCOUNT-RECORD.
           05  WS-ACCT-NUMBER              PIC X(16).
           05  WS-ACCT-TYPE                PIC X(02).
               88  ACCT-CHECKING           VALUE 'CH'.
               88  ACCT-SAVINGS            VALUE 'SV'.
               88  ACCT-MONEY-MARKET       VALUE 'MM'.
               88  ACCT-CD                 VALUE 'CD'.
               88  ACCT-LOAN               VALUE 'LN'.
               88  ACCT-MORTGAGE           VALUE 'MG'.
               88  ACCT-CREDIT-LINE        VALUE 'CL'.
           05  WS-ACCT-STATUS             PIC X(01).
               88  ACCT-ACTIVE            VALUE 'A'.
               88  ACCT-CLOSED            VALUE 'C'.
               88  ACCT-FROZEN            VALUE 'F'.
               88  ACCT-DORMANT           VALUE 'D'.
           05  WS-ACCT-CUST-ID            PIC X(12).
           05  WS-ACCT-BRANCH-CODE        PIC X(06).
           05  WS-ACCT-OPEN-DATE          PIC X(10).
           05  WS-ACCT-CLOSE-DATE         PIC X(10).
           05  WS-ACCT-LAST-TXN-DATE      PIC X(10).
           05  WS-ACCT-BALANCES.
               10  WS-ACCT-CURR-BAL       PIC S9(13)V99 COMP-3.
               10  WS-ACCT-AVAIL-BAL      PIC S9(13)V99 COMP-3.
               10  WS-ACCT-HOLD-AMT       PIC S9(13)V99 COMP-3.
               10  WS-ACCT-PEND-CR        PIC S9(13)V99 COMP-3.
               10  WS-ACCT-PEND-DR        PIC S9(13)V99 COMP-3.
           05  WS-ACCT-INTEREST.
               10  WS-ACCT-INT-RATE       PIC 9(03)V9(06).
               10  WS-ACCT-INT-ACCRUED    PIC S9(11)V99 COMP-3.
               10  WS-ACCT-INT-YTD        PIC S9(11)V99 COMP-3.
               10  WS-ACCT-INT-LAST-POST  PIC X(10).
               10  WS-ACCT-INT-FREQ       PIC X(01).
                   88  INT-DAILY           VALUE 'D'.
                   88  INT-MONTHLY         VALUE 'M'.
                   88  INT-QUARTERLY       VALUE 'Q'.
                   88  INT-ANNUAL          VALUE 'A'.
           05  WS-ACCT-LIMITS.
               10  WS-ACCT-OD-LIMIT       PIC S9(11)V99 COMP-3.
               10  WS-ACCT-DAILY-WD-LMT   PIC S9(11)V99 COMP-3.
               10  WS-ACCT-DAILY-TFR-LMT  PIC S9(11)V99 COMP-3.
           05  WS-ACCT-OFFICER-CODE       PIC X(08).
           05  WS-ACCT-PRODUCT-CODE       PIC X(06).
           05  WS-ACCT-CURRENCY           PIC X(03).
           05  WS-ACCT-TAX-ID             PIC X(11).
           05  WS-ACCT-FLAGS.
               10  WS-ACCT-STMT-FLAG      PIC X(01).
                   88  STMT-PAPER          VALUE 'P'.
                   88  STMT-ELECTRONIC     VALUE 'E'.
                   88  STMT-BOTH           VALUE 'B'.
               10  WS-ACCT-ESCHEAT-FLAG   PIC X(01).
               10  WS-ACCT-GARNISH-FLAG   PIC X(01).
               10  WS-ACCT-LEVY-FLAG      PIC X(01).
               10  WS-ACCT-REG-D-CNT      PIC 9(02).
           05  FILLER                      PIC X(40).
