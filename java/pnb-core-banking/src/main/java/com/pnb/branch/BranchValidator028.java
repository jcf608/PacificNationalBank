package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator028 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator028 {

    public List<String> validate(BranchDto028 dto) {
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
        if (dto.getBranField004() != null && dto.getBranField004().isBlank()) {
            errors.add("branField004 must not be blank if provided");
        }
        if (dto.getBranField007() != null && dto.getBranField007().isBlank()) {
            errors.add("branField007 must not be blank if provided");
        }
        if (dto.getBranField008() != null && dto.getBranField008().isBlank()) {
            errors.add("branField008 must not be blank if provided");
        }
        if (dto.getBranField011() != null && dto.getBranField011().isBlank()) {
            errors.add("branField011 must not be blank if provided");
        }
        return errors;
    }
}
