package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator023 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator023 {

    public List<String> validate(FeeDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField001() != null && dto.getFeeField001().isBlank()) {
            errors.add("feeField001 must not be blank if provided");
        }
        if (dto.getFeeField002() != null && dto.getFeeField002().isBlank()) {
            errors.add("feeField002 must not be blank if provided");
        }
        if (dto.getFeeField005() != null && dto.getFeeField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField005 must not be negative");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006() < 0) {
            errors.add("feeField006 must not be negative");
        }
        if (dto.getFeeField007() != null && dto.getFeeField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField007 must not be negative");
        }
        if (dto.getFeeField008() != null && dto.getFeeField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField008 must not be negative");
        }
        if (dto.getFeeField010() != null && dto.getFeeField010() < 0) {
            errors.add("feeField010 must not be negative");
        }
        if (dto.getFeeField011() != null && dto.getFeeField011() < 0) {
            errors.add("feeField011 must not be negative");
        }
        if (dto.getFeeField012() != null && dto.getFeeField012().isBlank()) {
            errors.add("feeField012 must not be blank if provided");
        }
        if (dto.getFeeField016() != null && dto.getFeeField016() < 0) {
            errors.add("feeField016 must not be negative");
        }
        return errors;
    }
}
