package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator021 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator021 {

    public List<String> validate(FeeDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField000() != null && dto.getFeeField000().isBlank()) {
            errors.add("feeField000 must not be blank if provided");
        }
        if (dto.getFeeField002() != null && dto.getFeeField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField002 must not be negative");
        }
        if (dto.getFeeField005() != null && dto.getFeeField005() < 0) {
            errors.add("feeField005 must not be negative");
        }
        if (dto.getFeeField008() != null && dto.getFeeField008() < 0) {
            errors.add("feeField008 must not be negative");
        }
        if (dto.getFeeField009() != null && dto.getFeeField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField009 must not be negative");
        }
        if (dto.getFeeField014() != null && dto.getFeeField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField014 must not be negative");
        }
        return errors;
    }
}
