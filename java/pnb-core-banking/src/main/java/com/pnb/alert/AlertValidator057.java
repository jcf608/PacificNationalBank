package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator057 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator057 {

    public List<String> validate(AlertDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField002() != null && dto.getAlerField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField002 must not be negative");
        }
        if (dto.getAlerField003() != null && dto.getAlerField003() < 0) {
            errors.add("alerField003 must not be negative");
        }
        if (dto.getAlerField004() != null && dto.getAlerField004() < 0) {
            errors.add("alerField004 must not be negative");
        }
        if (dto.getAlerField009() != null && dto.getAlerField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField009 must not be negative");
        }
        if (dto.getAlerField013() != null && dto.getAlerField013() < 0) {
            errors.add("alerField013 must not be negative");
        }
        if (dto.getAlerField014() != null && dto.getAlerField014() < 0) {
            errors.add("alerField014 must not be negative");
        }
        return errors;
    }
}
