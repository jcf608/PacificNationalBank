package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator038 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator038 {

    public List<String> validate(ComplianceDto038 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField000() != null && dto.getCompField000().isBlank()) {
            errors.add("compField000 must not be blank if provided");
        }
        if (dto.getCompField003() != null && dto.getCompField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField003 must not be negative");
        }
        if (dto.getCompField009() != null && dto.getCompField009() < 0) {
            errors.add("compField009 must not be negative");
        }
        return errors;
    }
}
