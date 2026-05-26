package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator035 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator035 {

    public List<String> validate(ComplianceDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField000() != null && dto.getCompField000() < 0) {
            errors.add("compField000 must not be negative");
        }
        if (dto.getCompField001() != null && dto.getCompField001() < 0) {
            errors.add("compField001 must not be negative");
        }
        if (dto.getCompField002() != null && dto.getCompField002() < 0) {
            errors.add("compField002 must not be negative");
        }
        if (dto.getCompField003() != null && dto.getCompField003() < 0) {
            errors.add("compField003 must not be negative");
        }
        if (dto.getCompField005() != null && dto.getCompField005() < 0) {
            errors.add("compField005 must not be negative");
        }
        if (dto.getCompField006() != null && dto.getCompField006().isBlank()) {
            errors.add("compField006 must not be blank if provided");
        }
        if (dto.getCompField007() != null && dto.getCompField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField007 must not be negative");
        }
        if (dto.getCompField008() != null && dto.getCompField008() < 0) {
            errors.add("compField008 must not be negative");
        }
        if (dto.getCompField010() != null && dto.getCompField010().isBlank()) {
            errors.add("compField010 must not be blank if provided");
        }
        if (dto.getCompField012() != null && dto.getCompField012().isBlank()) {
            errors.add("compField012 must not be blank if provided");
        }
        if (dto.getCompField017() != null && dto.getCompField017() < 0) {
            errors.add("compField017 must not be negative");
        }
        return errors;
    }
}
