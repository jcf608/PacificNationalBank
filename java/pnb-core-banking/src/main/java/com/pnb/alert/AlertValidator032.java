package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator032 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator032 {

    public List<String> validate(AlertDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField003() != null && dto.getAlerField003().isBlank()) {
            errors.add("alerField003 must not be blank if provided");
        }
        if (dto.getAlerField006() != null && dto.getAlerField006() < 0) {
            errors.add("alerField006 must not be negative");
        }
        if (dto.getAlerField009() != null && dto.getAlerField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField009 must not be negative");
        }
        if (dto.getAlerField010() != null && dto.getAlerField010() < 0) {
            errors.add("alerField010 must not be negative");
        }
        if (dto.getAlerField014() != null && dto.getAlerField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField014 must not be negative");
        }
        if (dto.getAlerField015() != null && dto.getAlerField015().isBlank()) {
            errors.add("alerField015 must not be blank if provided");
        }
        return errors;
    }
}
