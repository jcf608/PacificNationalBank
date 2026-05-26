package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator022 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator022 {

    public List<String> validate(BranchDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField009() != null && dto.getBranField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField009 must not be negative");
        }
        if (dto.getBranField011() != null && dto.getBranField011().isBlank()) {
            errors.add("branField011 must not be blank if provided");
        }
        if (dto.getBranField012() != null && dto.getBranField012().isBlank()) {
            errors.add("branField012 must not be blank if provided");
        }
        if (dto.getBranField016() != null && dto.getBranField016().isBlank()) {
            errors.add("branField016 must not be blank if provided");
        }
        return errors;
    }
}
