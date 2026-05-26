package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator057 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator057 {

    public List<String> validate(ComplianceDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField001() != null && dto.getCompField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField001 must not be negative");
        }
        if (dto.getCompField009() != null && dto.getCompField009().isBlank()) {
            errors.add("compField009 must not be blank if provided");
        }
        if (dto.getCompField011() != null && dto.getCompField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField011 must not be negative");
        }
        if (dto.getCompField013() != null && dto.getCompField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField013 must not be negative");
        }
        if (dto.getCompField014() != null && dto.getCompField014() < 0) {
            errors.add("compField014 must not be negative");
        }
        return errors;
    }
}
