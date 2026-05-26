package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator044 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator044 {

    public List<String> validate(ComplianceDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField003() != null && dto.getCompField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField003 must not be negative");
        }
        if (dto.getCompField004() != null && dto.getCompField004().isBlank()) {
            errors.add("compField004 must not be blank if provided");
        }
        if (dto.getCompField008() != null && dto.getCompField008() < 0) {
            errors.add("compField008 must not be negative");
        }
        if (dto.getCompField010() != null && dto.getCompField010().isBlank()) {
            errors.add("compField010 must not be blank if provided");
        }
        if (dto.getCompField011() != null && dto.getCompField011() < 0) {
            errors.add("compField011 must not be negative");
        }
        if (dto.getCompField012() != null && dto.getCompField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField012 must not be negative");
        }
        if (dto.getCompField013() != null && dto.getCompField013().isBlank()) {
            errors.add("compField013 must not be blank if provided");
        }
        if (dto.getCompField014() != null && dto.getCompField014() < 0) {
            errors.add("compField014 must not be negative");
        }
        return errors;
    }
}
