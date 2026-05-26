package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator033 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator033 {

    public List<String> validate(AlertDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField001() != null && dto.getAlerField001().isBlank()) {
            errors.add("alerField001 must not be blank if provided");
        }
        if (dto.getAlerField003() != null && dto.getAlerField003().isBlank()) {
            errors.add("alerField003 must not be blank if provided");
        }
        if (dto.getAlerField004() != null && dto.getAlerField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField004 must not be negative");
        }
        if (dto.getAlerField005() != null && dto.getAlerField005().isBlank()) {
            errors.add("alerField005 must not be blank if provided");
        }
        if (dto.getAlerField006() != null && dto.getAlerField006().isBlank()) {
            errors.add("alerField006 must not be blank if provided");
        }
        if (dto.getAlerField007() != null && dto.getAlerField007() < 0) {
            errors.add("alerField007 must not be negative");
        }
        if (dto.getAlerField009() != null && dto.getAlerField009().isBlank()) {
            errors.add("alerField009 must not be blank if provided");
        }
        if (dto.getAlerField011() != null && dto.getAlerField011() < 0) {
            errors.add("alerField011 must not be negative");
        }
        if (dto.getAlerField014() != null && dto.getAlerField014() < 0) {
            errors.add("alerField014 must not be negative");
        }
        return errors;
    }
}
