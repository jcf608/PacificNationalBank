package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator036 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator036 {

    public List<String> validate(FeeDto036 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField000() != null && dto.getFeeField000() < 0) {
            errors.add("feeField000 must not be negative");
        }
        if (dto.getFeeField002() != null && dto.getFeeField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField002 must not be negative");
        }
        if (dto.getFeeField003() != null && dto.getFeeField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField003 must not be negative");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006() < 0) {
            errors.add("feeField006 must not be negative");
        }
        if (dto.getFeeField007() != null && dto.getFeeField007().isBlank()) {
            errors.add("feeField007 must not be blank if provided");
        }
        return errors;
    }
}
