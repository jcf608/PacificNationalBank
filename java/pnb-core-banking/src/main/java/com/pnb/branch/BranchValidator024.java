package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator024 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator024 {

    public List<String> validate(BranchDto024 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField004() != null && dto.getBranField004() < 0) {
            errors.add("branField004 must not be negative");
        }
        if (dto.getBranField006() != null && dto.getBranField006() < 0) {
            errors.add("branField006 must not be negative");
        }
        return errors;
    }
}
