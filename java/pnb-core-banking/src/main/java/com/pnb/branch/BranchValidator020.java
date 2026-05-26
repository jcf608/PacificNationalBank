package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator020 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator020 {

    public List<String> validate(BranchDto020 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField002() != null && dto.getBranField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField002 must not be negative");
        }
        if (dto.getBranField004() != null && dto.getBranField004() < 0) {
            errors.add("branField004 must not be negative");
        }
        if (dto.getBranField014() != null && dto.getBranField014().isBlank()) {
            errors.add("branField014 must not be blank if provided");
        }
        if (dto.getBranField015() != null && dto.getBranField015() < 0) {
            errors.add("branField015 must not be negative");
        }
        return errors;
    }
}
