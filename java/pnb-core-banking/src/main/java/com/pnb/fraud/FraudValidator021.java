package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator021 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator021 {

    public List<String> validate(FraudDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField000() != null && dto.getFrauField000().isBlank()) {
            errors.add("frauField000 must not be blank if provided");
        }
        if (dto.getFrauField001() != null && dto.getFrauField001().isBlank()) {
            errors.add("frauField001 must not be blank if provided");
        }
        if (dto.getFrauField002() != null && dto.getFrauField002().isBlank()) {
            errors.add("frauField002 must not be blank if provided");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField006 must not be negative");
        }
        if (dto.getFrauField007() != null && dto.getFrauField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField007 must not be negative");
        }
        if (dto.getFrauField010() != null && dto.getFrauField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField010 must not be negative");
        }
        if (dto.getFrauField014() != null && dto.getFrauField014() < 0) {
            errors.add("frauField014 must not be negative");
        }
        if (dto.getFrauField015() != null && dto.getFrauField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField015 must not be negative");
        }
        return errors;
    }
}
