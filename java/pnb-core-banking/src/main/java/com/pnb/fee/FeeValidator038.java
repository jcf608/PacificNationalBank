package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator038 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator038 {

    public List<String> validate(FeeDto038 dto) {
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
        if (dto.getFeeField007() != null && dto.getFeeField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField007 must not be negative");
        }
        if (dto.getFeeField009() != null && dto.getFeeField009() < 0) {
            errors.add("feeField009 must not be negative");
        }
        return errors;
    }
}
