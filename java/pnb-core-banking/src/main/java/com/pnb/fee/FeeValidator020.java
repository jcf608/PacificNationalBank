package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator020 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator020 {

    public List<String> validate(FeeDto020 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fee DTO must not be null");
            return errors;
        }
        if (dto.getFeeField000() != null && dto.getFeeField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField000 must not be negative");
        }
        if (dto.getFeeField001() != null && dto.getFeeField001() < 0) {
            errors.add("feeField001 must not be negative");
        }
        if (dto.getFeeField004() != null && dto.getFeeField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField004 must not be negative");
        }
        if (dto.getFeeField005() != null && dto.getFeeField005() < 0) {
            errors.add("feeField005 must not be negative");
        }
        if (dto.getFeeField006() != null && dto.getFeeField006().isBlank()) {
            errors.add("feeField006 must not be blank if provided");
        }
        if (dto.getFeeField007() != null && dto.getFeeField007().isBlank()) {
            errors.add("feeField007 must not be blank if provided");
        }
        if (dto.getFeeField008() != null && dto.getFeeField008().isBlank()) {
            errors.add("feeField008 must not be blank if provided");
        }
        if (dto.getFeeField012() != null && dto.getFeeField012().isBlank()) {
            errors.add("feeField012 must not be blank if provided");
        }
        if (dto.getFeeField013() != null && dto.getFeeField013().isBlank()) {
            errors.add("feeField013 must not be blank if provided");
        }
        if (dto.getFeeField014() != null && dto.getFeeField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("feeField014 must not be negative");
        }
        if (dto.getFeeField015() != null && dto.getFeeField015() < 0) {
            errors.add("feeField015 must not be negative");
        }
        return errors;
    }
}
