package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator033 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator033 {

    public List<String> validate(BranchDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField001() != null && dto.getBranField001() < 0) {
            errors.add("branField001 must not be negative");
        }
        if (dto.getBranField007() != null && dto.getBranField007() < 0) {
            errors.add("branField007 must not be negative");
        }
        if (dto.getBranField016() != null && dto.getBranField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField016 must not be negative");
        }
        return errors;
    }
}
