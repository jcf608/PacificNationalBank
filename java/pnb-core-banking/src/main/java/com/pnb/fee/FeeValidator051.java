package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator051 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator051 {

    public List<String> validate(FeeDto051 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField001() != null && dto.getFeeField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField001 must not be negative");
        }
        if (dto.getFeeField003() != null && dto.getFeeField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField003 must not be negative");
        }
        if (dto.getFeeField007() != null && dto.getFeeField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField007 must not be negative");
        }
        if (dto.getFeeField009() != null && dto.getFeeField009() < 0) {
            errors.add("feeField009 must not be negative");
        }
        return errors;
    }
}
