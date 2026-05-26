package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator035 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator035 {

    public List<String> validate(AlertDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField001() != null && dto.getAlerField001().isBlank()) {
            errors.add("alerField001 must not be blank if provided");
        }
        if (dto.getAlerField003() != null && dto.getAlerField003() < 0) {
            errors.add("alerField003 must not be negative");
        }
        if (dto.getAlerField004() != null && dto.getAlerField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField004 must not be negative");
        }
        if (dto.getAlerField005() != null && dto.getAlerField005() < 0) {
            errors.add("alerField005 must not be negative");
        }
        if (dto.getAlerField006() != null && dto.getAlerField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField006 must not be negative");
        }
        if (dto.getAlerField010() != null && dto.getAlerField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField010 must not be negative");
        }
        if (dto.getAlerField011() != null && dto.getAlerField011() < 0) {
            errors.add("alerField011 must not be negative");
        }
        if (dto.getAlerField013() != null && dto.getAlerField013().isBlank()) {
            errors.add("alerField013 must not be blank if provided");
        }
        if (dto.getAlerField014() != null && dto.getAlerField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField014 must not be negative");
        }
        if (dto.getAlerField015() != null && dto.getAlerField015() < 0) {
            errors.add("alerField015 must not be negative");
        }
        if (dto.getAlerField016() != null && dto.getAlerField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField016 must not be negative");
        }
        if (dto.getAlerField017() != null && dto.getAlerField017().isBlank()) {
            errors.add("alerField017 must not be blank if provided");
        }
        return errors;
    }
}
