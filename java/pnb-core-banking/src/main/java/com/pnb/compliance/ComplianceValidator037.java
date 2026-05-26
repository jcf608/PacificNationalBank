package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator037 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator037 {

    public List<String> validate(ComplianceDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField000() != null && dto.getCompField000() < 0) {
            errors.add("compField000 must not be negative");
        }
        if (dto.getCompField004() != null && dto.getCompField004() < 0) {
            errors.add("compField004 must not be negative");
        }
        if (dto.getCompField005() != null && dto.getCompField005() < 0) {
            errors.add("compField005 must not be negative");
        }
        return errors;
    }
}
