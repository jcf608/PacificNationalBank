package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator037 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator037 {

    public List<String> validate(AlertDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField000() != null && dto.getAlerField000().isBlank()) {
            errors.add("alerField000 must not be blank if provided");
        }
        if (dto.getAlerField001() != null && dto.getAlerField001() < 0) {
            errors.add("alerField001 must not be negative");
        }
        if (dto.getAlerField003() != null && dto.getAlerField003().isBlank()) {
            errors.add("alerField003 must not be blank if provided");
        }
        if (dto.getAlerField004() != null && dto.getAlerField004().isBlank()) {
            errors.add("alerField004 must not be blank if provided");
        }
        if (dto.getAlerField005() != null && dto.getAlerField005() < 0) {
            errors.add("alerField005 must not be negative");
        }
        return errors;
    }
}
