package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator047 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator047 {

    public List<String> validate(ComplianceDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField000() != null && dto.getCompField000().isBlank()) {
            errors.add("compField000 must not be blank if provided");
        }
        if (dto.getCompField003() != null && dto.getCompField003() < 0) {
            errors.add("compField003 must not be negative");
        }
        if (dto.getCompField005() != null && dto.getCompField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField005 must not be negative");
        }
        if (dto.getCompField009() != null && dto.getCompField009() < 0) {
            errors.add("compField009 must not be negative");
        }
        if (dto.getCompField011() != null && dto.getCompField011() < 0) {
            errors.add("compField011 must not be negative");
        }
        if (dto.getCompField017() != null && dto.getCompField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField017 must not be negative");
        }
        if (dto.getCompField018() != null && dto.getCompField018().isBlank()) {
            errors.add("compField018 must not be blank if provided");
        }
        return errors;
    }
}
