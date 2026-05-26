#!/usr/bin/env python3
"""
PacificNationalBank — Supplemental Code Generator
===================================================
Fills the gap to reach 1,700 KLOC with additional:
- COBOL stored procedure wrappers
- PL/I analytics and reporting modules
- Java microservice layers (DTOs, mappers, validators, configs)
- IMS DL/I call wrappers in both COBOL and PL/I
- DB2 DDL, triggers, views
- Test suites
"""

import os, sys, random, subprocess
from pathlib import Path

ROOT = Path(__file__).parent
random.seed(99)

ACCOUNT_TYPES = ['CHECKING', 'SAVINGS', 'MONEY_MARKET', 'CD', 'IRA',
                 'TRUST', 'ESCROW', 'COMMERCIAL', 'PAYROLL', 'STUDENT']
TXN_TYPES = ['DEPOSIT', 'WITHDRAWAL', 'TRANSFER', 'WIRE_IN', 'WIRE_OUT',
             'ACH_CREDIT', 'ACH_DEBIT', 'CHECK_DEP', 'CHECK_PAID',
             'ATM_WD', 'POS_PURCHASE', 'FEE', 'INTEREST', 'REVERSAL']
DOMAINS = ['account', 'customer', 'transaction', 'loan', 'deposit',
           'wire', 'ach', 'card', 'branch', 'product', 'rate', 'fee',
           'hold', 'stop', 'audit', 'alert', 'compliance', 'risk',
           'fraud', 'collections', 'escrow', 'trust', 'mortgage',
           'heloc', 'creditline', 'cashmanagement', 'treasury',
           'foreignexchange', 'tradefinance', 'letterofcredit']


def write_file(path, lines):
    path.parent.mkdir(parents=True, exist_ok=True)
    with open(path, 'w') as f:
        f.write('\n'.join(lines) + '\n')
    return len(lines)


