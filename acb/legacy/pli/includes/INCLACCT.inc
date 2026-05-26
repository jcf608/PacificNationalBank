/* **************************************************************** */
/* INCLACCT.inc — ACB account master (mirror of PNB CPYACCT)         */
/* Atlantic Commerce Bank — IMS/DB segment layout                     */
/* **************************************************************** */
DCL 1 ACCT_REC BASED,
      2 ACCT_NUMBER      CHAR(16),
      2 ACCT_TYPE        CHAR(2),
      2 ACCT_STATUS      CHAR(1),
      2 ACCT_CUST_ID     CHAR(12),
      2 ACCT_BRANCH      CHAR(6),
      2 ACCT_CURR_BAL    FIXED DEC(15,2),
      2 ACCT_AVAIL_BAL   FIXED DEC(15,2),
      2 ACCT_CURRENCY    CHAR(3);
