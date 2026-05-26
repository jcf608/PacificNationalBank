package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator043 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator043 {

    public List<String> validate(ComplianceDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField002() != null && dto.getCompField002().isBlank()) {
            errors.add("compField002 must not be blank if provided");
        }
        if (dto.getCompField006() != null && dto.getCompField006() < 0) {
            errors.add("compField006 must not be negative");
        }
        if (dto.getCompField007() != null && dto.getCompField007() < 0) {
            errors.add("compField007 must not be negative");
        }
        if (dto.getCompField008() != null && dto.getCompField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField008 must not be negative");
        }
        if (dto.getCompField009() != null && dto.getCompField009() < 0) {
            errors.add("compField009 must not be negative");
        }
        if (dto.getCompField011() != null && dto.getCompField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField011 must not be negative");
        }
        if (dto.getCompField012() != null && dto.getCompField012().isBlank()) {
            errors.add("compField012 must not be blank if provided");
        }
        if (dto.getCompField013() != null && dto.getCompField013().isBlank()) {
            errors.add("compField013 must not be blank if provided");
        }
        if (dto.getCompField014() != null && dto.getCompField014().isBlank()) {
            errors.add("compField014 must not be blank if provided");
        }
        return errors;
    }
}
