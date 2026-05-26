package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator021 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator021 {

    public List<String> validate(AlertDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField000() != null && dto.getAlerField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField000 must not be negative");
        }
        if (dto.getAlerField001() != null && dto.getAlerField001().isBlank()) {
            errors.add("alerField001 must not be blank if provided");
        }
        if (dto.getAlerField002() != null && dto.getAlerField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField002 must not be negative");
        }
        if (dto.getAlerField003() != null && dto.getAlerField003() < 0) {
            errors.add("alerField003 must not be negative");
        }
        if (dto.getAlerField005() != null && dto.getAlerField005().isBlank()) {
            errors.add("alerField005 must not be blank if provided");
        }
        if (dto.getAlerField006() != null && dto.getAlerField006() < 0) {
            errors.add("alerField006 must not be negative");
        }
        if (dto.getAlerField010() != null && dto.getAlerField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField010 must not be negative");
        }
        if (dto.getAlerField011() != null && dto.getAlerField011() < 0) {
            errors.add("alerField011 must not be negative");
        }
        if (dto.getAlerField014() != null && dto.getAlerField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField014 must not be negative");
        }
        return errors;
    }
}
