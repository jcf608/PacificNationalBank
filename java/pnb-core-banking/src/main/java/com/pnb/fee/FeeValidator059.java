package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator059 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator059 {

    public List<String> validate(FeeDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField001() != null && dto.getFeeField001() < 0) {
            errors.add("feeField001 must not be negative");
        }
        if (dto.getFeeField002() != null && dto.getFeeField002() < 0) {
            errors.add("feeField002 must not be negative");
        }
        if (dto.getFeeField003() != null && dto.getFeeField003().isBlank()) {
            errors.add("feeField003 must not be blank if provided");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004() < 0) {
            errors.add("feeField004 must not be negative");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField006 must not be negative");
        }
        if (dto.getFeeField007() != null && dto.getFeeField007().isBlank()) {
            errors.add("feeField007 must not be blank if provided");
        }
        if (dto.getFeeField009() != null && dto.getFeeField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField009 must not be negative");
        }
        if (dto.getFeeField015() != null && dto.getFeeField015() < 0) {
            errors.add("feeField015 must not be negative");
        }
        if (dto.getFeeField017() != null && dto.getFeeField017() < 0) {
            errors.add("feeField017 must not be negative");
        }
        return errors;
    }
}
