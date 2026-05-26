package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator058 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator058 {

    public List<String> validate(FeeDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField003() != null && dto.getFeeField003() < 0) {
            errors.add("feeField003 must not be negative");
        }
        if (dto.getFeeField005() != null && dto.getFeeField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField005 must not be negative");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField006 must not be negative");
        }
        if (dto.getFeeField007() != null && dto.getFeeField007().isBlank()) {
            errors.add("feeField007 must not be blank if provided");
        }
        if (dto.getFeeField008() != null && dto.getFeeField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField008 must not be negative");
        }
        if (dto.getFeeField010() != null && dto.getFeeField010().isBlank()) {
            errors.add("feeField010 must not be blank if provided");
        }
        if (dto.getFeeField013() != null && dto.getFeeField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField013 must not be negative");
        }
        if (dto.getFeeField016() != null && dto.getFeeField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField016 must not be negative");
        }
        return errors;
    }
}
