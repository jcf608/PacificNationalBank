package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator025 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator025 {

    public List<String> validate(BranchDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField004() != null && dto.getBranField004().isBlank()) {
            errors.add("branField004 must not be blank if provided");
        }
        if (dto.getBranField007() != null && dto.getBranField007() < 0) {
            errors.add("branField007 must not be negative");
        }
        if (dto.getBranField008() != null && dto.getBranField008() < 0) {
            errors.add("branField008 must not be negative");
        }
        return errors;
    }
}