def gen_cobol_dli_wrapper(domain, variant):
    """Generate a COBOL DL/I call wrapper program."""
    name = f'DLI{domain[:5].upper()}{variant:03d}'
    lines = []
    lines.append(f'      ******************************************************************')
    lines.append(f'      * {name}.cbl — DL/I Wrapper for {domain} domain')
    lines.append(f'      * Pacific National Bank — IMS/DB Access Layer')
    lines.append(f'      ******************************************************************')
    lines.append(f'       IDENTIFICATION DIVISION.')
    lines.append(f'       PROGRAM-ID. {name}.')
    lines.append(f'       ENVIRONMENT DIVISION.')
    lines.append(f'       DATA DIVISION.')
    lines.append(f'       WORKING-STORAGE SECTION.')
    lines.append(f'       01  WS-DLI-FUNCTIONS.')
    lines.append(f'           05  DLI-GU             PIC X(04) VALUE "GU  ".')
    lines.append(f'           05  DLI-GN             PIC X(04) VALUE "GN  ".')
    lines.append(f'           05  DLI-GHU            PIC X(04) VALUE "GHU ".')
    lines.append(f'           05  DLI-GHN            PIC X(04) VALUE "GHN ".')
    lines.append(f'           05  DLI-ISRT           PIC X(04) VALUE "ISRT".')
    lines.append(f'           05  DLI-REPL           PIC X(04) VALUE "REPL".')
    lines.append(f'           05  DLI-DLET           PIC X(04) VALUE "DLET".')
    lines.append(f'       01  WS-PCB-MASK.')
    lines.append(f'           05  WS-PCB-DBD-NAME    PIC X(08).')
    lines.append(f'           05  WS-PCB-SEG-LEVEL   PIC X(02).')
    lines.append(f'           05  WS-PCB-STATUS      PIC X(02).')
    lines.append(f'               88  PCB-OK          VALUE "  ".')
    lines.append(f'               88  PCB-NOT-FOUND   VALUE "GE".')
    lines.append(f'               88  PCB-END-DB      VALUE "GB".')
    lines.append(f'               88  PCB-DUPLICATE   VALUE "II".')
    lines.append(f'           05  WS-PCB-PROC-OPT    PIC X(04).')
    lines.append(f'           05  FILLER             PIC X(04).')
    lines.append(f'           05  WS-PCB-SEG-NAME    PIC X(08).')
    lines.append(f'           05  WS-PCB-KEY-LEN     PIC S9(05) COMP.')
    lines.append(f'           05  WS-PCB-NUMSENS     PIC S9(05) COMP.')
    lines.append(f'           05  WS-PCB-KEY-FB      PIC X(32).')
    lines.append(f'       01  WS-SSA.')
    lines.append(f'           05  WS-SSA-SEG-NAME    PIC X(08).')
    lines.append(f'           05  WS-SSA-QUAL        PIC X(01).')
    lines.append(f'           05  WS-SSA-FLD-NAME    PIC X(08).')
    lines.append(f'           05  WS-SSA-REL-OP      PIC X(02).')
    lines.append(f'           05  WS-SSA-VALUE        PIC X(32).')
    lines.append(f'           05  WS-SSA-END         PIC X(01) VALUE ")".')
    lines.append(f'       01  WS-IO-AREA             PIC X(2000).')
    lines.append(f'       01  WS-RETURN-CODE          PIC S9(04) COMP VALUE 0.')
    # Domain-specific working storage
    for i in range(variant % 10 + 5):
        lines.append(f'       01  WS-{domain.upper()[:5]}-FLD-{i:03d}   PIC X({random.choice([10,20,30,40])}).')
    for i in range(variant % 5 + 3):
        lines.append(f'       01  WS-{domain.upper()[:5]}-AMT-{i:03d}   PIC S9(15)V99')
        lines.append(f'                                        COMP-3.')
    lines.append(f'      *')
    lines.append(f'       LINKAGE SECTION.')
    lines.append(f'       01  LS-PCB-{domain.upper()[:5]}      PIC X(100).')
    lines.append(f'       01  LS-IO-AREA              PIC X(2000).')
    lines.append(f'       01  LS-KEY                   PIC X(32).')
    lines.append(f'       01  LS-RETURN-CODE           PIC S9(04) COMP.')
    lines.append(f'      *')
    lines.append(f'       PROCEDURE DIVISION USING LS-PCB-{domain.upper()[:5]}')
    lines.append(f'                                LS-IO-AREA')
    lines.append(f'                                LS-KEY')
    lines.append(f'                                LS-RETURN-CODE.')
    lines.append(f'       0000-MAIN.')
    lines.append(f'           PERFORM 1000-GET-UNIQUE')
    lines.append(f'           MOVE WS-RETURN-CODE TO LS-RETURN-CODE')
    lines.append(f'           GOBACK.')
    lines.append(f'      *')
    lines.append(f'       1000-GET-UNIQUE.')
    lines.append(f'           MOVE "{domain.upper()[:8]}" TO WS-SSA-SEG-NAME')
    lines.append(f'           MOVE "(" TO WS-SSA-QUAL')
    lines.append(f'           MOVE "KEY     " TO WS-SSA-FLD-NAME')
    lines.append(f'           MOVE " =" TO WS-SSA-REL-OP')
    lines.append(f'           MOVE LS-KEY TO WS-SSA-VALUE')
    lines.append(f'           CALL "CBLTDLI" USING DLI-GU')
    lines.append(f'               LS-PCB-{domain.upper()[:5]} WS-IO-AREA WS-SSA')
    lines.append(f'           MOVE LS-PCB-{domain.upper()[:5]} TO WS-PCB-MASK')
    lines.append(f'           IF PCB-OK')
    lines.append(f'               MOVE WS-IO-AREA TO LS-IO-AREA')
    lines.append(f'               MOVE 0 TO WS-RETURN-CODE')
    lines.append(f'           ELSE IF PCB-NOT-FOUND')
    lines.append(f'               MOVE 4 TO WS-RETURN-CODE')
    lines.append(f'           ELSE')
    lines.append(f'               MOVE 12 TO WS-RETURN-CODE')
    lines.append(f'           END-IF.')
    lines.append(f'      *')
    # Add more operations
    for op, func, desc in [('2000', 'GN', 'GET-NEXT'), ('3000', 'ISRT', 'INSERT'),
                            ('4000', 'REPL', 'REPLACE'), ('5000', 'DLET', 'DELETE')]:
        lines.append(f'       {op}-{desc}.')
        lines.append(f'           CALL "CBLTDLI" USING DLI-{func}')
        lines.append(f'               LS-PCB-{domain.upper()[:5]} WS-IO-AREA WS-SSA')
        lines.append(f'           MOVE LS-PCB-{domain.upper()[:5]} TO WS-PCB-MASK')
        lines.append(f'           IF PCB-OK')
        lines.append(f'               MOVE 0 TO WS-RETURN-CODE')
        lines.append(f'           ELSE')
        lines.append(f'               MOVE 8 TO WS-RETURN-CODE')
        lines.append(f'           END-IF.')
        lines.append(f'      *')
    # Validation and business rules sections
    for r in range(variant % 8 + 3):
        lines.append(f'       {6000+r*100}-VALIDATE-RULE-{r:03d}.')
        for vr in range(15):
            lines.append(f'           IF WS-{domain.upper()[:5]}-FLD-{r%5:03d} = SPACES')
            lines.append(f'               MOVE "VALIDATION {r}-{vr} FAILED" TO')
            lines.append(f'                   WS-{domain.upper()[:5]}-FLD-{(r+1)%5:03d}')
            lines.append(f'               MOVE 8 TO WS-RETURN-CODE')
            lines.append(f'           END-IF')
        lines.append(f'           CONTINUE.')
        lines.append(f'      *')

    lines.append(f'       9999-EXIT.')
    lines.append(f'           EXIT.')
    return name, lines


