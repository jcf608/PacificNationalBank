package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator022 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator022 {

    public List<String> validate(AlertDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField000() != null && dto.getAlerField000().isBlank()) {
            errors.add("alerField000 must not be blank if provided");
        }
        if (dto.getAlerField002() != null && dto.getAlerField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField002 must not be negative");
        }
        if (dto.getAlerField003() != null && dto.getAlerField003().isBlank()) {
            errors.add("alerField003 must not be blank if provided");
        }
        if (dto.getAlerField008() != null && dto.getAlerField008().isBlank()) {
            errors.add("alerField008 must not be blank if provided");
        }
        if (dto.getAlerField011() != null && dto.getAlerField011() < 0) {
            errors.add("alerField011 must not be negative");
        }
        if (dto.getAlerField015() != null && dto.getAlerField015().isBlank()) {
            errors.add("alerField015 must not be blank if provided");
        }
        if (dto.getAlerField016() != null && dto.getAlerField016().isBlank()) {
            errors.add("alerField016 must not be blank if provided");
        }
        if (dto.getAlerField017() != null && dto.getAlerField017().isBlank()) {
            errors.add("alerField017 must not be blank if provided");
        }
        return errors;
    }
}
