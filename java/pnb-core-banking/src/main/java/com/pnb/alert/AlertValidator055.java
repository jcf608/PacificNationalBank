package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator055 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator055 {

    public List<String> validate(AlertDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField001() != null && dto.getAlerField001() < 0) {
            errors.add("alerField001 must not be negative");
        }
        if (dto.getAlerField006() != null && dto.getAlerField006() < 0) {
            errors.add("alerField006 must not be negative");
        }
        if (dto.getAlerField007() != null && dto.getAlerField007() < 0) {
            errors.add("alerField007 must not be negative");
        }
        if (dto.getAlerField008() != null && dto.getAlerField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField008 must not be negative");
        }
        if (dto.getAlerField009() != null && dto.getAlerField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField009 must not be negative");
        }
        if (dto.getAlerField011() != null && dto.getAlerField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField011 must not be negative");
        }
        if (dto.getAlerField013() != null && dto.getAlerField013().isBlank()) {
            errors.add("alerField013 must not be blank if provided");
        }
        return errors;
    }
}
