package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator027 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator027 {

    public List<String> validate(FeeDto027 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField000() != null && dto.getFeeField000() < 0) {
            errors.add("feeField000 must not be negative");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004().isBlank()) {
            errors.add("feeField004 must not be blank if provided");
        }
        if (dto.getFeeField005() != null && dto.getFeeField005().isBlank()) {
            errors.add("feeField005 must not be blank if provided");
        }
        if (dto.getFeeField010() != null && dto.getFeeField010().isBlank()) {
            errors.add("feeField010 must not be blank if provided");
        }
        return errors;
    }
}
