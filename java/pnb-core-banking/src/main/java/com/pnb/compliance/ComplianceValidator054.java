package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator054 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator054 {

    public List<String> validate(ComplianceDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField007() != null && dto.getCompField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField007 must not be negative");
        }
        if (dto.getCompField009() != null && dto.getCompField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField009 must not be negative");
        }
        if (dto.getCompField011() != null && dto.getCompField011() < 0) {
            errors.add("compField011 must not be negative");
        }
        if (dto.getCompField013() != null && dto.getCompField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField013 must not be negative");
        }
        return errors;
    }
}
