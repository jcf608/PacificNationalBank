package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator031 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator031 {

    public List<String> validate(FeeDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField000() != null && dto.getFeeField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField000 must not be negative");
        }
        if (dto.getFeeField001() != null && dto.getFeeField001().isBlank()) {
            errors.add("feeField001 must not be blank if provided");
        }
        if (dto.getFeeField003() != null && dto.getFeeField003() < 0) {
            errors.add("feeField003 must not be negative");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006() < 0) {
            errors.add("feeField006 must not be negative");
        }
        if (dto.getFeeField007() != null && dto.getFeeField007() < 0) {
            errors.add("feeField007 must not be negative");
        }
        if (dto.getFeeField012() != null && dto.getFeeField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField012 must not be negative");
        }
        if (dto.getFeeField014() != null && dto.getFeeField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField014 must not be negative");
        }
        return errors;
    }
}
