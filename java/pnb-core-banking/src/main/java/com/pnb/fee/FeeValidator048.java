package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator048 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator048 {

    public List<String> validate(FeeDto048 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField002() != null && dto.getFeeField002() < 0) {
            errors.add("feeField002 must not be negative");
        }
        if (dto.getFeeField003() != null && dto.getFeeField003().isBlank()) {
            errors.add("feeField003 must not be blank if provided");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006().isBlank()) {
            errors.add("feeField006 must not be blank if provided");
        }
        if (dto.getFeeField007() != null && dto.getFeeField007() < 0) {
            errors.add("feeField007 must not be negative");
        }
        return errors;
    }
}
