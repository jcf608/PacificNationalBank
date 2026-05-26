package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator023 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator023 {

    public List<String> validate(AlertDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField000() != null && dto.getAlerField000().isBlank()) {
            errors.add("alerField000 must not be blank if provided");
        }
        if (dto.getAlerField001() != null && dto.getAlerField001().isBlank()) {
            errors.add("alerField001 must not be blank if provided");
        }
        if (dto.getAlerField004() != null && dto.getAlerField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField004 must not be negative");
        }
        if (dto.getAlerField007() != null && dto.getAlerField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField007 must not be negative");
        }
        if (dto.getAlerField008() != null && dto.getAlerField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField008 must not be negative");
        }
        if (dto.getAlerField009() != null && dto.getAlerField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField009 must not be negative");
        }
        if (dto.getAlerField011() != null && dto.getAlerField011().isBlank()) {
            errors.add("alerField011 must not be blank if provided");
        }
        if (dto.getAlerField014() != null && dto.getAlerField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField014 must not be negative");
        }
        if (dto.getAlerField018() != null && dto.getAlerField018().isBlank()) {
            errors.add("alerField018 must not be blank if provided");
        }
        return errors;
    }
}
