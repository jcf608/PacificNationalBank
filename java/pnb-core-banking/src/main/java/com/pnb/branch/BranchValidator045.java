package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator045 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator045 {

    public List<String> validate(BranchDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField001() != null && dto.getBranField001().isBlank()) {
            errors.add("branField001 must not be blank if provided");
        }
        if (dto.getBranField002() != null && dto.getBranField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField002 must not be negative");
        }
        if (dto.getBranField003() != null && dto.getBranField003().isBlank()) {
            errors.add("branField003 must not be blank if provided");
        }
        if (dto.getBranField004() != null && dto.getBranField004() < 0) {
            errors.add("branField004 must not be negative");
        }
        if (dto.getBranField010() != null && dto.getBranField010().isBlank()) {
            errors.add("branField010 must not be blank if provided");
        }
        if (dto.getBranField011() != null && dto.getBranField011().isBlank()) {
            errors.add("branField011 must not be blank if provided");
        }
        if (dto.getBranField012() != null && dto.getBranField012() < 0) {
            errors.add("branField012 must not be negative");
        }
        if (dto.getBranField013() != null && dto.getBranField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField013 must not be negative");
        }
        return errors;
    }
}
