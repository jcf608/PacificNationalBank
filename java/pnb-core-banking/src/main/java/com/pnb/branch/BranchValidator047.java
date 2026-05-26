package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator047 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator047 {

    public List<String> validate(BranchDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField000() != null && dto.getBranField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField000 must not be negative");
        }
        if (dto.getBranField004() != null && dto.getBranField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField004 must not be negative");
        }
        if (dto.getBranField006() != null && dto.getBranField006() < 0) {
            errors.add("branField006 must not be negative");
        }
        if (dto.getBranField008() != null && dto.getBranField008() < 0) {
            errors.add("branField008 must not be negative");
        }
        if (dto.getBranField009() != null && dto.getBranField009() < 0) {
            errors.add("branField009 must not be negative");
        }
        if (dto.getBranField010() != null && dto.getBranField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField010 must not be negative");
        }
        if (dto.getBranField012() != null && dto.getBranField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField012 must not be negative");
        }
        if (dto.getBranField013() != null && dto.getBranField013() < 0) {
            errors.add("branField013 must not be negative");
        }
        if (dto.getBranField018() != null && dto.getBranField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField018 must not be negative");
        }
        return errors;
    }
}
