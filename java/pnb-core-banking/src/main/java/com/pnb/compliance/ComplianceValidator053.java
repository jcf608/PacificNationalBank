package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator053 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator053 {

    public List<String> validate(ComplianceDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField000() != null && dto.getCompField000().isBlank()) {
            errors.add("compField000 must not be blank if provided");
        }
        if (dto.getCompField001() != null && dto.getCompField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField001 must not be negative");
        }
        return errors;
    }
}
