package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator025 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator025 {

    public List<String> validate(ComplianceDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField001() != null && dto.getCompField001() < 0) {
            errors.add("compField001 must not be negative");
        }
        if (dto.getCompField004() != null && dto.getCompField004().isBlank()) {
            errors.add("compField004 must not be blank if provided");
        }
        if (dto.getCompField005() != null && dto.getCompField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField005 must not be negative");
        }
        if (dto.getCompField006() != null && dto.getCompField006().isBlank()) {
            errors.add("compField006 must not be blank if provided");
        }
        return errors;
    }
}
