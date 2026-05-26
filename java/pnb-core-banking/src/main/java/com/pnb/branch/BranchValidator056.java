package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator056 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator056 {

    public List<String> validate(BranchDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField000() != null && dto.getBranField000().isBlank()) {
            errors.add("branField000 must not be blank if provided");
        }
        if (dto.getBranField001() != null && dto.getBranField001().isBlank()) {
            errors.add("branField001 must not be blank if provided");
        }
        if (dto.getBranField007() != null && dto.getBranField007().isBlank()) {
            errors.add("branField007 must not be blank if provided");
        }
        if (dto.getBranField014() != null && dto.getBranField014().isBlank()) {
            errors.add("branField014 must not be blank if provided");
        }
        return errors;
    }
}
