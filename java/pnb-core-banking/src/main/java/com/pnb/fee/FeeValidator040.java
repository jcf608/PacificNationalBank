package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator040 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator040 {

    public List<String> validate(FeeDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField000() != null && dto.getFeeField000() < 0) {
            errors.add("feeField000 must not be negative");
        }
        if (dto.getFeeField001() != null && dto.getFeeField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField001 must not be negative");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004() < 0) {
            errors.add("feeField004 must not be negative");
        }
        if (dto.getFeeField005() != null && dto.getFeeField005() < 0) {
            errors.add("feeField005 must not be negative");
        }
        if (dto.getFeeField009() != null && dto.getFeeField009() < 0) {
            errors.add("feeField009 must not be negative");
        }
        if (dto.getFeeField010() != null && dto.getFeeField010() < 0) {
            errors.add("feeField010 must not be negative");
        }
        if (dto.getFeeField011() != null && dto.getFeeField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField011 must not be negative");
        }
        return errors;
    }
}
