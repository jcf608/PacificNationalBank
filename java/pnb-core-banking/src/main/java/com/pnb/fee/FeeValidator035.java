package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator035 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator035 {

    public List<String> validate(FeeDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField001() != null && dto.getFeeField001().isBlank()) {
            errors.add("feeField001 must not be blank if provided");
        }
        if (dto.getFeeField003() != null && dto.getFeeField003() < 0) {
            errors.add("feeField003 must not be negative");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004() < 0) {
            errors.add("feeField004 must not be negative");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006().isBlank()) {
            errors.add("feeField006 must not be blank if provided");
        }
        if (dto.getFeeField007() != null && dto.getFeeField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField007 must not be negative");
        }
        if (dto.getFeeField008() != null && dto.getFeeField008() < 0) {
            errors.add("feeField008 must not be negative");
        }
        if (dto.getFeeField010() != null && dto.getFeeField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField010 must not be negative");
        }
        if (dto.getFeeField014() != null && dto.getFeeField014().isBlank()) {
            errors.add("feeField014 must not be blank if provided");
        }
        if (dto.getFeeField017() != null && dto.getFeeField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField017 must not be negative");
        }
        if (dto.getFeeField018() != null && dto.getFeeField018() < 0) {
            errors.add("feeField018 must not be negative");
        }
        return errors;
    }
}
