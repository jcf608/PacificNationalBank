package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator046 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator046 {

    public List<String> validate(BranchDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField005() != null && dto.getBranField005() < 0) {
            errors.add("branField005 must not be negative");
        }
        if (dto.getBranField006() != null && dto.getBranField006().isBlank()) {
            errors.add("branField006 must not be blank if provided");
        }
        if (dto.getBranField009() != null && dto.getBranField009().isBlank()) {
            errors.add("branField009 must not be blank if provided");
        }
        if (dto.getBranField010() != null && dto.getBranField010().isBlank()) {
            errors.add("branField010 must not be blank if provided");
        }
        if (dto.getBranField013() != null && dto.getBranField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField013 must not be negative");
        }
        if (dto.getBranField016() != null && dto.getBranField016() < 0) {
            errors.add("branField016 must not be negative");
        }
        return errors;
    }
}
