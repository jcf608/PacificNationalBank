package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator052 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator052 {

    public List<String> validate(AlertDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField002() != null && dto.getAlerField002() < 0) {
            errors.add("alerField002 must not be negative");
        }
        if (dto.getAlerField007() != null && dto.getAlerField007().isBlank()) {
            errors.add("alerField007 must not be blank if provided");
        }
        if (dto.getAlerField008() != null && dto.getAlerField008() < 0) {
            errors.add("alerField008 must not be negative");
        }
        if (dto.getAlerField010() != null && dto.getAlerField010().isBlank()) {
            errors.add("alerField010 must not be blank if provided");
        }
        if (dto.getAlerField011() != null && dto.getAlerField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField011 must not be negative");
        }
        return errors;
    }
}
