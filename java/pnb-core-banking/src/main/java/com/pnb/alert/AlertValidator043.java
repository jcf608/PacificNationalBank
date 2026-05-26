package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator043 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator043 {

    public List<String> validate(AlertDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField007() != null && dto.getAlerField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField007 must not be negative");
        }
        if (dto.getAlerField010() != null && dto.getAlerField010().isBlank()) {
            errors.add("alerField010 must not be blank if provided");
        }
        return errors;
    }
}
