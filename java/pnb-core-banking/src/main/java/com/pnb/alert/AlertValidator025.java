package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator025 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator025 {

    public List<String> validate(AlertDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField000() != null && dto.getAlerField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField000 must not be negative");
        }
        if (dto.getAlerField003() != null && dto.getAlerField003().isBlank()) {
            errors.add("alerField003 must not be blank if provided");
        }
        if (dto.getAlerField005() != null && dto.getAlerField005() < 0) {
            errors.add("alerField005 must not be negative");
        }
        if (dto.getAlerField006() != null && dto.getAlerField006().isBlank()) {
            errors.add("alerField006 must not be blank if provided");
        }
        return errors;
    }
}