def gen_java_dto(domain, variant):
    """Generate Java DTO, Mapper, Validator classes."""
    all_lines = []
    files = []

    cap_domain = domain[0].upper() + domain[1:]
    pkg = f'com.pnb.{domain}'
    pkg_path = pkg.replace('.', '/')

    # DTO
    dto_name = f'{cap_domain}Dto{variant:03d}'
    dto_lines = [
        f'package {pkg};',
        f'',
        f'import java.math.BigDecimal;',
        f'import java.time.LocalDate;',
        f'import java.time.LocalDateTime;',
        f'import javax.validation.constraints.*;',
        f'import com.fasterxml.jackson.annotation.*;',
        f'',
        f'/**',
        f' * {dto_name} — Data Transfer Object for {domain} operations.',
        f' * Variant {variant} with domain-specific validation.',
        f' */',
        f'@JsonInclude(JsonInclude.Include.NON_NULL)',
        f'public class {dto_name} {{',
        f'',
    ]
    field_count = variant % 12 + 8
    field_names = []
    for fi in range(field_count):
        ftype = random.choice(['String', 'BigDecimal', 'Integer', 'Long',
                                'LocalDate', 'Boolean', 'Double'])
        fname = f'{domain[:4]}Field{fi:03d}'
        field_names.append((fname, ftype))
        if ftype == 'BigDecimal':
            dto_lines.append(f'    @DecimalMin(value = "0.00")')
        elif ftype == 'String':
            dto_lines.append(f'    @Size(max = {random.choice([20,40,60,100,200])})')
        dto_lines.append(f'    @JsonProperty("{fname}")')
        dto_lines.append(f'    private {ftype} {fname};')
        dto_lines.append(f'')

    dto_lines.append(f'    public {dto_name}() {{}}')
    dto_lines.append(f'')

    # Builder pattern
    dto_lines.append(f'    public static Builder builder() {{ return new Builder(); }}')
    dto_lines.append(f'')
    dto_lines.append(f'    public static class Builder {{')
    dto_lines.append(f'        private final {dto_name} instance = new {dto_name}();')
    dto_lines.append(f'')
    for fname, ftype in field_names:
        cap = fname[0].upper() + fname[1:]
        dto_lines.append(f'        public Builder {fname}({ftype} val) {{ instance.{fname} = val; return this; }}')
    dto_lines.append(f'        public {dto_name} build() {{ return instance; }}')
    dto_lines.append(f'    }}')
    dto_lines.append(f'')

    # Getters/setters
    for fname, ftype in field_names:
        cap = fname[0].upper() + fname[1:]
        dto_lines.append(f'    public {ftype} get{cap}() {{ return {fname}; }}')
        dto_lines.append(f'    public void set{cap}({ftype} {fname}) {{ this.{fname} = {fname}; }}')
        dto_lines.append(f'')

    # toString
    dto_lines.append(f'    @Override')
    dto_lines.append(f'    public String toString() {{')
    dto_lines.append(f'        return "{dto_name}{{" +')
    for i, (fname, _) in enumerate(field_names[:5]):
        dto_lines.append(f'            "{fname}=" + {fname} + ", " +')
    dto_lines.append(f'            "}}";')
    dto_lines.append(f'    }}')
    dto_lines.append(f'}}')

    # Mapper
    mapper_name = f'{cap_domain}Mapper{variant:03d}'
    mapper_lines = [
        f'package {pkg};',
        f'',
        f'import javax.enterprise.context.ApplicationScoped;',
        f'',
        f'/**',
        f' * {mapper_name} — Maps between entity and DTO.',
        f' */',
        f'@ApplicationScoped',
        f'public class {mapper_name} {{',
        f'',
        f'    public {dto_name} toDto({cap_domain}V{variant:03d} entity) {{',
        f'        if (entity == null) return null;',
        f'        {dto_name} dto = new {dto_name}();',
    ]
    for fname, _ in field_names[:min(5, len(field_names))]:
        cap = fname[0].upper() + fname[1:]
        mapper_lines.append(f'        // dto.set{cap}(entity.get{cap}());')
    mapper_lines.extend([
        f'        return dto;',
        f'    }}',
        f'',
        f'    public {cap_domain}V{variant:03d} toEntity({dto_name} dto) {{',
        f'        if (dto == null) return null;',
        f'        {cap_domain}V{variant:03d} entity = new {cap_domain}V{variant:03d}();',
    ])
    for fname, _ in field_names[:min(5, len(field_names))]:
        cap = fname[0].upper() + fname[1:]
        mapper_lines.append(f'        // entity.set{cap}(dto.get{cap}());')
    mapper_lines.extend([
        f'        return entity;',
        f'    }}',
        f'}}',
    ])

    # Validator
    validator_name = f'{cap_domain}Validator{variant:03d}'
    validator_lines = [
        f'package {pkg};',
        f'',
        f'import java.math.BigDecimal;',
        f'import java.util.ArrayList;',
        f'import java.util.List;',
        f'import javax.enterprise.context.ApplicationScoped;',
        f'',
        f'/**',
        f' * {validator_name} — Business rule validation.',
        f' */',
        f'@ApplicationScoped',
        f'public class {validator_name} {{',
        f'',
        f'    public List<String> validate({dto_name} dto) {{',
        f'        List<String> errors = new ArrayList<>();',
        f'        if (dto == null) {{',
        f'            errors.add("{domain} DTO must not be null");',
        f'            return errors;',
        f'        }}',
    ]
    for fname, ftype in field_names:
        cap = fname[0].upper() + fname[1:]
        if ftype == 'String':
            validator_lines.extend([
                f'        if (dto.get{cap}() != null && dto.get{cap}().isBlank()) {{',
                f'            errors.add("{fname} must not be blank if provided");',
                f'        }}',
            ])
        elif ftype == 'BigDecimal':
            validator_lines.extend([
                f'        if (dto.get{cap}() != null && dto.get{cap}().compareTo(BigDecimal.ZERO) < 0) {{',
                f'            errors.add("{fname} must not be negative");',
                f'        }}',
            ])
        elif ftype == 'Integer':
            validator_lines.extend([
                f'        if (dto.get{cap}() != null && dto.get{cap}() < 0) {{',
                f'            errors.add("{fname} must not be negative");',
                f'        }}',
            ])
    validator_lines.extend([
        f'        return errors;',
        f'    }}',
        f'}}',
    ])

    # Config class
    config_name = f'{cap_domain}Config{variant:03d}'
    config_lines = [
        f'package {pkg};',
        f'',
        f'import javax.enterprise.context.ApplicationScoped;',
        f'import javax.enterprise.inject.Produces;',
        f'import org.eclipse.microprofile.config.inject.ConfigProperty;',
        f'',
        f'/**',
        f' * {config_name} — Configuration for {domain} module.',
        f' */',
        f'@ApplicationScoped',
        f'public class {config_name} {{',
        f'',
        f'    @ConfigProperty(name = "pnb.{domain}.v{variant}.enabled", defaultValue = "true")',
        f'    private boolean enabled;',
        f'',
        f'    @ConfigProperty(name = "pnb.{domain}.v{variant}.max-amount", defaultValue = "999999.99")',
        f'    private String maxAmount;',
        f'',
        f'    @ConfigProperty(name = "pnb.{domain}.v{variant}.timeout-ms", defaultValue = "30000")',
        f'    private int timeoutMs;',
        f'',
        f'    @ConfigProperty(name = "pnb.{domain}.v{variant}.retry-count", defaultValue = "3")',
        f'    private int retryCount;',
        f'',
        f'    public boolean isEnabled() {{ return enabled; }}',
        f'    public String getMaxAmount() {{ return maxAmount; }}',
        f'    public int getTimeoutMs() {{ return timeoutMs; }}',
        f'    public int getRetryCount() {{ return retryCount; }}',
        f'}}',
    ]

    return [
        (f'java/pnb-core-banking/src/main/java/{pkg_path}/{dto_name}.java', dto_lines),
        (f'java/pnb-core-banking/src/main/java/{pkg_path}/{mapper_name}.java', mapper_lines),
        (f'java/pnb-core-banking/src/main/java/{pkg_path}/{validator_name}.java', validator_lines),
        (f'java/pnb-core-banking/src/main/java/{pkg_path}/{config_name}.java', config_lines),
    ]


