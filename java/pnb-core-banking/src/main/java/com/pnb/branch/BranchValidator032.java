package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator032 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator032 {

    public List<String> validate(BranchDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField001() != null && dto.getBranField001() < 0) {
            errors.add("branField001 must not be negative");
        }
        if (dto.getBranField002() != null && dto.getBranField002().isBlank()) {
            errors.add("branField002 must not be blank if provided");
        }
        if (dto.getBranField013() != null && dto.getBranField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField013 must not be negative");
        }
        if (dto.getBranField014() != null && dto.getBranField014().isBlank()) {
            errors.add("branField014 must not be blank if provided");
        }
        return errors;
    }
}
