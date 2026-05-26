package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator049 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator049 {

    public List<String> validate(ComplianceDto049 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField001() != null && dto.getCompField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField001 must not be negative");
        }
        if (dto.getCompField004() != null && dto.getCompField004() < 0) {
            errors.add("compField004 must not be negative");
        }
        return errors;
    }
}
