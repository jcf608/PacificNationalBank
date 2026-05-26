package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator052 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator052 {

    public List<String> validate(BranchDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField003() != null && dto.getBranField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField003 must not be negative");
        }
        if (dto.getBranField006() != null && dto.getBranField006().isBlank()) {
            errors.add("branField006 must not be blank if provided");
        }
        return errors;
    }
}
