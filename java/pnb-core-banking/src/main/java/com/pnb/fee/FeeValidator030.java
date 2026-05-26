package com.pnb.fee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FeeValidator030 — Business rule validation.
 */
@ApplicationScoped
public class FeeValidator030 {

    public List<String> validate(FeeDto030 dto) {
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
        if (dto.getFeeField002() != null && dto.getFeeField002().isBlank()) {
            errors.add("feeField002 must not be blank if provided");
        }
        if (dto.getFeeField005() != null && dto.getFeeField005().isBlank()) {
            errors.add("feeField005 must not be blank if provided");
        }
        if (dto.getFeeField008() != null && dto.getFeeField008() < 0) {
            errors.add("feeField008 must not be negative");
        }
        if (dto.getFeeField010() != null && dto.getFeeField010().isBlank()) {
            errors.add("feeField010 must not be blank if provided");
        }
        if (dto.getFeeField012() != null && dto.getFeeField012().isBlank()) {
            errors.add("feeField012 must not be blank if provided");
        }
        if (dto.getFeeField013() != null && dto.getFeeField013() < 0) {
            errors.add("feeField013 must not be negative");
        }
        return errors;
    }
}
