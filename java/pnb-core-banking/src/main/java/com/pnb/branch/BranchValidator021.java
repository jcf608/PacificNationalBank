package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator021 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator021 {

    public List<String> validate(BranchDto021 dto) {
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
        if (dto.getBranField005() != null && dto.getBranField005().isBlank()) {
            errors.add("branField005 must not be blank if provided");
        }
        if (dto.getBranField008() != null && dto.getBranField008().isBlank()) {
            errors.add("branField008 must not be blank if provided");
        }
        if (dto.getBranField009() != null && dto.getBranField009().isBlank()) {
            errors.add("branField009 must not be blank if provided");
        }
        if (dto.getBranField013() != null && dto.getBranField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField013 must not be negative");
        }
        return errors;
    }
}
