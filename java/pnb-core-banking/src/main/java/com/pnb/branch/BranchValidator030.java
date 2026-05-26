package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator030 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator030 {

    public List<String> validate(BranchDto030 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField000() != null && dto.getBranField000().isBlank()) {
            errors.add("branField000 must not be blank if provided");
        }
        if (dto.getBranField006() != null && dto.getBranField006().isBlank()) {
            errors.add("branField006 must not be blank if provided");
        }
        if (dto.getBranField007() != null && dto.getBranField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField007 must not be negative");
        }
        if (dto.getBranField009() != null && dto.getBranField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField009 must not be negative");
        }
        return errors;
    }
}
