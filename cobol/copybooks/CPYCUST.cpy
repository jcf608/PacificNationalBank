      ******************************************************************
      * CPYCUST.cpy — Customer Master Record Layout
      * Pacific National Bank — Core Banking System
      * Used by: CUSTMAST, CUSTINQ, CUSTSRCH, KYC processing
      ******************************************************************
       01  WS-CUSTOMER-RECORD.
           05  WS-CUST-ID                 PIC X(12).
           05  WS-CUST-TYPE               PIC X(01).
               88  CUST-INDIVIDUAL        VALUE 'I'.
               88  CUST-JOINT             VALUE 'J'.
               88  CUST-CORPORATE         VALUE 'C'.
               88  CUST-TRUST             VALUE 'T'.
               88  CUST-ESTATE            VALUE 'E'.
           05  WS-CUST-STATUS             PIC X(01).
               88  CUST-ACTIVE            VALUE 'A'.
               88  CUST-INACTIVE          VALUE 'I'.
               88  CUST-SUSPENDED         VALUE 'S'.
               88  CUST-DECEASED          VALUE 'D'.
           05  WS-CUST-NAME.
               10  WS-CUST-TITLE          PIC X(05).
               10  WS-CUST-FIRST-NAME     PIC X(30).
               10  WS-CUST-MIDDLE-NAME    PIC X(30).
               10  WS-CUST-LAST-NAME      PIC X(40).
               10  WS-CUST-SUFFIX         PIC X(05).
           05  WS-CUST-DOB                PIC X(10).
           05  WS-CUST-SSN                PIC X(11).
           05  WS-CUST-TIN                PIC X(11).
           05  WS-CUST-ADDRESS.
               10  WS-CUST-ADDR-LINE1     PIC X(40).
               10  WS-CUST-ADDR-LINE2     PIC X(40).
               10  WS-CUST-CITY           PIC X(30).
               10  WS-CUST-STATE          PIC X(02).
               10  WS-CUST-ZIP            PIC X(10).
               10  WS-CUST-COUNTRY        PIC X(03).
           05  WS-CUST-CONTACT.
               10  WS-CUST-PHONE-HOME     PIC X(15).
               10  WS-CUST-PHONE-WORK     PIC X(15).
               10  WS-CUST-PHONE-MOBILE   PIC X(15).
               10  WS-CUST-EMAIL          PIC X(60).
           05  WS-CUST-KYC.
               10  WS-CUST-KYC-STATUS     PIC X(01).
                   88  KYC-VERIFIED        VALUE 'V'.
                   88  KYC-PENDING         VALUE 'P'.
                   88  KYC-FAILED          VALUE 'F'.
                   88  KYC-EXPIRED         VALUE 'E'.
               10  WS-CUST-KYC-DATE       PIC X(10).
               10  WS-CUST-KYC-LEVEL      PIC 9(01).
               10  WS-CUST-ID-TYPE        PIC X(02).
                   88  ID-DL              VALUE 'DL'.
                   88  ID-PASSPORT        VALUE 'PP'.
                   88  ID-STATE-ID        VALUE 'SI'.
                   88  ID-MILITARY        VALUE 'ML'.
               10  WS-CUST-ID-NUMBER      PIC X(20).
               10  WS-CUST-ID-EXPIRY      PIC X(10).
           05  WS-CUST-RISK.
               10  WS-CUST-RISK-RATING    PIC 9(03).
               10  WS-CUST-PEP-FLAG       PIC X(01).
               10  WS-CUST-SAR-FLAG       PIC X(01).
               10  WS-CUST-OFAC-DATE      PIC X(10).
           05  WS-CUST-RELATIONSHIP.
               10  WS-CUST-SINCE-DATE     PIC X(10).
               10  WS-CUST-SEGMENT        PIC X(03).
                   88  SEG-MASS-MARKET    VALUE 'MM '.
                   88  SEG-PREFERRED      VALUE 'PRF'.
                   88  SEG-PRIVATE        VALUE 'PVT'.
                   88  SEG-COMMERCIAL     VALUE 'COM'.
               10  WS-CUST-OFFICER        PIC X(08).
               10  WS-CUST-BRANCH         PIC X(06).
           05  WS-CUST-LAST-UPDATE        PIC X(26).
           05  FILLER                      PIC X(30).
