package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator047 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator047 {

    public List<String> validate(AlertDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField001() != null && dto.getAlerField001() < 0) {
            errors.add("alerField001 must not be negative");
        }
        if (dto.getAlerField002() != null && dto.getAlerField002() < 0) {
            errors.add("alerField002 must not be negative");
        }
        if (dto.getAlerField003() != null && dto.getAlerField003() < 0) {
            errors.add("alerField003 must not be negative");
        }
        if (dto.getAlerField008() != null && dto.getAlerField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField008 must not be negative");
        }
        if (dto.getAlerField009() != null && dto.getAlerField009().isBlank()) {
            errors.add("alerField009 must not be blank if provided");
        }
        if (dto.getAlerField011() != null && dto.getAlerField011().isBlank()) {
            errors.add("alerField011 must not be blank if provided");
        }
        if (dto.getAlerField016() != null && dto.getAlerField016().isBlank()) {
            errors.add("alerField016 must not be blank if provided");
        }
        if (dto.getAlerField018() != null && dto.getAlerField018() < 0) {
            errors.add("alerField018 must not be negative");
        }
        return errors;
    }
}