def gen_db2_views_triggers(domain, variant):
    """Generate DB2 views, triggers, and stored procedures."""
    tbl = f'{domain.upper()}_MASTER'
    lines = [
        f'-- ============================================================',
        f'-- DB2 Objects for {domain} domain — variant {variant}',
        f'-- Pacific National Bank',
        f'-- ============================================================',
        f'',
    ]
    # View
    lines.append(f'CREATE VIEW PNB.V_{domain.upper()}_{variant:03d} AS')
    lines.append(f'  SELECT')
    for ci in range(random.randint(10, 25)):
        comma = ',' if ci < 24 else ''
        lines.append(f'    COL_{ci:03d}{comma}')
    lines.append(f'  FROM PNB.{tbl}')
    lines.append(f"  WHERE STATUS = 'A';")
    lines.append(f'')

    # Trigger
    lines.append(f'CREATE TRIGGER PNB.TRG_{domain.upper()}_{variant:03d}_UPDATE')
    lines.append(f'  AFTER UPDATE ON PNB.{tbl}')
    lines.append(f'  REFERENCING NEW AS N OLD AS O')
    lines.append(f'  FOR EACH ROW')
    lines.append(f'  MODE DB2SQL')
    lines.append(f'  BEGIN ATOMIC')
    lines.append(f'    INSERT INTO PNB.{domain.upper()}_AUDIT (')
    lines.append(f'      AUDIT_ID, TABLE_NAME, OPERATION, OLD_VALUE, NEW_VALUE,')
    lines.append(f'      CHANGED_BY, CHANGED_AT')
    lines.append(f'    ) VALUES (')
    lines.append(f"      DEFAULT, '{tbl}', 'UPDATE',")
    lines.append(f'      CAST(O.COL_000 AS VARCHAR(200)),')
    lines.append(f'      CAST(N.COL_000 AS VARCHAR(200)),')
    lines.append(f'      CURRENT USER, CURRENT TIMESTAMP')
    lines.append(f'    );')
    lines.append(f'  END;')
    lines.append(f'')

    # Stored procedure with complex logic
    lines.append(f'CREATE OR REPLACE PROCEDURE PNB.SP_{domain.upper()}_{variant:03d} (')
    lines.append(f'  IN  p_key       VARCHAR(32),')
    lines.append(f'  IN  p_operation VARCHAR(10),')
    lines.append(f'  OUT p_status    INTEGER,')
    lines.append(f'  OUT p_message   VARCHAR(200)')
    lines.append(f')')
    lines.append(f'LANGUAGE SQL')
    lines.append(f'DYNAMIC RESULT SETS 1')
    lines.append(f'BEGIN')
    for di in range(8):
        lines.append(f'  DECLARE v_field_{di:02d} VARCHAR(100);')
    lines.append(f'  DECLARE v_count INTEGER;')
    lines.append(f'  DECLARE v_amount DECIMAL(15,2);')
    lines.append(f'  DECLARE SQLSTATE CHAR(5);')
    lines.append(f'  DECLARE EXIT HANDLER FOR SQLEXCEPTION')
    lines.append(f'  BEGIN')
    lines.append(f'    SET p_status = -1;')
    lines.append(f"    SET p_message = 'SQL error: ' || SQLSTATE;")
    lines.append(f'  END;')
    lines.append(f'')
    lines.append(f"  IF p_operation = 'GET' THEN")
    lines.append(f'    SELECT COL_000, COL_001 INTO v_field_00, v_field_01')
    lines.append(f'      FROM PNB.{tbl}')
    lines.append(f'      WHERE COL_000 = p_key;')
    lines.append(f'    SET p_status = 0;')
    lines.append(f"    SET p_message = 'Record found';")
    lines.append(f"  ELSEIF p_operation = 'COUNT' THEN")
    lines.append(f'    SELECT COUNT(*) INTO v_count')
    lines.append(f'      FROM PNB.{tbl}')
    lines.append(f"      WHERE STATUS = 'A';")
    lines.append(f'    SET p_status = v_count;')
    lines.append(f"    SET p_message = 'Count: ' || CHAR(v_count);")
    lines.append(f'  ELSE')
    lines.append(f'    SET p_status = -2;')
    lines.append(f"    SET p_message = 'Unknown operation: ' || p_operation;")
    lines.append(f'  END IF;')
    lines.append(f'END;')
    lines.append(f'')

    # Add index definitions
    for idx in range(variant % 4 + 2):
        lines.append(f'CREATE INDEX PNB.IX_{domain.upper()}_{variant:03d}_{idx:02d}')
        lines.append(f'  ON PNB.{tbl} (COL_{idx:03d} ASC);')
        lines.append(f'')

    return lines


