package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator020 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator020 {

    public List<String> validate(ComplianceDto020 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField001() != null && dto.getCompField001() < 0) {
            errors.add("compField001 must not be negative");
        }
        if (dto.getCompField002() != null && dto.getCompField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField002 must not be negative");
        }
        if (dto.getCompField003() != null && dto.getCompField003() < 0) {
            errors.add("compField003 must not be negative");
        }
        if (dto.getCompField011() != null && dto.getCompField011() < 0) {
            errors.add("compField011 must not be negative");
        }
        if (dto.getCompField014() != null && dto.getCompField014().isBlank()) {
            errors.add("compField014 must not be blank if provided");
        }
        return errors;
    }
}
