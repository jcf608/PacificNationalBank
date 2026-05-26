      ******************************************************************
      * CPYTXN.cpy — Transaction Record Layout
      * Pacific National Bank — Core Banking System
      * Used by: TXNPOST, TXNAUTH, TXNREV, EODPROC, STMTGEN
      ******************************************************************
       01  WS-TRANSACTION-RECORD.
           05  WS-TXN-ID                  PIC X(20).
           05  WS-TXN-TYPE                PIC X(03).
               88  TXN-DEPOSIT            VALUE 'DEP'.
               88  TXN-WITHDRAWAL         VALUE 'WDL'.
               88  TXN-TRANSFER           VALUE 'TFR'.
               88  TXN-PAYMENT            VALUE 'PMT'.
               88  TXN-FEE                VALUE 'FEE'.
               88  TXN-INTEREST           VALUE 'INT'.
               88  TXN-REVERSAL           VALUE 'REV'.
               88  TXN-ADJUSTMENT         VALUE 'ADJ'.
               88  TXN-ACH-CREDIT         VALUE 'ACR'.
               88  TXN-ACH-DEBIT          VALUE 'ADB'.
               88  TXN-WIRE-IN            VALUE 'WRI'.
               88  TXN-WIRE-OUT           VALUE 'WRO'.
               88  TXN-CHECK-DEP          VALUE 'CKD'.
               88  TXN-CHECK-PAID         VALUE 'CKP'.
               88  TXN-ATM-WD             VALUE 'ATM'.
               88  TXN-POS                VALUE 'POS'.
           05  WS-TXN-STATUS              PIC X(01).
               88  TXN-PENDING            VALUE 'P'.
               88  TXN-POSTED             VALUE 'T'.
               88  TXN-REVERSED           VALUE 'R'.
               88  TXN-DECLINED           VALUE 'D'.
               88  TXN-HELD               VALUE 'H'.
           05  WS-TXN-ACCT-NUMBER         PIC X(16).
           05  WS-TXN-CONTRA-ACCT         PIC X(16).
           05  WS-TXN-AMOUNT              PIC S9(13)V99 COMP-3.
           05  WS-TXN-CURRENCY            PIC X(03).
           05  WS-TXN-DATETIME.
               10  WS-TXN-DATE            PIC X(10).
               10  WS-TXN-TIME            PIC X(08).
               10  WS-TXN-TIMEZONE        PIC X(06).
           05  WS-TXN-EFFECTIVE-DATE      PIC X(10).
           05  WS-TXN-POST-DATE           PIC X(10).
           05  WS-TXN-DESCRIPTION         PIC X(60).
           05  WS-TXN-REFERENCE           PIC X(20).
           05  WS-TXN-CHECK-NUMBER        PIC X(10).
           05  WS-TXN-CHANNEL             PIC X(03).
               88  CHAN-BRANCH            VALUE 'BRN'.
               88  CHAN-ATM               VALUE 'ATM'.
               88  CHAN-ONLINE            VALUE 'ONL'.
               88  CHAN-MOBILE            VALUE 'MOB'.
               88  CHAN-PHONE             VALUE 'PHN'.
               88  CHAN-ACH               VALUE 'ACH'.
               88  CHAN-WIRE              VALUE 'WIR'.
               88  CHAN-INTERNAL          VALUE 'INT'.
           05  WS-TXN-TELLER-ID           PIC X(08).
           05  WS-TXN-BRANCH-CODE         PIC X(06).
           05  WS-TXN-AUTH-CODE           PIC X(10).
           05  WS-TXN-BATCH-ID            PIC X(12).
           05  WS-TXN-TRACE-NUM           PIC X(15).
           05  WS-TXN-RUNNING-BAL         PIC S9(13)V99 COMP-3.
           05  FILLER                      PIC X(30).

      ******************************************************************
      * Transaction codes summary table
      ******************************************************************
       01  WS-TXN-CODE-TABLE.
           05  WS-TXN-CODE-ENTRY          OCCURS 20 TIMES
                                           INDEXED BY WS-TXN-CODE-IDX.
               10  WS-TC-CODE             PIC X(03).
               10  WS-TC-DESC             PIC X(30).
               10  WS-TC-DR-CR            PIC X(01).
                   88  TC-DEBIT           VALUE 'D'.
                   88  TC-CREDIT          VALUE 'C'.
               10  WS-TC-REVERSAL-CODE    PIC X(03).
