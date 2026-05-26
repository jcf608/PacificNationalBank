package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator055 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator055 {

    public List<String> validate(ComplianceDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField000() != null && dto.getCompField000() < 0) {
            errors.add("compField000 must not be negative");
        }
        if (dto.getCompField002() != null && dto.getCompField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField002 must not be negative");
        }
        if (dto.getCompField005() != null && dto.getCompField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField005 must not be negative");
        }
        if (dto.getCompField010() != null && dto.getCompField010().isBlank()) {
            errors.add("compField010 must not be blank if provided");
        }
        if (dto.getCompField012() != null && dto.getCompField012() < 0) {
            errors.add("compField012 must not be negative");
        }
        if (dto.getCompField014() != null && dto.getCompField014() < 0) {
            errors.add("compField014 must not be negative");
        }
        return errors;
    }
}
