package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator058 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator058 {

    public List<String> validate(AlertDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField001() != null && dto.getAlerField001() < 0) {
            errors.add("alerField001 must not be negative");
        }
        if (dto.getAlerField004() != null && dto.getAlerField004() < 0) {
            errors.add("alerField004 must not be negative");
        }
        if (dto.getAlerField005() != null && dto.getAlerField005() < 0) {
            errors.add("alerField005 must not be negative");
        }
        if (dto.getAlerField009() != null && dto.getAlerField009().isBlank()) {
            errors.add("alerField009 must not be blank if provided");
        }
        if (dto.getAlerField015() != null && dto.getAlerField015() < 0) {
            errors.add("alerField015 must not be negative");
        }
        if (dto.getAlerField016() != null && dto.getAlerField016().isBlank()) {
            errors.add("alerField016 must not be blank if provided");
        }
        if (dto.getAlerField017() != null && dto.getAlerField017() < 0) {
            errors.add("alerField017 must not be negative");
        }
        return errors;
    }
}
