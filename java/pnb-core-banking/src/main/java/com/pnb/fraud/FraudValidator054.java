package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator054 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator054 {

    public List<String> validate(FraudDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField003() != null && dto.getFrauField003() < 0) {
            errors.add("frauField003 must not be negative");
        }
        if (dto.getFrauField007() != null && dto.getFrauField007().isBlank()) {
            errors.add("frauField007 must not be blank if provided");
        }
        if (dto.getFrauField008() != null && dto.getFrauField008().isBlank()) {
            errors.add("frauField008 must not be blank if provided");
        }
        if (dto.getFrauField010() != null && dto.getFrauField010().isBlank()) {
            errors.add("frauField010 must not be blank if provided");
        }
        if (dto.getFrauField013() != null && dto.getFrauField013().isBlank()) {
            errors.add("frauField013 must not be blank if provided");
        }
        return errors;
    }
}
