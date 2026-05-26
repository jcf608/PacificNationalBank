package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator023 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator023 {

    public List<String> validate(TransactionDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField002() != null && dto.getTranField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField002 must not be negative");
        }
        if (dto.getTranField003() != null && dto.getTranField003().isBlank()) {
            errors.add("tranField003 must not be blank if provided");
        }
        if (dto.getTranField004() != null && dto.getTranField004().isBlank()) {
            errors.add("tranField004 must not be blank if provided");
        }
        if (dto.getTranField007() != null && dto.getTranField007().isBlank()) {
            errors.add("tranField007 must not be blank if provided");
        }
        if (dto.getTranField008() != null && dto.getTranField008() < 0) {
            errors.add("tranField008 must not be negative");
        }
        if (dto.getTranField009() != null && dto.getTranField009().isBlank()) {
            errors.add("tranField009 must not be blank if provided");
        }
        if (dto.getTranField010() != null && dto.getTranField010().isBlank()) {
            errors.add("tranField010 must not be blank if provided");
        }
        if (dto.getTranField011() != null && dto.getTranField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField011 must not be negative");
        }
        if (dto.getTranField013() != null && dto.getTranField013().isBlank()) {
            errors.add("tranField013 must not be blank if provided");
        }
        if (dto.getTranField016() != null && dto.getTranField016().isBlank()) {
            errors.add("tranField016 must not be blank if provided");
        }
        if (dto.getTranField017() != null && dto.getTranField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField017 must not be negative");
        }
        return errors;
    }
}
