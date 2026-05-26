package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator048 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator048 {

    public List<String> validate(ComplianceDto048 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField003() != null && dto.getCompField003().isBlank()) {
            errors.add("compField003 must not be blank if provided");
        }
        if (dto.getCompField004() != null && dto.getCompField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField004 must not be negative");
        }
        if (dto.getCompField006() != null && dto.getCompField006() < 0) {
            errors.add("compField006 must not be negative");
        }
        return errors;
    }
}
