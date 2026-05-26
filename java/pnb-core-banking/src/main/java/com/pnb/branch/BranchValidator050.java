package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator050 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator050 {

    public List<String> validate(BranchDto050 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField001() != null && dto.getBranField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField001 must not be negative");
        }
        if (dto.getBranField004() != null && dto.getBranField004() < 0) {
            errors.add("branField004 must not be negative");
        }
        if (dto.getBranField007() != null && dto.getBranField007().isBlank()) {
            errors.add("branField007 must not be blank if provided");
        }
        if (dto.getBranField008() != null && dto.getBranField008() < 0) {
            errors.add("branField008 must not be negative");
        }
        return errors;
    }
}
