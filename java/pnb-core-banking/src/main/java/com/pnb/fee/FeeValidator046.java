package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator046 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator046 {

    public List<String> validate(FeeDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField000() != null && dto.getFeeField000() < 0) {
            errors.add("feeField000 must not be negative");
        }
        if (dto.getFeeField001() != null && dto.getFeeField001().isBlank()) {
            errors.add("feeField001 must not be blank if provided");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField004 must not be negative");
        }
        if (dto.getFeeField012() != null && dto.getFeeField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField012 must not be negative");
        }
        if (dto.getFeeField015() != null && dto.getFeeField015().isBlank()) {
            errors.add("feeField015 must not be blank if provided");
        }
        return errors;
    }
}