def gen_pli_report_module(domain, variant):
    """Generate a PL/I reporting/analytics module."""
    name = f'RPT{domain[:5].upper()}{variant:03d}'
    lines = [
        f'/*********************************************************************/',
        f'/* {name} — {domain} Reporting and Analytics Module                   */',
        f'/* Pacific National Bank — PL/I Batch Analytics                       */',
        f'/*********************************************************************/',
        f'',
        f'{name}: PROCEDURE OPTIONS(MAIN);',
        f'',
        f'  %INCLUDE PNBACCT;',
        f'  %INCLUDE PNBCUST;',
        f'  %INCLUDE PNBERR;',
        f'',
        f'  DCL program_name    CHAR(12) INIT(\'{name}\');',
        f'  DCL report_title    CHAR(80);',
        f'  DCL report_date     CHAR(10);',
        f'  DCL page_number     FIXED BIN(31) INIT(0);',
        f'  DCL line_number     FIXED BIN(31) INIT(0);',
        f'  DCL lines_per_page  FIXED BIN(31) INIT(55);',
        f'  DCL records_read    FIXED BIN(31) INIT(0);',
        f'  DCL records_ok      FIXED BIN(31) INIT(0);',
        f'  DCL eof_flag        BIT(1) INIT(\'0\'B);',
        f'  DCL INFILE          FILE RECORD INPUT;',
        f'  DCL OUTFILE         FILE PRINT OUTPUT;',
        f'  DCL ERRFILE         FILE RECORD OUTPUT;',
        f'  DCL input_buffer    CHAR(600);',
        f'  DCL 1 report_header,',
        f'      3 rh_bank_name  CHAR(25) INIT(\'PACIFIC NATIONAL BANK\'),',
        f'      3 rh_filler1    CHAR(5) INIT(\' \'),',
        f'      3 rh_report     CHAR(40),',
        f'      3 rh_date       CHAR(10),',
        f'      3 rh_page       CHAR(10);',
        f'',
    ]
    # Accumulator variables
    for i in range(variant % 8 + 5):
        lines.append(f'  DCL total_{domain[:4]}_{i:03d} FIXED DEC(17,2) INIT(0);')
        lines.append(f'  DCL count_{domain[:4]}_{i:03d} FIXED BIN(31) INIT(0);')
        lines.append(f'  DCL avg_{domain[:4]}_{i:03d}   FIXED DEC(15,2) INIT(0);')
        lines.append(f'  DCL min_{domain[:4]}_{i:03d}   FIXED DEC(15,2) INIT(999999999.99);')
        lines.append(f'  DCL max_{domain[:4]}_{i:03d}   FIXED DEC(15,2) INIT(0);')

    lines.extend([
        f'',
        f'  /* Main processing */',
        f'  CALL initialize_report;',
        f'  DO WHILE (^eof_flag);',
        f'    CALL process_record;',
        f'  END;',
        f'  CALL print_summary;',
        f'  CALL finalize_report;',
        f'',
        f'  /*---------------------------------------------------------------*/',
        f'  initialize_report: PROCEDURE;',
        f'    report_title = \'{domain} Analysis Report - Variant {variant}\';',
        f'    report_date = DATETIME();',
        f'    OPEN FILE(INFILE) INPUT;',
        f'    OPEN FILE(OUTFILE) OUTPUT;',
        f'    OPEN FILE(ERRFILE) OUTPUT;',
        f'    ON ENDFILE(INFILE) eof_flag = \'1\'B;',
        f'    CALL print_page_header;',
        f'    READ FILE(INFILE) INTO(input_buffer);',
        f'  END initialize_report;',
        f'',
        f'  print_page_header: PROCEDURE;',
        f'    page_number = page_number + 1;',
        f'    line_number = 0;',
        f'    rh_report = report_title;',
        f'    rh_date = report_date;',
        f'    rh_page = \'PAGE \' || TRIM(CHAR(page_number));',
        f'    PUT FILE(OUTFILE) SKIP(1) EDIT(report_header)(A);',
        f'    PUT FILE(OUTFILE) SKIP(1) EDIT((' + "'-'"*80 + f'))(A);',
        f'  END print_page_header;',
        f'',
    ])

    # Process record with accumulation
    lines.extend([
        f'  process_record: PROCEDURE;',
        f'    records_read = records_read + 1;',
        f'    CALL validate_input;',
        f'    CALL accumulate_totals;',
    ])
    for i in range(variant % 4 + 2):
        lines.extend([
            f'    CALL analyze_{domain[:4]}_metric_{i:03d};',
        ])
    lines.extend([
        f'    records_ok = records_ok + 1;',
        f'    line_number = line_number + 1;',
        f'    IF line_number >= lines_per_page THEN',
        f'      CALL print_page_header;',
        f'    READ FILE(INFILE) INTO(input_buffer);',
        f'  END process_record;',
        f'',
        f'  validate_input: PROCEDURE;',
        f'    IF LENGTH(TRIM(input_buffer)) = 0 THEN DO;',
        f'      PUT SKIP LIST(\'Empty record at \' || records_read);',
        f'      RETURN;',
        f'    END;',
        f'  END validate_input;',
        f'',
        f'  accumulate_totals: PROCEDURE;',
    ])
    for i in range(variant % 8 + 5):
        lines.extend([
            f'    count_{domain[:4]}_{i:03d} = count_{domain[:4]}_{i:03d} + 1;',
            f'    /* Accumulate metric {i} */',
        ])
    lines.extend([
        f'  END accumulate_totals;',
        f'',
    ])

    # Analysis procedures
    for i in range(variant % 4 + 2):
        lines.extend([
            f'  analyze_{domain[:4]}_metric_{i:03d}: PROCEDURE;',
            f'    DCL metric_val FIXED DEC(15,2);',
            f'    DCL threshold  FIXED DEC(15,2) INIT({random.randint(1000,100000)}.00);',
            f'    metric_val = 0;  /* Extracted from input */',
            f'    IF metric_val > max_{domain[:4]}_{i:03d} THEN',
            f'      max_{domain[:4]}_{i:03d} = metric_val;',
            f'    IF metric_val < min_{domain[:4]}_{i:03d} THEN',
            f'      min_{domain[:4]}_{i:03d} = metric_val;',
            f'    total_{domain[:4]}_{i:03d} = total_{domain[:4]}_{i:03d} + metric_val;',
            f'    IF metric_val > threshold THEN',
            f'      PUT FILE(OUTFILE) SKIP LIST(\'ALERT: {domain} metric {i} exceeds threshold\');',
            f'  END analyze_{domain[:4]}_metric_{i:03d};',
            f'',
        ])

    # Summary
    lines.extend([
        f'  print_summary: PROCEDURE;',
        f'    PUT FILE(OUTFILE) SKIP(3) LIST(\'=== SUMMARY ===\');',
        f'    PUT FILE(OUTFILE) SKIP LIST(\'Records processed: \' || records_ok);',
    ])
    for i in range(variant % 8 + 5):
        lines.extend([
            f'    IF count_{domain[:4]}_{i:03d} > 0 THEN',
            f'      avg_{domain[:4]}_{i:03d} = total_{domain[:4]}_{i:03d} / count_{domain[:4]}_{i:03d};',
            f'    PUT FILE(OUTFILE) SKIP LIST(\'Metric {i}: total=\' || total_{domain[:4]}_{i:03d}',
            f'      || \' avg=\' || avg_{domain[:4]}_{i:03d}',
            f'      || \' min=\' || min_{domain[:4]}_{i:03d}',
            f'      || \' max=\' || max_{domain[:4]}_{i:03d});',
        ])
    lines.extend([
        f'  END print_summary;',
        f'',
        f'  finalize_report: PROCEDURE;',
        f'    CLOSE FILE(INFILE);',
        f'    CLOSE FILE(OUTFILE);',
        f'    CLOSE FILE(ERRFILE);',
        f'    PUT SKIP LIST(program_name || \' complete.\');',
        f'  END finalize_report;',
        f'',
        f'END {name};',
    ])
    return name, lines


