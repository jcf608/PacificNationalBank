package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator059 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator059 {

    public List<String> validate(FraudDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField002() != null && dto.getFrauField002().isBlank()) {
            errors.add("frauField002 must not be blank if provided");
        }
        if (dto.getFrauField003() != null && dto.getFrauField003() < 0) {
            errors.add("frauField003 must not be negative");
        }
        if (dto.getFrauField008() != null && dto.getFrauField008().isBlank()) {
            errors.add("frauField008 must not be blank if provided");
        }
        if (dto.getFrauField011() != null && dto.getFrauField011() < 0) {
            errors.add("frauField011 must not be negative");
        }
        if (dto.getFrauField013() != null && dto.getFrauField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField013 must not be negative");
        }
        if (dto.getFrauField014() != null && dto.getFrauField014() < 0) {
            errors.add("frauField014 must not be negative");
        }
        if (dto.getFrauField015() != null && dto.getFrauField015().isBlank()) {
            errors.add("frauField015 must not be blank if provided");
        }
        if (dto.getFrauField017() != null && dto.getFrauField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField017 must not be negative");
        }
        return errors;
    }
}
