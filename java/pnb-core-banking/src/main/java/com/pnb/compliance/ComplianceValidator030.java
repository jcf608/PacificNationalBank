package com.pnb.compliance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceValidator030 — Business rule validation.
 */
@ApplicationScoped
public class ComplianceValidator030 {

    public List<String> validate(ComplianceDto030 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("compliance DTO must not be null");
            return errors;
        }
        if (dto.getCompField001() != null && dto.getCompField001().isBlank()) {
            errors.add("compField001 must not be blank if provided");
        }
        if (dto.getCompField003() != null && dto.getCompField003().isBlank()) {
            errors.add("compField003 must not be blank if provided");
        }
        if (dto.getCompField010() != null && dto.getCompField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField010 must not be negative");
        }
        if (dto.getCompField011() != null && dto.getCompField011() < 0) {
            errors.add("compField011 must not be negative");
        }
        if (dto.getCompField012() != null && dto.getCompField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("compField012 must not be negative");
        }
        return errors;
    }
}
