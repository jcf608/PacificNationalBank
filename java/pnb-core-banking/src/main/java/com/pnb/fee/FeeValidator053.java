package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator053 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator053 {

    public List<String> validate(FeeDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField002() != null && dto.getFeeField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField002 must not be negative");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004().isBlank()) {
            errors.add("feeField004 must not be blank if provided");
        }
        if (dto.getFeeField005() != null && dto.getFeeField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField005 must not be negative");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField006 must not be negative");
        }
        if (dto.getFeeField009() != null && dto.getFeeField009() < 0) {
            errors.add("feeField009 must not be negative");
        }
        if (dto.getFeeField010() != null && dto.getFeeField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField010 must not be negative");
        }
        if (dto.getFeeField011() != null && dto.getFeeField011() < 0) {
            errors.add("feeField011 must not be negative");
        }
        return errors;
    }
}