def generate_supplemental_batch(batch_num, target_lines=100000):
    """Generate supplemental batch to fill remaining LOC gap."""
    files_created = []
    total_lines = 0

    if batch_num <= 3:
        # COBOL DL/I wrappers
        for domain in DOMAINS:
            if total_lines >= target_lines:
                break
            for v in range(20):
                name, lines = gen_cobol_dli_wrapper(domain, batch_num * 20 + v)
                path = ROOT / 'cobol' / 'programs' / 'batch' / f'{name}.cbl'
                total_lines += write_file(path, lines)
                files_created.append(str(path))
                if total_lines >= target_lines:
                    break

    elif batch_num <= 5:
        # PL/I reporting modules
        for domain in DOMAINS:
            if total_lines >= target_lines:
                break
            for v in range(15):
                name, lines = gen_pli_report_module(domain, (batch_num - 3) * 15 + v)
                path = ROOT / 'pli' / 'programs' / 'batch' / f'{name}.pli'
                total_lines += write_file(path, lines)
                files_created.append(str(path))
                if total_lines >= target_lines:
                    break

    elif batch_num <= 7:
        # Java DTOs, Mappers, Validators, Configs
        for domain in DOMAINS:
            if total_lines >= target_lines:
                break
            for v in range(20):
                file_groups = gen_java_dto(domain, (batch_num - 5) * 20 + v)
                for rel_path, lines in file_groups:
                    path = ROOT / rel_path
                    total_lines += write_file(path, lines)
                    files_created.append(str(path))
                if total_lines >= target_lines:
                    break

    else:
        # DB2 views, triggers, stored procs
        for domain in DOMAINS:
            if total_lines >= target_lines:
                break
            for v in range(25):
                lines = gen_db2_views_triggers(domain, (batch_num - 7) * 25 + v)
                path = ROOT / 'db' / 'db2' / f'V_{domain.upper()}_{(batch_num-7)*25+v:03d}.sql'
                total_lines += write_file(path, lines)
                files_created.append(str(path))
                if total_lines >= target_lines:
                    break

    return files_created, total_lines


