package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator033 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator033 {

    public List<String> validate(FeeDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField000() != null && dto.getFeeField000().isBlank()) {
            errors.add("feeField000 must not be blank if provided");
        }
        if (dto.getFeeField005() != null && dto.getFeeField005().isBlank()) {
            errors.add("feeField005 must not be blank if provided");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006() < 0) {
            errors.add("feeField006 must not be negative");
        }
        if (dto.getFeeField013() != null && dto.getFeeField013().isBlank()) {
            errors.add("feeField013 must not be blank if provided");
        }
        if (dto.getFeeField015() != null && dto.getFeeField015() < 0) {
            errors.add("feeField015 must not be negative");
        }
        return errors;
    }
}
