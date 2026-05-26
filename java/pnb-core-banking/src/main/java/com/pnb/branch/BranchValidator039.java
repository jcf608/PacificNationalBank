package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator039 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator039 {

    public List<String> validate(BranchDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField003() != null && dto.getBranField003() < 0) {
            errors.add("branField003 must not be negative");
        }
        if (dto.getBranField004() != null && dto.getBranField004() < 0) {
            errors.add("branField004 must not be negative");
        }
        if (dto.getBranField005() != null && dto.getBranField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField005 must not be negative");
        }
        if (dto.getBranField007() != null && dto.getBranField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField007 must not be negative");
        }
        if (dto.getBranField010() != null && dto.getBranField010() < 0) {
            errors.add("branField010 must not be negative");
        }
        return errors;
    }
}
