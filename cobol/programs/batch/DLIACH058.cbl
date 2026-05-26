      ******************************************************************
      * DLIACH058.cbl — DL/I Wrapper for ach domain
      * Pacific National Bank — IMS/DB Access Layer
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. DLIACH058.
       ENVIRONMENT DIVISION.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01  WS-DLI-FUNCTIONS.
           05  DLI-GU             PIC X(04) VALUE "GU  ".
           05  DLI-GN             PIC X(04) VALUE "GN  ".
           05  DLI-GHU            PIC X(04) VALUE "GHU ".
           05  DLI-GHN            PIC X(04) VALUE "GHN ".
           05  DLI-ISRT           PIC X(04) VALUE "ISRT".
           05  DLI-REPL           PIC X(04) VALUE "REPL".
           05  DLI-DLET           PIC X(04) VALUE "DLET".
       01  WS-PCB-MASK.
           05  WS-PCB-DBD-NAME    PIC X(08).
           05  WS-PCB-SEG-LEVEL   PIC X(02).
           05  WS-PCB-STATUS      PIC X(02).
               88  PCB-OK          VALUE "  ".
               88  PCB-NOT-FOUND   VALUE "GE".
               88  PCB-END-DB      VALUE "GB".
               88  PCB-DUPLICATE   VALUE "II".
           05  WS-PCB-PROC-OPT    PIC X(04).
           05  FILLER             PIC X(04).
           05  WS-PCB-SEG-NAME    PIC X(08).
           05  WS-PCB-KEY-LEN     PIC S9(05) COMP.
           05  WS-PCB-NUMSENS     PIC S9(05) COMP.
           05  WS-PCB-KEY-FB      PIC X(32).
       01  WS-SSA.
           05  WS-SSA-SEG-NAME    PIC X(08).
           05  WS-SSA-QUAL        PIC X(01).
           05  WS-SSA-FLD-NAME    PIC X(08).
           05  WS-SSA-REL-OP      PIC X(02).
           05  WS-SSA-VALUE        PIC X(32).
           05  WS-SSA-END         PIC X(01) VALUE ")".
       01  WS-IO-AREA             PIC X(2000).
       01  WS-RETURN-CODE          PIC S9(04) COMP VALUE 0.
       01  WS-ACH-FLD-000   PIC X(30).
       01  WS-ACH-FLD-001   PIC X(30).
       01  WS-ACH-FLD-002   PIC X(40).
       01  WS-ACH-FLD-003   PIC X(10).
       01  WS-ACH-FLD-004   PIC X(30).
       01  WS-ACH-FLD-005   PIC X(10).
       01  WS-ACH-FLD-006   PIC X(20).
       01  WS-ACH-FLD-007   PIC X(10).
       01  WS-ACH-FLD-008   PIC X(20).
       01  WS-ACH-FLD-009   PIC X(30).
       01  WS-ACH-FLD-010   PIC X(30).
       01  WS-ACH-FLD-011   PIC X(30).
       01  WS-ACH-FLD-012   PIC X(40).
       01  WS-ACH-AMT-000   PIC S9(15)V99
                                        COMP-3.
       01  WS-ACH-AMT-001   PIC S9(15)V99
                                        COMP-3.
       01  WS-ACH-AMT-002   PIC S9(15)V99
                                        COMP-3.
       01  WS-ACH-AMT-003   PIC S9(15)V99
                                        COMP-3.
       01  WS-ACH-AMT-004   PIC S9(15)V99
                                        COMP-3.
       01  WS-ACH-AMT-005   PIC S9(15)V99
                                        COMP-3.
      *
       LINKAGE SECTION.
       01  LS-PCB-ACH      PIC X(100).
       01  LS-IO-AREA              PIC X(2000).
       01  LS-KEY                   PIC X(32).
       01  LS-RETURN-CODE           PIC S9(04) COMP.
      *
       PROCEDURE DIVISION USING LS-PCB-ACH
                                LS-IO-AREA
                                LS-KEY
                                LS-RETURN-CODE.
       0000-MAIN.
           PERFORM 1000-GET-UNIQUE
           MOVE WS-RETURN-CODE TO LS-RETURN-CODE
           GOBACK.
      *
       1000-GET-UNIQUE.
           MOVE "ACH" TO WS-SSA-SEG-NAME
           MOVE "(" TO WS-SSA-QUAL
           MOVE "KEY     " TO WS-SSA-FLD-NAME
           MOVE " =" TO WS-SSA-REL-OP
           MOVE LS-KEY TO WS-SSA-VALUE
           CALL "CBLTDLI" USING DLI-GU
               LS-PCB-ACH WS-IO-AREA WS-SSA
           MOVE LS-PCB-ACH TO WS-PCB-MASK
           IF PCB-OK
               MOVE WS-IO-AREA TO LS-IO-AREA
               MOVE 0 TO WS-RETURN-CODE
           ELSE IF PCB-NOT-FOUND
               MOVE 4 TO WS-RETURN-CODE
           ELSE
               MOVE 12 TO WS-RETURN-CODE
           END-IF.
      *
       2000-GET-NEXT.
           CALL "CBLTDLI" USING DLI-GN
               LS-PCB-ACH WS-IO-AREA WS-SSA
           MOVE LS-PCB-ACH TO WS-PCB-MASK
           IF PCB-OK
               MOVE 0 TO WS-RETURN-CODE
           ELSE
               MOVE 8 TO WS-RETURN-CODE
           END-IF.
      *
       3000-INSERT.
           CALL "CBLTDLI" USING DLI-ISRT
               LS-PCB-ACH WS-IO-AREA WS-SSA
           MOVE LS-PCB-ACH TO WS-PCB-MASK
           IF PCB-OK
               MOVE 0 TO WS-RETURN-CODE
           ELSE
               MOVE 8 TO WS-RETURN-CODE
           END-IF.
      *
       4000-REPLACE.
           CALL "CBLTDLI" USING DLI-REPL
               LS-PCB-ACH WS-IO-AREA WS-SSA
           MOVE LS-PCB-ACH TO WS-PCB-MASK
           IF PCB-OK
               MOVE 0 TO WS-RETURN-CODE
           ELSE
               MOVE 8 TO WS-RETURN-CODE
           END-IF.
      *
       5000-DELETE.
           CALL "CBLTDLI" USING DLI-DLET
               LS-PCB-ACH WS-IO-AREA WS-SSA
           MOVE LS-PCB-ACH TO WS-PCB-MASK
           IF PCB-OK
               MOVE 0 TO WS-RETURN-CODE
           ELSE
               MOVE 8 TO WS-RETURN-CODE
           END-IF.
      *
       6000-VALIDATE-RULE-000.
           IF WS-ACH-FLD-000 = SPACES
               MOVE "VALIDATION 0-0 FAILED" TO
                   WS-ACH-FLD-001
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-000 = SPACES
               MOVE "VALIDATION 0-1 FAILED" TO
                   WS-ACH-FLD-001
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-000 = SPACES
               MOVE "VALIDATION 0-2 FAILED" TO
                   WS-ACH-FLD-001
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-000 = SPACES
               MOVE "VALIDATION 0-3 FAILED" TO
                   WS-ACH-FLD-001
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-000 = SPACES
               MOVE "VALIDATION 0-4 FAILED" TO
                   WS-ACH-FLD-001
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-000 = SPACES
               MOVE "VALIDATION 0-5 FAILED" TO
                   WS-ACH-FLD-001
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-000 = SPACES
               MOVE "VALIDATION 0-6 FAILED" TO
                   WS-ACH-FLD-001
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-000 = SPACES
               MOVE "VALIDATION 0-7 FAILED" TO
                   WS-ACH-FLD-001
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-000 = SPACES
               MOVE "VALIDATION 0-8 FAILED" TO
                   WS-ACH-FLD-001
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-000 = SPACES
               MOVE "VALIDATION 0-9 FAILED" TO
                   WS-ACH-FLD-001
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-000 = SPACES
               MOVE "VALIDATION 0-10 FAILED" TO
                   WS-ACH-FLD-001
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-000 = SPACES
               MOVE "VALIDATION 0-11 FAILED" TO
                   WS-ACH-FLD-001
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-000 = SPACES
               MOVE "VALIDATION 0-12 FAILED" TO
                   WS-ACH-FLD-001
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-000 = SPACES
               MOVE "VALIDATION 0-13 FAILED" TO
                   WS-ACH-FLD-001
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-000 = SPACES
               MOVE "VALIDATION 0-14 FAILED" TO
                   WS-ACH-FLD-001
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           CONTINUE.
      *
       6100-VALIDATE-RULE-001.
           IF WS-ACH-FLD-001 = SPACES
               MOVE "VALIDATION 1-0 FAILED" TO
                   WS-ACH-FLD-002
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-001 = SPACES
               MOVE "VALIDATION 1-1 FAILED" TO
                   WS-ACH-FLD-002
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-001 = SPACES
               MOVE "VALIDATION 1-2 FAILED" TO
                   WS-ACH-FLD-002
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-001 = SPACES
               MOVE "VALIDATION 1-3 FAILED" TO
                   WS-ACH-FLD-002
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-001 = SPACES
               MOVE "VALIDATION 1-4 FAILED" TO
                   WS-ACH-FLD-002
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-001 = SPACES
               MOVE "VALIDATION 1-5 FAILED" TO
                   WS-ACH-FLD-002
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-001 = SPACES
               MOVE "VALIDATION 1-6 FAILED" TO
                   WS-ACH-FLD-002
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-001 = SPACES
               MOVE "VALIDATION 1-7 FAILED" TO
                   WS-ACH-FLD-002
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-001 = SPACES
               MOVE "VALIDATION 1-8 FAILED" TO
                   WS-ACH-FLD-002
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-001 = SPACES
               MOVE "VALIDATION 1-9 FAILED" TO
                   WS-ACH-FLD-002
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-001 = SPACES
               MOVE "VALIDATION 1-10 FAILED" TO
                   WS-ACH-FLD-002
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-001 = SPACES
               MOVE "VALIDATION 1-11 FAILED" TO
                   WS-ACH-FLD-002
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-001 = SPACES
               MOVE "VALIDATION 1-12 FAILED" TO
                   WS-ACH-FLD-002
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-001 = SPACES
               MOVE "VALIDATION 1-13 FAILED" TO
                   WS-ACH-FLD-002
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-001 = SPACES
               MOVE "VALIDATION 1-14 FAILED" TO
                   WS-ACH-FLD-002
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           CONTINUE.
      *
       6200-VALIDATE-RULE-002.
           IF WS-ACH-FLD-002 = SPACES
               MOVE "VALIDATION 2-0 FAILED" TO
                   WS-ACH-FLD-003
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-002 = SPACES
               MOVE "VALIDATION 2-1 FAILED" TO
                   WS-ACH-FLD-003
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-002 = SPACES
               MOVE "VALIDATION 2-2 FAILED" TO
                   WS-ACH-FLD-003
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-002 = SPACES
               MOVE "VALIDATION 2-3 FAILED" TO
                   WS-ACH-FLD-003
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-002 = SPACES
               MOVE "VALIDATION 2-4 FAILED" TO
                   WS-ACH-FLD-003
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-002 = SPACES
               MOVE "VALIDATION 2-5 FAILED" TO
                   WS-ACH-FLD-003
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-002 = SPACES
               MOVE "VALIDATION 2-6 FAILED" TO
                   WS-ACH-FLD-003
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-002 = SPACES
               MOVE "VALIDATION 2-7 FAILED" TO
                   WS-ACH-FLD-003
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-002 = SPACES
               MOVE "VALIDATION 2-8 FAILED" TO
                   WS-ACH-FLD-003
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-002 = SPACES
               MOVE "VALIDATION 2-9 FAILED" TO
                   WS-ACH-FLD-003
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-002 = SPACES
               MOVE "VALIDATION 2-10 FAILED" TO
                   WS-ACH-FLD-003
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-002 = SPACES
               MOVE "VALIDATION 2-11 FAILED" TO
                   WS-ACH-FLD-003
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-002 = SPACES
               MOVE "VALIDATION 2-12 FAILED" TO
                   WS-ACH-FLD-003
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-002 = SPACES
               MOVE "VALIDATION 2-13 FAILED" TO
                   WS-ACH-FLD-003
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-002 = SPACES
               MOVE "VALIDATION 2-14 FAILED" TO
                   WS-ACH-FLD-003
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           CONTINUE.
      *
       6300-VALIDATE-RULE-003.
           IF WS-ACH-FLD-003 = SPACES
               MOVE "VALIDATION 3-0 FAILED" TO
                   WS-ACH-FLD-004
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-003 = SPACES
               MOVE "VALIDATION 3-1 FAILED" TO
                   WS-ACH-FLD-004
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-003 = SPACES
               MOVE "VALIDATION 3-2 FAILED" TO
                   WS-ACH-FLD-004
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-003 = SPACES
               MOVE "VALIDATION 3-3 FAILED" TO
                   WS-ACH-FLD-004
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-003 = SPACES
               MOVE "VALIDATION 3-4 FAILED" TO
                   WS-ACH-FLD-004
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-003 = SPACES
               MOVE "VALIDATION 3-5 FAILED" TO
                   WS-ACH-FLD-004
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-003 = SPACES
               MOVE "VALIDATION 3-6 FAILED" TO
                   WS-ACH-FLD-004
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-003 = SPACES
               MOVE "VALIDATION 3-7 FAILED" TO
                   WS-ACH-FLD-004
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-003 = SPACES
               MOVE "VALIDATION 3-8 FAILED" TO
                   WS-ACH-FLD-004
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-003 = SPACES
               MOVE "VALIDATION 3-9 FAILED" TO
                   WS-ACH-FLD-004
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-003 = SPACES
               MOVE "VALIDATION 3-10 FAILED" TO
                   WS-ACH-FLD-004
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-003 = SPACES
               MOVE "VALIDATION 3-11 FAILED" TO
                   WS-ACH-FLD-004
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-003 = SPACES
               MOVE "VALIDATION 3-12 FAILED" TO
                   WS-ACH-FLD-004
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-003 = SPACES
               MOVE "VALIDATION 3-13 FAILED" TO
                   WS-ACH-FLD-004
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-003 = SPACES
               MOVE "VALIDATION 3-14 FAILED" TO
                   WS-ACH-FLD-004
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           CONTINUE.
      *
       6400-VALIDATE-RULE-004.
           IF WS-ACH-FLD-004 = SPACES
               MOVE "VALIDATION 4-0 FAILED" TO
                   WS-ACH-FLD-000
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-004 = SPACES
               MOVE "VALIDATION 4-1 FAILED" TO
                   WS-ACH-FLD-000
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-004 = SPACES
               MOVE "VALIDATION 4-2 FAILED" TO
                   WS-ACH-FLD-000
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-004 = SPACES
               MOVE "VALIDATION 4-3 FAILED" TO
                   WS-ACH-FLD-000
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-004 = SPACES
               MOVE "VALIDATION 4-4 FAILED" TO
                   WS-ACH-FLD-000
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-004 = SPACES
               MOVE "VALIDATION 4-5 FAILED" TO
                   WS-ACH-FLD-000
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-004 = SPACES
               MOVE "VALIDATION 4-6 FAILED" TO
                   WS-ACH-FLD-000
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-004 = SPACES
               MOVE "VALIDATION 4-7 FAILED" TO
                   WS-ACH-FLD-000
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-004 = SPACES
               MOVE "VALIDATION 4-8 FAILED" TO
                   WS-ACH-FLD-000
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-004 = SPACES
               MOVE "VALIDATION 4-9 FAILED" TO
                   WS-ACH-FLD-000
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-004 = SPACES
               MOVE "VALIDATION 4-10 FAILED" TO
                   WS-ACH-FLD-000
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-004 = SPACES
               MOVE "VALIDATION 4-11 FAILED" TO
                   WS-ACH-FLD-000
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-004 = SPACES
               MOVE "VALIDATION 4-12 FAILED" TO
                   WS-ACH-FLD-000
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-004 = SPACES
               MOVE "VALIDATION 4-13 FAILED" TO
                   WS-ACH-FLD-000
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           IF WS-ACH-FLD-004 = SPACES
               MOVE "VALIDATION 4-14 FAILED" TO
                   WS-ACH-FLD-000
               MOVE 8 TO WS-RETURN-CODE
           END-IF
           CONTINUE.
      *
       9999-EXIT.
           EXIT.
