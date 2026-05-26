package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator050 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator050 {

    public List<String> validate(AlertDto050 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField000() != null && dto.getAlerField000() < 0) {
            errors.add("alerField000 must not be negative");
        }
        if (dto.getAlerField002() != null && dto.getAlerField002().isBlank()) {
            errors.add("alerField002 must not be blank if provided");
        }
        if (dto.getAlerField003() != null && dto.getAlerField003() < 0) {
            errors.add("alerField003 must not be negative");
        }
        if (dto.getAlerField009() != null && dto.getAlerField009().isBlank()) {
            errors.add("alerField009 must not be blank if provided");
        }
        return errors;
    }
}
