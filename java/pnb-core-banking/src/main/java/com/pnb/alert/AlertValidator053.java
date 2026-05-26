package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator053 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator053 {

    public List<String> validate(AlertDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField001() != null && dto.getAlerField001().isBlank()) {
            errors.add("alerField001 must not be blank if provided");
        }
        if (dto.getAlerField002() != null && dto.getAlerField002() < 0) {
            errors.add("alerField002 must not be negative");
        }
        if (dto.getAlerField003() != null && dto.getAlerField003() < 0) {
            errors.add("alerField003 must not be negative");
        }
        if (dto.getAlerField004() != null && dto.getAlerField004().isBlank()) {
            errors.add("alerField004 must not be blank if provided");
        }
        if (dto.getAlerField008() != null && dto.getAlerField008().isBlank()) {
            errors.add("alerField008 must not be blank if provided");
        }
        return errors;
    }
}
