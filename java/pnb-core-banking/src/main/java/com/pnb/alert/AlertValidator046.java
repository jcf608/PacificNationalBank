package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator046 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator046 {

    public List<String> validate(AlertDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField000() != null && dto.getAlerField000().isBlank()) {
            errors.add("alerField000 must not be blank if provided");
        }
        if (dto.getAlerField003() != null && dto.getAlerField003().isBlank()) {
            errors.add("alerField003 must not be blank if provided");
        }
        if (dto.getAlerField004() != null && dto.getAlerField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField004 must not be negative");
        }
        if (dto.getAlerField009() != null && dto.getAlerField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField009 must not be negative");
        }
        if (dto.getAlerField012() != null && dto.getAlerField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField012 must not be negative");
        }
        if (dto.getAlerField013() != null && dto.getAlerField013() < 0) {
            errors.add("alerField013 must not be negative");
        }
        if (dto.getAlerField015() != null && dto.getAlerField015().isBlank()) {
            errors.add("alerField015 must not be blank if provided");
        }
        if (dto.getAlerField017() != null && dto.getAlerField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField017 must not be negative");
        }
        return errors;
    }
}
