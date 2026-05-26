package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator022 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator022 {

    public List<String> validate(ComplianceDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField000() != null && dto.getCompField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField000 must not be negative");
        }
        if (dto.getCompField006() != null && dto.getCompField006().isBlank()) {
            errors.add("compField006 must not be blank if provided");
        }
        if (dto.getCompField008() != null && dto.getCompField008() < 0) {
            errors.add("compField008 must not be negative");
        }
        if (dto.getCompField009() != null && dto.getCompField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField009 must not be negative");
        }
        if (dto.getCompField011() != null && dto.getCompField011() < 0) {
            errors.add("compField011 must not be negative");
        }
        if (dto.getCompField012() != null && dto.getCompField012() < 0) {
            errors.add("compField012 must not be negative");
        }
        if (dto.getCompField015() != null && dto.getCompField015().isBlank()) {
            errors.add("compField015 must not be blank if provided");
        }
        return errors;
    }
}
