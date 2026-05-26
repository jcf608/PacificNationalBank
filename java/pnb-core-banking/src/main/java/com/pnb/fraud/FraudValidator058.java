package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator058 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator058 {

    public List<String> validate(FraudDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField001() != null && dto.getFrauField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField001 must not be negative");
        }
        if (dto.getFrauField002() != null && dto.getFrauField002() < 0) {
            errors.add("frauField002 must not be negative");
        }
        if (dto.getFrauField003() != null && dto.getFrauField003().isBlank()) {
            errors.add("frauField003 must not be blank if provided");
        }
        if (dto.getFrauField005() != null && dto.getFrauField005().isBlank()) {
            errors.add("frauField005 must not be blank if provided");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField006 must not be negative");
        }
        if (dto.getFrauField010() != null && dto.getFrauField010().isBlank()) {
            errors.add("frauField010 must not be blank if provided");
        }
        if (dto.getFrauField013() != null && dto.getFrauField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField013 must not be negative");
        }
        if (dto.getFrauField016() != null && dto.getFrauField016() < 0) {
            errors.add("frauField016 must not be negative");
        }
        return errors;
    }
}
