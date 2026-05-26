package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator023 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator023 {

    public List<String> validate(BranchDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField001() != null && dto.getBranField001().isBlank()) {
            errors.add("branField001 must not be blank if provided");
        }
        if (dto.getBranField002() != null && dto.getBranField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField002 must not be negative");
        }
        if (dto.getBranField003() != null && dto.getBranField003() < 0) {
            errors.add("branField003 must not be negative");
        }
        if (dto.getBranField004() != null && dto.getBranField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField004 must not be negative");
        }
        if (dto.getBranField005() != null && dto.getBranField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField005 must not be negative");
        }
        if (dto.getBranField007() != null && dto.getBranField007().isBlank()) {
            errors.add("branField007 must not be blank if provided");
        }
        if (dto.getBranField009() != null && dto.getBranField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField009 must not be negative");
        }
        if (dto.getBranField010() != null && dto.getBranField010() < 0) {
            errors.add("branField010 must not be negative");
        }
        if (dto.getBranField012() != null && dto.getBranField012().isBlank()) {
            errors.add("branField012 must not be blank if provided");
        }
        if (dto.getBranField014() != null && dto.getBranField014().isBlank()) {
            errors.add("branField014 must not be blank if provided");
        }
        if (dto.getBranField016() != null && dto.getBranField016().isBlank()) {
            errors.add("branField016 must not be blank if provided");
        }
        return errors;
    }
}
