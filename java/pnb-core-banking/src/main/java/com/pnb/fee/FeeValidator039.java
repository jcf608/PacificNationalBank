package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator039 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator039 {

    public List<String> validate(FeeDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField000() != null && dto.getFeeField000().isBlank()) {
            errors.add("feeField000 must not be blank if provided");
        }
        if (dto.getFeeField002() != null && dto.getFeeField002().isBlank()) {
            errors.add("feeField002 must not be blank if provided");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004().isBlank()) {
            errors.add("feeField004 must not be blank if provided");
        }
        if (dto.getFeeField005() != null && dto.getFeeField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField005 must not be negative");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField006 must not be negative");
        }
        if (dto.getFeeField007() != null && dto.getFeeField007() < 0) {
            errors.add("feeField007 must not be negative");
        }
        if (dto.getFeeField009() != null && dto.getFeeField009().isBlank()) {
            errors.add("feeField009 must not be blank if provided");
        }
        if (dto.getFeeField010() != null && dto.getFeeField010().isBlank()) {
            errors.add("feeField010 must not be blank if provided");
        }
        return errors;
    }
}
