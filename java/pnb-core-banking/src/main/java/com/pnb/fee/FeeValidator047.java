package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator047 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator047 {

    public List<String> validate(FeeDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField002() != null && dto.getFeeField002().isBlank()) {
            errors.add("feeField002 must not be blank if provided");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004().isBlank()) {
            errors.add("feeField004 must not be blank if provided");
        }
        if (dto.getFeeField005() != null && dto.getFeeField005().isBlank()) {
            errors.add("feeField005 must not be blank if provided");
        }
        if (dto.getFeeField008() != null && dto.getFeeField008().isBlank()) {
            errors.add("feeField008 must not be blank if provided");
        }
        if (dto.getFeeField011() != null && dto.getFeeField011().isBlank()) {
            errors.add("feeField011 must not be blank if provided");
        }
        if (dto.getFeeField013() != null && dto.getFeeField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField013 must not be negative");
        }
        if (dto.getFeeField016() != null && dto.getFeeField016() < 0) {
            errors.add("feeField016 must not be negative");
        }
        return errors;
    }
}
