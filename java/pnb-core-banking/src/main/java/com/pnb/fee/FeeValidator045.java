package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator045 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator045 {

    public List<String> validate(FeeDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField001() != null && dto.getFeeField001().isBlank()) {
            errors.add("feeField001 must not be blank if provided");
        }
        if (dto.getFeeField002() != null && dto.getFeeField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField002 must not be negative");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField004 must not be negative");
        }
        if (dto.getFeeField007() != null && dto.getFeeField007().isBlank()) {
            errors.add("feeField007 must not be blank if provided");
        }
        if (dto.getFeeField008() != null && dto.getFeeField008().isBlank()) {
            errors.add("feeField008 must not be blank if provided");
        }
        if (dto.getFeeField014() != null && dto.getFeeField014() < 0) {
            errors.add("feeField014 must not be negative");
        }
        if (dto.getFeeField015() != null && dto.getFeeField015().isBlank()) {
            errors.add("feeField015 must not be blank if provided");
        }
        if (dto.getFeeField016() != null && dto.getFeeField016() < 0) {
            errors.add("feeField016 must not be negative");
        }
        return errors;
    }
}
