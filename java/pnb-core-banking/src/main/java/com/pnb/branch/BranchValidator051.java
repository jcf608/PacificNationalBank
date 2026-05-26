package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator051 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator051 {

    public List<String> validate(BranchDto051 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField001() != null && dto.getBranField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField001 must not be negative");
        }
        if (dto.getBranField005() != null && dto.getBranField005() < 0) {
            errors.add("branField005 must not be negative");
        }
        if (dto.getBranField006() != null && dto.getBranField006().isBlank()) {
            errors.add("branField006 must not be blank if provided");
        }
        if (dto.getBranField008() != null && dto.getBranField008() < 0) {
            errors.add("branField008 must not be negative");
        }
        if (dto.getBranField009() != null && dto.getBranField009().isBlank()) {
            errors.add("branField009 must not be blank if provided");
        }
        return errors;
    }
}
