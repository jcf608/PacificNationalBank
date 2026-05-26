package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator046 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator046 {

    public List<String> validate(ComplianceDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField000() != null && dto.getCompField000() < 0) {
            errors.add("compField000 must not be negative");
        }
        if (dto.getCompField003() != null && dto.getCompField003() < 0) {
            errors.add("compField003 must not be negative");
        }
        if (dto.getCompField007() != null && dto.getCompField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField007 must not be negative");
        }
        if (dto.getCompField008() != null && dto.getCompField008() < 0) {
            errors.add("compField008 must not be negative");
        }
        if (dto.getCompField010() != null && dto.getCompField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField010 must not be negative");
        }
        if (dto.getCompField013() != null && dto.getCompField013() < 0) {
            errors.add("compField013 must not be negative");
        }
        if (dto.getCompField015() != null && dto.getCompField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField015 must not be negative");
        }
        if (dto.getCompField016() != null && dto.getCompField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField016 must not be negative");
        }
        return errors;
    }
}
