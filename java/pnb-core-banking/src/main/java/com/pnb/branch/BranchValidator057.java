package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator057 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator057 {

    public List<String> validate(BranchDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField001() != null && dto.getBranField001().isBlank()) {
            errors.add("branField001 must not be blank if provided");
        }
        if (dto.getBranField003() != null && dto.getBranField003() < 0) {
            errors.add("branField003 must not be negative");
        }
        if (dto.getBranField005() != null && dto.getBranField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField005 must not be negative");
        }
        if (dto.getBranField006() != null && dto.getBranField006().isBlank()) {
            errors.add("branField006 must not be blank if provided");
        }
        if (dto.getBranField008() != null && dto.getBranField008().isBlank()) {
            errors.add("branField008 must not be blank if provided");
        }
        if (dto.getBranField009() != null && dto.getBranField009() < 0) {
            errors.add("branField009 must not be negative");
        }
        if (dto.getBranField011() != null && dto.getBranField011() < 0) {
            errors.add("branField011 must not be negative");
        }
        if (dto.getBranField014() != null && dto.getBranField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField014 must not be negative");
        }
        if (dto.getBranField015() != null && dto.getBranField015().isBlank()) {
            errors.add("branField015 must not be blank if provided");
        }
        if (dto.getBranField016() != null && dto.getBranField016().isBlank()) {
            errors.add("branField016 must not be blank if provided");
        }
        return errors;
    }
}
