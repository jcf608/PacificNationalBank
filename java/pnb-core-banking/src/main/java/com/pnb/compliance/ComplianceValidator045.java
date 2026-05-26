package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator045 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator045 {

    public List<String> validate(ComplianceDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField001() != null && dto.getCompField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField001 must not be negative");
        }
        if (dto.getCompField002() != null && dto.getCompField002().isBlank()) {
            errors.add("compField002 must not be blank if provided");
        }
        if (dto.getCompField006() != null && dto.getCompField006().isBlank()) {
            errors.add("compField006 must not be blank if provided");
        }
        if (dto.getCompField007() != null && dto.getCompField007().isBlank()) {
            errors.add("compField007 must not be blank if provided");
        }
        if (dto.getCompField010() != null && dto.getCompField010() < 0) {
            errors.add("compField010 must not be negative");
        }
        return errors;
    }
}