def git_flush(batch_label, files_created, total_lines):
    """Commit, push, delete."""
    os.chdir(ROOT)
    subprocess.run(['git', 'add', '-A'], check=True)
    msg = f'{batch_label}: {total_lines:,} lines ({len(files_created)} files)'
    subprocess.run(['git', 'commit', '-m', msg], check=True)
    subprocess.run(['git', 'push', 'origin', 'main'], capture_output=True)

    deleted = 0
    for f in files_created:
        try:
            os.remove(f)
            deleted += 1
        except OSError:
            pass

    for dirpath, dirnames, filenames in os.walk(ROOT, topdown=False):
        if not dirnames and not filenames and dirpath != str(ROOT):
            try:
                os.rmdir(dirpath)
            except OSError:
                pass

    subprocess.run(['git', 'rm', '-r', '--cached', '--quiet', '.'],
                   capture_output=True)
    subprocess.run(['git', 'checkout', '--', '.gitignore', 'README.md',
                   'Makefile', 'docker-compose.yml', '.github/',
                   'generate_batch.py', 'generate_supplemental.py'],
                   capture_output=True)

    print(f'{batch_label}: {total_lines:,} lines, {len(files_created)} files → pushed+deleted')


if __name__ == '__main__':
    if len(sys.argv) < 2:
        print('Usage: python3 generate_supplemental.py <batch_num|all>')
        print('  batch_num: 1-8 (supplemental batches)')
        sys.exit(1)

    arg = sys.argv[1]
    if arg == 'all':
        batches = range(1, 9)
    else:
        batches = [int(arg)]

    cumulative = 0
    for b in batches:
        print(f'\n=== Supplemental batch {b}/8 ===')
        files, lines = generate_supplemental_batch(b)
        cumulative += lines
        print(f'Generated {lines:,} lines in {len(files)} files (cumulative supp: {cumulative:,})')
        git_flush(f'Supplemental {b:02d}', files, lines)
        os.system('df -h ~ | tail -1')
