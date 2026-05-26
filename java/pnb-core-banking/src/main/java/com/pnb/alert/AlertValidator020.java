package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator020 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator020 {

    public List<String> validate(AlertDto020 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField000() != null && dto.getAlerField000() < 0) {
            errors.add("alerField000 must not be negative");
        }
        if (dto.getAlerField001() != null && dto.getAlerField001() < 0) {
            errors.add("alerField001 must not be negative");
        }
        if (dto.getAlerField003() != null && dto.getAlerField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField003 must not be negative");
        }
        if (dto.getAlerField004() != null && dto.getAlerField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField004 must not be negative");
        }
        if (dto.getAlerField008() != null && dto.getAlerField008().isBlank()) {
            errors.add("alerField008 must not be blank if provided");
        }
        if (dto.getAlerField009() != null && dto.getAlerField009() < 0) {
            errors.add("alerField009 must not be negative");
        }
        if (dto.getAlerField011() != null && dto.getAlerField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField011 must not be negative");
        }
        if (dto.getAlerField013() != null && dto.getAlerField013().isBlank()) {
            errors.add("alerField013 must not be blank if provided");
        }
        if (dto.getAlerField014() != null && dto.getAlerField014() < 0) {
            errors.add("alerField014 must not be negative");
        }
        if (dto.getAlerField015() != null && dto.getAlerField015().isBlank()) {
            errors.add("alerField015 must not be blank if provided");
        }
        return errors;
    }
}
