package com.pnb.branch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * BranchValidator049 — Business rule validation.
 */
@ApplicationScoped
public class BranchValidator049 {

    public List<String> validate(BranchDto049 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("branch DTO must not be null");
            return errors;
        }
        if (dto.getBranField000() != null && dto.getBranField000().isBlank()) {
            errors.add("branField000 must not be blank if provided");
        }
        if (dto.getBranField001() != null && dto.getBranField001() < 0) {
            errors.add("branField001 must not be negative");
        }
        if (dto.getBranField002() != null && dto.getBranField002().isBlank()) {
            errors.add("branField002 must not be blank if provided");
        }
        if (dto.getBranField005() != null && dto.getBranField005() < 0) {
            errors.add("branField005 must not be negative");
        }
        if (dto.getBranField007() != null && dto.getBranField007() < 0) {
            errors.add("branField007 must not be negative");
        }
        return errors;
    }
}
