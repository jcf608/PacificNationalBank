package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator057 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator057 {

    public List<String> validate(FeeDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField000() != null && dto.getFeeField000().isBlank()) {
            errors.add("feeField000 must not be blank if provided");
        }
        if (dto.getFeeField001() != null && dto.getFeeField001().isBlank()) {
            errors.add("feeField001 must not be blank if provided");
        }
        if (dto.getFeeField002() != null && dto.getFeeField002() < 0) {
            errors.add("feeField002 must not be negative");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField004 must not be negative");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006().isBlank()) {
            errors.add("feeField006 must not be blank if provided");
        }
        if (dto.getFeeField014() != null && dto.getFeeField014() < 0) {
            errors.add("feeField014 must not be negative");
        }
        if (dto.getFeeField016() != null && dto.getFeeField016().isBlank()) {
            errors.add("feeField016 must not be blank if provided");
        }
        return errors;
    }
}
