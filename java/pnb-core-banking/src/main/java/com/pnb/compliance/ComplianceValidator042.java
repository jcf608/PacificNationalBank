package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator042 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator042 {

    public List<String> validate(ComplianceDto042 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField002() != null && dto.getCompField002() < 0) {
            errors.add("compField002 must not be negative");
        }
        if (dto.getCompField004() != null && dto.getCompField004().isBlank()) {
            errors.add("compField004 must not be blank if provided");
        }
        if (dto.getCompField008() != null && dto.getCompField008() < 0) {
            errors.add("compField008 must not be negative");
        }
        if (dto.getCompField009() != null && dto.getCompField009().isBlank()) {
            errors.add("compField009 must not be blank if provided");
        }
        if (dto.getCompField010() != null && dto.getCompField010().isBlank()) {
            errors.add("compField010 must not be blank if provided");
        }
        if (dto.getCompField011() != null && dto.getCompField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField011 must not be negative");
        }
        if (dto.getCompField012() != null && dto.getCompField012().isBlank()) {
            errors.add("compField012 must not be blank if provided");
        }
        if (dto.getCompField013() != null && dto.getCompField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField013 must not be negative");
        }
        return errors;
    }
}
