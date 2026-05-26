package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator044 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator044 {

    public List<String> validate(BranchDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField002() != null && dto.getBranField002().isBlank()) {
            errors.add("branField002 must not be blank if provided");
        }
        if (dto.getBranField003() != null && dto.getBranField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField003 must not be negative");
        }
        if (dto.getBranField004() != null && dto.getBranField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField004 must not be negative");
        }
        if (dto.getBranField005() != null && dto.getBranField005().isBlank()) {
            errors.add("branField005 must not be blank if provided");
        }
        if (dto.getBranField009() != null && dto.getBranField009().isBlank()) {
            errors.add("branField009 must not be blank if provided");
        }
        if (dto.getBranField010() != null && dto.getBranField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField010 must not be negative");
        }
        if (dto.getBranField011() != null && dto.getBranField011() < 0) {
            errors.add("branField011 must not be negative");
        }
        return errors;
    }
}
