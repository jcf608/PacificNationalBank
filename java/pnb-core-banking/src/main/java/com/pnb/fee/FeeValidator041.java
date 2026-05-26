package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator041 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator041 {

    public List<String> validate(FeeDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField001() != null && dto.getFeeField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField001 must not be negative");
        }
        if (dto.getFeeField002() != null && dto.getFeeField002() < 0) {
            errors.add("feeField002 must not be negative");
        }
        if (dto.getFeeField011() != null && dto.getFeeField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField011 must not be negative");
        }
        return errors;
    }
}
