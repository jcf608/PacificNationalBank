package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator031 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator031 {

    public List<String> validate(ComplianceDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField001() != null && dto.getCompField001() < 0) {
            errors.add("compField001 must not be negative");
        }
        if (dto.getCompField007() != null && dto.getCompField007() < 0) {
            errors.add("compField007 must not be negative");
        }
        if (dto.getCompField014() != null && dto.getCompField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField014 must not be negative");
        }
        return errors;
    }
}
