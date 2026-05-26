package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator054 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator054 {

    public List<String> validate(AlertDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField002() != null && dto.getAlerField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField002 must not be negative");
        }
        if (dto.getAlerField007() != null && dto.getAlerField007().isBlank()) {
            errors.add("alerField007 must not be blank if provided");
        }
        if (dto.getAlerField009() != null && dto.getAlerField009().isBlank()) {
            errors.add("alerField009 must not be blank if provided");
        }
        if (dto.getAlerField011() != null && dto.getAlerField011() < 0) {
            errors.add("alerField011 must not be negative");
        }
        if (dto.getAlerField012() != null && dto.getAlerField012() < 0) {
            errors.add("alerField012 must not be negative");
        }
        return errors;
    }
}
