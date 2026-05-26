package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator040 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator040 {

    public List<String> validate(ComplianceDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField000() != null && dto.getCompField000().isBlank()) {
            errors.add("compField000 must not be blank if provided");
        }
        if (dto.getCompField002() != null && dto.getCompField002().isBlank()) {
            errors.add("compField002 must not be blank if provided");
        }
        if (dto.getCompField004() != null && dto.getCompField004().isBlank()) {
            errors.add("compField004 must not be blank if provided");
        }
        if (dto.getCompField005() != null && dto.getCompField005() < 0) {
            errors.add("compField005 must not be negative");
        }
        if (dto.getCompField007() != null && dto.getCompField007() < 0) {
            errors.add("compField007 must not be negative");
        }
        return errors;
    }
}
