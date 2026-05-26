package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator043 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator043 {

    public List<String> validate(FeeDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField003() != null && dto.getFeeField003() < 0) {
            errors.add("feeField003 must not be negative");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004() < 0) {
            errors.add("feeField004 must not be negative");
        }
        if (dto.getFeeField005() != null && dto.getFeeField005() < 0) {
            errors.add("feeField005 must not be negative");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField006 must not be negative");
        }
        if (dto.getFeeField007() != null && dto.getFeeField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField007 must not be negative");
        }
        if (dto.getFeeField009() != null && dto.getFeeField009().isBlank()) {
            errors.add("feeField009 must not be blank if provided");
        }
        if (dto.getFeeField014() != null && dto.getFeeField014() < 0) {
            errors.add("feeField014 must not be negative");
        }
        return errors;
    }
}
