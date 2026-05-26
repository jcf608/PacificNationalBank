package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator053 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator053 {

    public List<String> validate(BranchDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField003() != null && dto.getBranField003().isBlank()) {
            errors.add("branField003 must not be blank if provided");
        }
        if (dto.getBranField006() != null && dto.getBranField006().isBlank()) {
            errors.add("branField006 must not be blank if provided");
        }
        if (dto.getBranField009() != null && dto.getBranField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField009 must not be negative");
        }
        if (dto.getBranField010() != null && dto.getBranField010().isBlank()) {
            errors.add("branField010 must not be blank if provided");
        }
        if (dto.getBranField011() != null && dto.getBranField011().isBlank()) {
            errors.add("branField011 must not be blank if provided");
        }
        if (dto.getBranField012() != null && dto.getBranField012().isBlank()) {
            errors.add("branField012 must not be blank if provided");
        }
        return errors;
    }
}
