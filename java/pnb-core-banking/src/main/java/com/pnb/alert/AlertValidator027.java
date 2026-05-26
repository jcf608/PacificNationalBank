package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator027 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator027 {

    public List<String> validate(AlertDto027 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField003() != null && dto.getAlerField003() < 0) {
            errors.add("alerField003 must not be negative");
        }
        if (dto.getAlerField004() != null && dto.getAlerField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField004 must not be negative");
        }
        if (dto.getAlerField007() != null && dto.getAlerField007().isBlank()) {
            errors.add("alerField007 must not be blank if provided");
        }
        if (dto.getAlerField009() != null && dto.getAlerField009().isBlank()) {
            errors.add("alerField009 must not be blank if provided");
        }
        if (dto.getAlerField010() != null && dto.getAlerField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField010 must not be negative");
        }
        return errors;
    }
}
