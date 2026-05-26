package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator059 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator059 {

    public List<String> validate(BranchDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField003() != null && dto.getBranField003().isBlank()) {
            errors.add("branField003 must not be blank if provided");
        }
        if (dto.getBranField005() != null && dto.getBranField005() < 0) {
            errors.add("branField005 must not be negative");
        }
        if (dto.getBranField006() != null && dto.getBranField006().isBlank()) {
            errors.add("branField006 must not be blank if provided");
        }
        if (dto.getBranField007() != null && dto.getBranField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField007 must not be negative");
        }
        if (dto.getBranField008() != null && dto.getBranField008().isBlank()) {
            errors.add("branField008 must not be blank if provided");
        }
        if (dto.getBranField009() != null && dto.getBranField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField009 must not be negative");
        }
        if (dto.getBranField010() != null && dto.getBranField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField010 must not be negative");
        }
        if (dto.getBranField011() != null && dto.getBranField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField011 must not be negative");
        }
        if (dto.getBranField015() != null && dto.getBranField015() < 0) {
            errors.add("branField015 must not be negative");
        }
        if (dto.getBranField016() != null && dto.getBranField016() < 0) {
            errors.add("branField016 must not be negative");
        }
        if (dto.getBranField017() != null && dto.getBranField017().isBlank()) {
            errors.add("branField017 must not be blank if provided");
        }
        return errors;
    }
}
