package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator054 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator054 {

    public List<String> validate(BranchDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField000() != null && dto.getBranField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField000 must not be negative");
        }
        if (dto.getBranField001() != null && dto.getBranField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField001 must not be negative");
        }
        if (dto.getBranField003() != null && dto.getBranField003() < 0) {
            errors.add("branField003 must not be negative");
        }
        if (dto.getBranField004() != null && dto.getBranField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField004 must not be negative");
        }
        if (dto.getBranField005() != null && dto.getBranField005() < 0) {
            errors.add("branField005 must not be negative");
        }
        if (dto.getBranField006() != null && dto.getBranField006() < 0) {
            errors.add("branField006 must not be negative");
        }
        if (dto.getBranField008() != null && dto.getBranField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("branField008 must not be negative");
        }
        return errors;
    }
}
