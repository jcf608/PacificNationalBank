package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator056 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator056 {

    public List<String> validate(FraudDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField002() != null && dto.getFrauField002().isBlank()) {
            errors.add("frauField002 must not be blank if provided");
        }
        if (dto.getFrauField005() != null && dto.getFrauField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField005 must not be negative");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006() < 0) {
            errors.add("frauField006 must not be negative");
        }
        if (dto.getFrauField009() != null && dto.getFrauField009().isBlank()) {
            errors.add("frauField009 must not be blank if provided");
        }
        if (dto.getFrauField012() != null && dto.getFrauField012().isBlank()) {
            errors.add("frauField012 must not be blank if provided");
        }
        if (dto.getFrauField013() != null && dto.getFrauField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField013 must not be negative");
        }
        if (dto.getFrauField014() != null && dto.getFrauField014().isBlank()) {
            errors.add("frauField014 must not be blank if provided");
        }
        if (dto.getFrauField015() != null && dto.getFrauField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField015 must not be negative");
        }
        return errors;
    }
}
