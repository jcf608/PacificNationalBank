package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator056 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator056 {

    public List<String> validate(FeeDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField003() != null && dto.getFeeField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField003 must not be negative");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006() < 0) {
            errors.add("feeField006 must not be negative");
        }
        if (dto.getFeeField008() != null && dto.getFeeField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField008 must not be negative");
        }
        if (dto.getFeeField010() != null && dto.getFeeField010().isBlank()) {
            errors.add("feeField010 must not be blank if provided");
        }
        if (dto.getFeeField011() != null && dto.getFeeField011().isBlank()) {
            errors.add("feeField011 must not be blank if provided");
        }
        if (dto.getFeeField012() != null && dto.getFeeField012().isBlank()) {
            errors.add("feeField012 must not be blank if provided");
        }
        if (dto.getFeeField013() != null && dto.getFeeField013() < 0) {
            errors.add("feeField013 must not be negative");
        }
        return errors;
    }
}
