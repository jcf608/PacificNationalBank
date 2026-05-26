package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator034 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator034 {

    public List<String> validate(AlertDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField000() != null && dto.getAlerField000() < 0) {
            errors.add("alerField000 must not be negative");
        }
        if (dto.getAlerField002() != null && dto.getAlerField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField002 must not be negative");
        }
        if (dto.getAlerField005() != null && dto.getAlerField005() < 0) {
            errors.add("alerField005 must not be negative");
        }
        if (dto.getAlerField008() != null && dto.getAlerField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField008 must not be negative");
        }
        if (dto.getAlerField011() != null && dto.getAlerField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField011 must not be negative");
        }
        if (dto.getAlerField013() != null && dto.getAlerField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField013 must not be negative");
        }
        if (dto.getAlerField014() != null && dto.getAlerField014().isBlank()) {
            errors.add("alerField014 must not be blank if provided");
        }
        return errors;
    }
}
