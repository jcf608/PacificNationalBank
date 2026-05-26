package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator027 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator027 {

    public List<String> validate(ComplianceDto027 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField000() != null && dto.getCompField000() < 0) {
            errors.add("compField000 must not be negative");
        }
        if (dto.getCompField003() != null && dto.getCompField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField003 must not be negative");
        }
        if (dto.getCompField007() != null && dto.getCompField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField007 must not be negative");
        }
        return errors;
    }
}
