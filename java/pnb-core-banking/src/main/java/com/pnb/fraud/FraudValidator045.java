package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator045 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator045 {

    public List<String> validate(FraudDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField001() != null && dto.getFrauField001().isBlank()) {
            errors.add("frauField001 must not be blank if provided");
        }
        if (dto.getFrauField002() != null && dto.getFrauField002().isBlank()) {
            errors.add("frauField002 must not be blank if provided");
        }
        if (dto.getFrauField007() != null && dto.getFrauField007() < 0) {
            errors.add("frauField007 must not be negative");
        }
        if (dto.getFrauField009() != null && dto.getFrauField009() < 0) {
            errors.add("frauField009 must not be negative");
        }
        if (dto.getFrauField013() != null && dto.getFrauField013().isBlank()) {
            errors.add("frauField013 must not be blank if provided");
        }
        if (dto.getFrauField015() != null && dto.getFrauField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField015 must not be negative");
        }
        if (dto.getFrauField016() != null && dto.getFrauField016().isBlank()) {
            errors.add("frauField016 must not be blank if provided");
        }
        return errors;
    }
}
