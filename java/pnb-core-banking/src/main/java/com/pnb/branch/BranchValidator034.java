package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator034 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator034 {

    public List<String> validate(BranchDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField001() != null && dto.getBranField001().isBlank()) {
            errors.add("branField001 must not be blank if provided");
        }
        if (dto.getBranField003() != null && dto.getBranField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField003 must not be negative");
        }
        if (dto.getBranField004() != null && dto.getBranField004().isBlank()) {
            errors.add("branField004 must not be blank if provided");
        }
        if (dto.getBranField005() != null && dto.getBranField005() < 0) {
            errors.add("branField005 must not be negative");
        }
        if (dto.getBranField006() != null && dto.getBranField006() < 0) {
            errors.add("branField006 must not be negative");
        }
        if (dto.getBranField009() != null && dto.getBranField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField009 must not be negative");
        }
        if (dto.getBranField010() != null && dto.getBranField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField010 must not be negative");
        }
        if (dto.getBranField012() != null && dto.getBranField012() < 0) {
            errors.add("branField012 must not be negative");
        }
        if (dto.getBranField014() != null && dto.getBranField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField014 must not be negative");
        }
        if (dto.getBranField016() != null && dto.getBranField016() < 0) {
            errors.add("branField016 must not be negative");
        }
        return errors;
    }
}
