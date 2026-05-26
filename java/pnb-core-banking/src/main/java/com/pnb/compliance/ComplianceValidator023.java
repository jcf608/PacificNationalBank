package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator023 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator023 {

    public List<String> validate(ComplianceDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField002() != null && dto.getCompField002().isBlank()) {
            errors.add("compField002 must not be blank if provided");
        }
        if (dto.getCompField003() != null && dto.getCompField003().isBlank()) {
            errors.add("compField003 must not be blank if provided");
        }
        if (dto.getCompField005() != null && dto.getCompField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField005 must not be negative");
        }
        if (dto.getCompField010() != null && dto.getCompField010().isBlank()) {
            errors.add("compField010 must not be blank if provided");
        }
        if (dto.getCompField015() != null && dto.getCompField015().isBlank()) {
            errors.add("compField015 must not be blank if provided");
        }
        if (dto.getCompField018() != null && dto.getCompField018() < 0) {
            errors.add("compField018 must not be negative");
        }
        return errors;
    }
}
