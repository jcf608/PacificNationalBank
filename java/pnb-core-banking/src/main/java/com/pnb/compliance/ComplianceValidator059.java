package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator059 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator059 {

    public List<String> validate(ComplianceDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField004() != null && dto.getCompField004() < 0) {
            errors.add("compField004 must not be negative");
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
        if (dto.getCompField016() != null && dto.getCompField016().isBlank()) {
            errors.add("compField016 must not be blank if provided");
        }
        return errors;
    }
}
