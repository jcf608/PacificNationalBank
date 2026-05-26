package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator034 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator034 {

    public List<String> validate(ComplianceDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField000() != null && dto.getCompField000() < 0) {
            errors.add("compField000 must not be negative");
        }
        if (dto.getCompField002() != null && dto.getCompField002().isBlank()) {
            errors.add("compField002 must not be blank if provided");
        }
        if (dto.getCompField003() != null && dto.getCompField003().isBlank()) {
            errors.add("compField003 must not be blank if provided");
        }
        if (dto.getCompField004() != null && dto.getCompField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField004 must not be negative");
        }
        if (dto.getCompField008() != null && dto.getCompField008().isBlank()) {
            errors.add("compField008 must not be blank if provided");
        }
        if (dto.getCompField011() != null && dto.getCompField011() < 0) {
            errors.add("compField011 must not be negative");
        }
        if (dto.getCompField012() != null && dto.getCompField012() < 0) {
            errors.add("compField012 must not be negative");
        }
        if (dto.getCompField015() != null && dto.getCompField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField015 must not be negative");
        }
        return errors;
    }
}
