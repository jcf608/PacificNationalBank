      ******************************************************************
      * CPYLOAN.cpy — Loan Account Record Layout
      * Pacific National Bank — Lending System
      * Used by: LOANPROC, LOANPMT, INTCALC, LOANSTMT
      ******************************************************************
       01  WS-LOAN-RECORD.
           05  WS-LOAN-NUMBER              PIC X(16).
           05  WS-LOAN-ACCT-NUMBER         PIC X(16).
           05  WS-LOAN-CUST-ID             PIC X(12).
           05  WS-LOAN-TYPE                PIC X(02).
               88  LOAN-PERSONAL           VALUE 'PL'.
               88  LOAN-AUTO               VALUE 'AU'.
               88  LOAN-MORTGAGE           VALUE 'MG'.
               88  LOAN-HELOC              VALUE 'HE'.
               88  LOAN-STUDENT            VALUE 'ST'.
               88  LOAN-BUSINESS           VALUE 'BL'.
               88  LOAN-SBA                VALUE 'SB'.
               88  LOAN-CONSTRUCTION       VALUE 'CN'.
           05  WS-LOAN-STATUS              PIC X(01).
               88  LOAN-CURRENT            VALUE 'C'.
               88  LOAN-DELINQUENT         VALUE 'D'.
               88  LOAN-DEFAULT            VALUE 'X'.
               88  LOAN-PAID-OFF           VALUE 'P'.
               88  LOAN-CHARGED-OFF        VALUE 'O'.
               88  LOAN-FORBEARANCE        VALUE 'F'.
           05  WS-LOAN-AMOUNTS.
               10  WS-LOAN-ORIG-AMOUNT    PIC S9(13)V99 COMP-3.
               10  WS-LOAN-CURR-BALANCE   PIC S9(13)V99 COMP-3.
               10  WS-LOAN-PRINCIPAL-BAL  PIC S9(13)V99 COMP-3.
               10  WS-LOAN-INT-ACCRUED    PIC S9(11)V99 COMP-3.
               10  WS-LOAN-ESCROW-BAL     PIC S9(11)V99 COMP-3.
               10  WS-LOAN-LATE-FEES      PIC S9(09)V99 COMP-3.
           05  WS-LOAN-RATES.
               10  WS-LOAN-INT-RATE       PIC 9(03)V9(06).
               10  WS-LOAN-APR            PIC 9(03)V9(06).
               10  WS-LOAN-RATE-TYPE      PIC X(01).
                   88  RATE-FIXED          VALUE 'F'.
                   88  RATE-VARIABLE       VALUE 'V'.
                   88  RATE-HYBRID         VALUE 'H'.
               10  WS-LOAN-RATE-INDEX     PIC X(05).
               10  WS-LOAN-MARGIN         PIC 9(03)V9(04).
               10  WS-LOAN-RATE-CAP       PIC 9(03)V9(04).
               10  WS-LOAN-RATE-FLOOR     PIC 9(03)V9(04).
               10  WS-LOAN-NEXT-ADJ-DATE  PIC X(10).
           05  WS-LOAN-PAYMENT.
               10  WS-LOAN-PMT-AMOUNT     PIC S9(11)V99 COMP-3.
               10  WS-LOAN-PMT-FREQ       PIC X(01).
                   88  PMT-MONTHLY        VALUE 'M'.
                   88  PMT-BIWEEKLY       VALUE 'B'.
                   88  PMT-WEEKLY         VALUE 'W'.
               10  WS-LOAN-PMT-DUE-DAY    PIC 9(02).
               10  WS-LOAN-NEXT-PMT-DATE  PIC X(10).
               10  WS-LOAN-LAST-PMT-DATE  PIC X(10).
               10  WS-LOAN-LAST-PMT-AMT   PIC S9(11)V99 COMP-3.
               10  WS-LOAN-PMT-COUNT      PIC 9(04).
               10  WS-LOAN-PMT-REMAIN     PIC 9(04).
           05  WS-LOAN-DATES.
               10  WS-LOAN-ORIG-DATE      PIC X(10).
               10  WS-LOAN-MATURITY-DATE  PIC X(10).
               10  WS-LOAN-FIRST-PMT-DATE PIC X(10).
           05  WS-LOAN-DELINQUENCY.
               10  WS-LOAN-DPD            PIC 9(04).
               10  WS-LOAN-TIMES-30       PIC 9(03).
               10  WS-LOAN-TIMES-60       PIC 9(03).
               10  WS-LOAN-TIMES-90       PIC 9(03).
               10  WS-LOAN-LAST-DLQ-DATE  PIC X(10).
           05  WS-LOAN-COLLATERAL.
               10  WS-LOAN-COLL-TYPE      PIC X(02).
               10  WS-LOAN-COLL-VALUE     PIC S9(13)V99 COMP-3.
               10  WS-LOAN-LTV            PIC 9(03)V9(02).
           05  FILLER                       PIC X(30).
