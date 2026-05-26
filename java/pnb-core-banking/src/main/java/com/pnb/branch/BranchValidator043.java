package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator043 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator043 {

    public List<String> validate(BranchDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField000() != null && dto.getBranField000() < 0) {
            errors.add("branField000 must not be negative");
        }
        if (dto.getBranField001() != null && dto.getBranField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField001 must not be negative");
        }
        if (dto.getBranField004() != null && dto.getBranField004().isBlank()) {
            errors.add("branField004 must not be blank if provided");
        }
        if (dto.getBranField010() != null && dto.getBranField010() < 0) {
            errors.add("branField010 must not be negative");
        }
        if (dto.getBranField012() != null && dto.getBranField012() < 0) {
            errors.add("branField012 must not be negative");
        }
        if (dto.getBranField013() != null && dto.getBranField013() < 0) {
            errors.add("branField013 must not be negative");
        }
        return errors;
    }
}
