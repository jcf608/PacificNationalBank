package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator044 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator044 {

    public List<String> validate(FeeDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField001() != null && dto.getFeeField001() < 0) {
            errors.add("feeField001 must not be negative");
        }
        if (dto.getFeeField002() != null && dto.getFeeField002().isBlank()) {
            errors.add("feeField002 must not be blank if provided");
        }
        if (dto.getFeeField003() != null && dto.getFeeField003().isBlank()) {
            errors.add("feeField003 must not be blank if provided");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004().isBlank()) {
            errors.add("feeField004 must not be blank if provided");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField006 must not be negative");
        }
        if (dto.getFeeField011() != null && dto.getFeeField011().isBlank()) {
            errors.add("feeField011 must not be blank if provided");
        }
        if (dto.getFeeField013() != null && dto.getFeeField013() < 0) {
            errors.add("feeField013 must not be negative");
        }
        if (dto.getFeeField015() != null && dto.getFeeField015() < 0) {
            errors.add("feeField015 must not be negative");
        }
        return errors;
    }
}
