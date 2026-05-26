package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator029 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator029 {

    public List<String> validate(FeeDto029 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField003() != null && dto.getFeeField003() < 0) {
            errors.add("feeField003 must not be negative");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004() < 0) {
            errors.add("feeField004 must not be negative");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006().isBlank()) {
            errors.add("feeField006 must not be blank if provided");
        }
        if (dto.getFeeField007() != null && dto.getFeeField007().isBlank()) {
            errors.add("feeField007 must not be blank if provided");
        }
        if (dto.getFeeField011() != null && dto.getFeeField011() < 0) {
            errors.add("feeField011 must not be negative");
        }
        return errors;
    }
}
