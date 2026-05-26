package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator044 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator044 {

    public List<String> validate(AlertDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField001() != null && dto.getAlerField001().isBlank()) {
            errors.add("alerField001 must not be blank if provided");
        }
        if (dto.getAlerField002() != null && dto.getAlerField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField002 must not be negative");
        }
        if (dto.getAlerField004() != null && dto.getAlerField004() < 0) {
            errors.add("alerField004 must not be negative");
        }
        if (dto.getAlerField005() != null && dto.getAlerField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField005 must not be negative");
        }
        if (dto.getAlerField007() != null && dto.getAlerField007() < 0) {
            errors.add("alerField007 must not be negative");
        }
        if (dto.getAlerField008() != null && dto.getAlerField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField008 must not be negative");
        }
        if (dto.getAlerField009() != null && dto.getAlerField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField009 must not be negative");
        }
        if (dto.getAlerField011() != null && dto.getAlerField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField011 must not be negative");
        }
        if (dto.getAlerField012() != null && dto.getAlerField012().isBlank()) {
            errors.add("alerField012 must not be blank if provided");
        }
        return errors;
    }
}
