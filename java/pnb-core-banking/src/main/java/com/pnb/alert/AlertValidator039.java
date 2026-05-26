package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator039 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator039 {

    public List<String> validate(AlertDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField004() != null && dto.getAlerField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField004 must not be negative");
        }
        if (dto.getAlerField005() != null && dto.getAlerField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField005 must not be negative");
        }
        if (dto.getAlerField007() != null && dto.getAlerField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField007 must not be negative");
        }
        return errors;
    }
}
