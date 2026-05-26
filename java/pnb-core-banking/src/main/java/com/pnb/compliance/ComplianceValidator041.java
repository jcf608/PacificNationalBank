package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator041 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator041 {

    public List<String> validate(ComplianceDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField004() != null && dto.getCompField004().isBlank()) {
            errors.add("compField004 must not be blank if provided");
        }
        if (dto.getCompField005() != null && dto.getCompField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField005 must not be negative");
        }
        if (dto.getCompField006() != null && dto.getCompField006() < 0) {
            errors.add("compField006 must not be negative");
        }
        if (dto.getCompField007() != null && dto.getCompField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField007 must not be negative");
        }
        if (dto.getCompField008() != null && dto.getCompField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField008 must not be negative");
        }
        if (dto.getCompField011() != null && dto.getCompField011() < 0) {
            errors.add("compField011 must not be negative");
        }
        if (dto.getCompField012() != null && dto.getCompField012().isBlank()) {
            errors.add("compField012 must not be blank if provided");
        }
        return errors;
    }
}
