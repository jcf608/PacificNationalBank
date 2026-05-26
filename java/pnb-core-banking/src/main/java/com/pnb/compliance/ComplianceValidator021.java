package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator021 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator021 {

    public List<String> validate(ComplianceDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField000() != null && dto.getCompField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField000 must not be negative");
        }
        if (dto.getCompField003() != null && dto.getCompField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField003 must not be negative");
        }
        if (dto.getCompField004() != null && dto.getCompField004().isBlank()) {
            errors.add("compField004 must not be blank if provided");
        }
        if (dto.getCompField006() != null && dto.getCompField006().isBlank()) {
            errors.add("compField006 must not be blank if provided");
        }
        if (dto.getCompField007() != null && dto.getCompField007().isBlank()) {
            errors.add("compField007 must not be blank if provided");
        }
        if (dto.getCompField008() != null && dto.getCompField008() < 0) {
            errors.add("compField008 must not be negative");
        }
        if (dto.getCompField010() != null && dto.getCompField010() < 0) {
            errors.add("compField010 must not be negative");
        }
        if (dto.getCompField012() != null && dto.getCompField012() < 0) {
            errors.add("compField012 must not be negative");
        }
        return errors;
    }
}
