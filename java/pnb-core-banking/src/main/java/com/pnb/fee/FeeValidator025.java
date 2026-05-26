package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator025 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator025 {

    public List<String> validate(FeeDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField000() != null && dto.getFeeField000().isBlank()) {
            errors.add("feeField000 must not be blank if provided");
        }
        if (dto.getFeeField002() != null && dto.getFeeField002() < 0) {
            errors.add("feeField002 must not be negative");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006().isBlank()) {
            errors.add("feeField006 must not be blank if provided");
        }
        if (dto.getFeeField008() != null && dto.getFeeField008() < 0) {
            errors.add("feeField008 must not be negative");
        }
        return errors;
    }
}
