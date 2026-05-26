package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator056 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator056 {

    public List<String> validate(AlertDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField000() != null && dto.getAlerField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField000 must not be negative");
        }
        if (dto.getAlerField003() != null && dto.getAlerField003() < 0) {
            errors.add("alerField003 must not be negative");
        }
        if (dto.getAlerField005() != null && dto.getAlerField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField005 must not be negative");
        }
        if (dto.getAlerField010() != null && dto.getAlerField010() < 0) {
            errors.add("alerField010 must not be negative");
        }
        if (dto.getAlerField011() != null && dto.getAlerField011() < 0) {
            errors.add("alerField011 must not be negative");
        }
        if (dto.getAlerField015() != null && dto.getAlerField015() < 0) {
            errors.add("alerField015 must not be negative");
        }
        return errors;
    }
}
