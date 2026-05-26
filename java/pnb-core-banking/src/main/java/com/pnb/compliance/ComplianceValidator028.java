package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator028 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator028 {

    public List<String> validate(ComplianceDto028 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField000() != null && dto.getCompField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField000 must not be negative");
        }
        if (dto.getCompField001() != null && dto.getCompField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField001 must not be negative");
        }
        if (dto.getCompField003() != null && dto.getCompField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField003 must not be negative");
        }
        if (dto.getCompField006() != null && dto.getCompField006() < 0) {
            errors.add("compField006 must not be negative");
        }
        if (dto.getCompField008() != null && dto.getCompField008().isBlank()) {
            errors.add("compField008 must not be blank if provided");
        }
        if (dto.getCompField009() != null && dto.getCompField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField009 must not be negative");
        }
        if (dto.getCompField010() != null && dto.getCompField010() < 0) {
            errors.add("compField010 must not be negative");
        }
        if (dto.getCompField011() != null && dto.getCompField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField011 must not be negative");
        }
        return errors;
    }
}
