package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator042 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator042 {

    public List<String> validate(BranchDto042 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField003() != null && dto.getBranField003() < 0) {
            errors.add("branField003 must not be negative");
        }
        if (dto.getBranField004() != null && dto.getBranField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField004 must not be negative");
        }
        if (dto.getBranField005() != null && dto.getBranField005().isBlank()) {
            errors.add("branField005 must not be blank if provided");
        }
        if (dto.getBranField007() != null && dto.getBranField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField007 must not be negative");
        }
        if (dto.getBranField009() != null && dto.getBranField009().isBlank()) {
            errors.add("branField009 must not be blank if provided");
        }
        if (dto.getBranField011() != null && dto.getBranField011() < 0) {
            errors.add("branField011 must not be negative");
        }
        if (dto.getBranField012() != null && dto.getBranField012().isBlank()) {
            errors.add("branField012 must not be blank if provided");
        }
        if (dto.getBranField013() != null && dto.getBranField013() < 0) {
            errors.add("branField013 must not be negative");
        }
        return errors;
    }
}
