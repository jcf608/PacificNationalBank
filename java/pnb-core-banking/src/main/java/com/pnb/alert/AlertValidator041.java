package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator041 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator041 {

    public List<String> validate(AlertDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField004() != null && dto.getAlerField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField004 must not be negative");
        }
        if (dto.getAlerField005() != null && dto.getAlerField005().isBlank()) {
            errors.add("alerField005 must not be blank if provided");
        }
        if (dto.getAlerField006() != null && dto.getAlerField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField006 must not be negative");
        }
        if (dto.getAlerField008() != null && dto.getAlerField008() < 0) {
            errors.add("alerField008 must not be negative");
        }
        if (dto.getAlerField010() != null && dto.getAlerField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField010 must not be negative");
        }
        if (dto.getAlerField012() != null && dto.getAlerField012() < 0) {
            errors.add("alerField012 must not be negative");
        }
        return errors;
    }
}
