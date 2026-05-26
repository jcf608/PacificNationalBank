package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator026 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator026 {

    public List<String> validate(ComplianceDto026 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField004() != null && dto.getCompField004() < 0) {
            errors.add("compField004 must not be negative");
        }
        if (dto.getCompField007() != null && dto.getCompField007().isBlank()) {
            errors.add("compField007 must not be blank if provided");
        }
        if (dto.getCompField008() != null && dto.getCompField008() < 0) {
            errors.add("compField008 must not be negative");
        }
        return errors;
    }
}
