package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator029 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator029 {

    public List<String> validate(AlertDto029 dto) {
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
        if (dto.getAlerField005() != null && dto.getAlerField005().isBlank()) {
            errors.add("alerField005 must not be blank if provided");
        }
        if (dto.getAlerField006() != null && dto.getAlerField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField006 must not be negative");
        }
        if (dto.getAlerField008() != null && dto.getAlerField008() < 0) {
            errors.add("alerField008 must not be negative");
        }
        return errors;
    }
}
