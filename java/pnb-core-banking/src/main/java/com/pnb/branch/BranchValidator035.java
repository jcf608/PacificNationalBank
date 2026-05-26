package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator035 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator035 {

    public List<String> validate(BranchDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField002() != null && dto.getBranField002() < 0) {
            errors.add("branField002 must not be negative");
        }
        if (dto.getBranField003() != null && dto.getBranField003().isBlank()) {
            errors.add("branField003 must not be blank if provided");
        }
        if (dto.getBranField004() != null && dto.getBranField004().isBlank()) {
            errors.add("branField004 must not be blank if provided");
        }
        if (dto.getBranField008() != null && dto.getBranField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField008 must not be negative");
        }
        if (dto.getBranField011() != null && dto.getBranField011().isBlank()) {
            errors.add("branField011 must not be blank if provided");
        }
        if (dto.getBranField015() != null && dto.getBranField015() < 0) {
            errors.add("branField015 must not be negative");
        }
        if (dto.getBranField016() != null && dto.getBranField016().isBlank()) {
            errors.add("branField016 must not be blank if provided");
        }
        return errors;
    }
}
