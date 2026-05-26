package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator029 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator029 {

    public List<String> validate(ComplianceDto029 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField000() != null && dto.getCompField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField000 must not be negative");
        }
        if (dto.getCompField007() != null && dto.getCompField007().isBlank()) {
            errors.add("compField007 must not be blank if provided");
        }
        if (dto.getCompField008() != null && dto.getCompField008().isBlank()) {
            errors.add("compField008 must not be blank if provided");
        }
        if (dto.getCompField011() != null && dto.getCompField011().isBlank()) {
            errors.add("compField011 must not be blank if provided");
        }
        return errors;
    }
}
