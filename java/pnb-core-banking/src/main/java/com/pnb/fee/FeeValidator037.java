package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator037 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator037 {

    public List<String> validate(FeeDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField001() != null && dto.getFeeField001() < 0) {
            errors.add("feeField001 must not be negative");
        }
        if (dto.getFeeField003() != null && dto.getFeeField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField003 must not be negative");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField004 must not be negative");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField006 must not be negative");
        }
        if (dto.getFeeField007() != null && dto.getFeeField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField007 must not be negative");
        }
        return errors;
    }
}
