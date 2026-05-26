package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator040 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator040 {

    public List<String> validate(AlertDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField005() != null && dto.getAlerField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField005 must not be negative");
        }
        if (dto.getAlerField010() != null && dto.getAlerField010().isBlank()) {
            errors.add("alerField010 must not be blank if provided");
        }
        if (dto.getAlerField011() != null && dto.getAlerField011() < 0) {
            errors.add("alerField011 must not be negative");
        }
        return errors;
    }
}
