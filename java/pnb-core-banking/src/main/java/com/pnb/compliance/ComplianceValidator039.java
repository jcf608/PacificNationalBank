package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator039 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator039 {

    public List<String> validate(ComplianceDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField000() != null && dto.getCompField000().isBlank()) {
            errors.add("compField000 must not be blank if provided");
        }
        if (dto.getCompField001() != null && dto.getCompField001() < 0) {
            errors.add("compField001 must not be negative");
        }
        if (dto.getCompField006() != null && dto.getCompField006() < 0) {
            errors.add("compField006 must not be negative");
        }
        if (dto.getCompField008() != null && dto.getCompField008() < 0) {
            errors.add("compField008 must not be negative");
        }
        if (dto.getCompField010() != null && dto.getCompField010().isBlank()) {
            errors.add("compField010 must not be blank if provided");
        }
        return errors;
    }
}
