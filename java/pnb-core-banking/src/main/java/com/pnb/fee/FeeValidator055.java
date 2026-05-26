package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator055 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator055 {

    public List<String> validate(FeeDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField000() != null && dto.getFeeField000() < 0) {
            errors.add("feeField000 must not be negative");
        }
        if (dto.getFeeField002() != null && dto.getFeeField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField002 must not be negative");
        }
        if (dto.getFeeField003() != null && dto.getFeeField003().isBlank()) {
            errors.add("feeField003 must not be blank if provided");
        }
        if (dto.getFeeField010() != null && dto.getFeeField010() < 0) {
            errors.add("feeField010 must not be negative");
        }
        if (dto.getFeeField012() != null && dto.getFeeField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField012 must not be negative");
        }
        return errors;
    }
}
