package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator056 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator056 {

    public List<String> validate(ComplianceDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField002() != null && dto.getCompField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField002 must not be negative");
        }
        if (dto.getCompField003() != null && dto.getCompField003().isBlank()) {
            errors.add("compField003 must not be blank if provided");
        }
        if (dto.getCompField004() != null && dto.getCompField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField004 must not be negative");
        }
        if (dto.getCompField005() != null && dto.getCompField005().isBlank()) {
            errors.add("compField005 must not be blank if provided");
        }
        if (dto.getCompField006() != null && dto.getCompField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField006 must not be negative");
        }
        if (dto.getCompField007() != null && dto.getCompField007() < 0) {
            errors.add("compField007 must not be negative");
        }
        if (dto.getCompField010() != null && dto.getCompField010().isBlank()) {
            errors.add("compField010 must not be blank if provided");
        }
        if (dto.getCompField012() != null && dto.getCompField012() < 0) {
            errors.add("compField012 must not be negative");
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
