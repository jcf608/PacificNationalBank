package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator054 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator054 {

    public List<String> validate(FeeDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField000() != null && dto.getFeeField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField000 must not be negative");
        }
        if (dto.getFeeField001() != null && dto.getFeeField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField001 must not be negative");
        }
        if (dto.getFeeField002() != null && dto.getFeeField002().isBlank()) {
            errors.add("feeField002 must not be blank if provided");
        }
        if (dto.getFeeField003() != null && dto.getFeeField003().isBlank()) {
            errors.add("feeField003 must not be blank if provided");
        }
        if (dto.getFeeField009() != null && dto.getFeeField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField009 must not be negative");
        }
        if (dto.getFeeField013() != null && dto.getFeeField013() < 0) {
            errors.add("feeField013 must not be negative");
        }
        return errors;
    }
}
