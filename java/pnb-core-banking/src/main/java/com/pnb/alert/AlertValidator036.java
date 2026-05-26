package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator036 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator036 {

    public List<String> validate(AlertDto036 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField001() != null && dto.getAlerField001() < 0) {
            errors.add("alerField001 must not be negative");
        }
        if (dto.getAlerField002() != null && dto.getAlerField002().isBlank()) {
            errors.add("alerField002 must not be blank if provided");
        }
        if (dto.getAlerField003() != null && dto.getAlerField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField003 must not be negative");
        }
        if (dto.getAlerField005() != null && dto.getAlerField005().isBlank()) {
            errors.add("alerField005 must not be blank if provided");
        }
        if (dto.getAlerField007() != null && dto.getAlerField007() < 0) {
            errors.add("alerField007 must not be negative");
        }
        return errors;
    }
}
