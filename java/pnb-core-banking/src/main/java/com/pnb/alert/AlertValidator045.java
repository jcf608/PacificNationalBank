package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator045 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator045 {

    public List<String> validate(AlertDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField004() != null && dto.getAlerField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField004 must not be negative");
        }
        if (dto.getAlerField006() != null && dto.getAlerField006() < 0) {
            errors.add("alerField006 must not be negative");
        }
        if (dto.getAlerField013() != null && dto.getAlerField013().isBlank()) {
            errors.add("alerField013 must not be blank if provided");
        }
        return errors;
    }
}
