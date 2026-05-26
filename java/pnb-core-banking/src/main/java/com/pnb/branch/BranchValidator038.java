package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator038 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator038 {

    public List<String> validate(BranchDto038 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField000() != null && dto.getBranField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField000 must not be negative");
        }
        if (dto.getBranField007() != null && dto.getBranField007().isBlank()) {
            errors.add("branField007 must not be blank if provided");
        }
        if (dto.getBranField009() != null && dto.getBranField009() < 0) {
            errors.add("branField009 must not be negative");
        }
        return errors;
    }
}
