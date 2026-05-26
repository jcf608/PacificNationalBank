package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator022 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator022 {

    public List<String> validate(FeeDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField000() != null && dto.getFeeField000().isBlank()) {
            errors.add("feeField000 must not be blank if provided");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004() < 0) {
            errors.add("feeField004 must not be negative");
        }
        if (dto.getFeeField008() != null && dto.getFeeField008().isBlank()) {
            errors.add("feeField008 must not be blank if provided");
        }
        if (dto.getFeeField014() != null && dto.getFeeField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField014 must not be negative");
        }
        return errors;
    }
}
