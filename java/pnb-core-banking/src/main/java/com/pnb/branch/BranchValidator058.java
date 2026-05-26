package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator058 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator058 {

    public List<String> validate(BranchDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField000() != null && dto.getBranField000() < 0) {
            errors.add("branField000 must not be negative");
        }
        if (dto.getBranField001() != null && dto.getBranField001().isBlank()) {
            errors.add("branField001 must not be blank if provided");
        }
        if (dto.getBranField003() != null && dto.getBranField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField003 must not be negative");
        }
        if (dto.getBranField008() != null && dto.getBranField008() < 0) {
            errors.add("branField008 must not be negative");
        }
        if (dto.getBranField009() != null && dto.getBranField009() < 0) {
            errors.add("branField009 must not be negative");
        }
        if (dto.getBranField011() != null && dto.getBranField011().isBlank()) {
            errors.add("branField011 must not be blank if provided");
        }
        if (dto.getBranField012() != null && dto.getBranField012() < 0) {
            errors.add("branField012 must not be negative");
        }
        if (dto.getBranField016() != null && dto.getBranField016() < 0) {
            errors.add("branField016 must not be negative");
        }
        if (dto.getBranField017() != null && dto.getBranField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField017 must not be negative");
        }
        return errors;
    }
}
