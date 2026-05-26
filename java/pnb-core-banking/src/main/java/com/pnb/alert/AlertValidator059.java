package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator059 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator059 {

    public List<String> validate(AlertDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField000() != null && dto.getAlerField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField000 must not be negative");
        }
        if (dto.getAlerField002() != null && dto.getAlerField002() < 0) {
            errors.add("alerField002 must not be negative");
        }
        if (dto.getAlerField003() != null && dto.getAlerField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField003 must not be negative");
        }
        if (dto.getAlerField004() != null && dto.getAlerField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField004 must not be negative");
        }
        if (dto.getAlerField005() != null && dto.getAlerField005() < 0) {
            errors.add("alerField005 must not be negative");
        }
        if (dto.getAlerField007() != null && dto.getAlerField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField007 must not be negative");
        }
        if (dto.getAlerField010() != null && dto.getAlerField010() < 0) {
            errors.add("alerField010 must not be negative");
        }
        if (dto.getAlerField011() != null && dto.getAlerField011().isBlank()) {
            errors.add("alerField011 must not be blank if provided");
        }
        if (dto.getAlerField012() != null && dto.getAlerField012() < 0) {
            errors.add("alerField012 must not be negative");
        }
        if (dto.getAlerField013() != null && dto.getAlerField013().isBlank()) {
            errors.add("alerField013 must not be blank if provided");
        }
        if (dto.getAlerField014() != null && dto.getAlerField014() < 0) {
            errors.add("alerField014 must not be negative");
        }
        if (dto.getAlerField017() != null && dto.getAlerField017().isBlank()) {
            errors.add("alerField017 must not be blank if provided");
        }
        return errors;
    }
}
