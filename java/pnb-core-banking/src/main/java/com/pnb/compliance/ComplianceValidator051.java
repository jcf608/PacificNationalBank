package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator051 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator051 {

    public List<String> validate(ComplianceDto051 dto) {
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
        if (dto.getCompField009() != null && dto.getCompField009().isBlank()) {
            errors.add("compField009 must not be blank if provided");
        }
        return errors;
    }
}
