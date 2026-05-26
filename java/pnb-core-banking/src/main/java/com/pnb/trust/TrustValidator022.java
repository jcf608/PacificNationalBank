package com.pnb.trust;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TrustValidator022 — Business rule validation.
 */
@ApplicationScoped
public class TrustValidator022 {

    public List<String> validate(TrustDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("trust DTO must not be null");
            return errors;
        }
        if (dto.getTrusField000() != null && dto.getTrusField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("trusField000 must not be negative");
        }
        if (dto.getTrusField003() != null && dto.getTrusField003().isBlank()) {
            errors.add("trusField003 must not be blank if provided");
        }
        if (dto.getTrusField010() != null && dto.getTrusField010() < 0) {
            errors.add("trusField010 must not be negative");
        }
        if (dto.getTrusField012() != null && dto.getTrusField012().isBlank()) {
            errors.add("trusField012 must not be blank if provided");
        }
        if (dto.getTrusField013() != null && dto.getTrusField013() < 0) {
            errors.add("trusField013 must not be negative");
        }
        if (dto.getTrusField015() != null && dto.getTrusField015().isBlank()) {
            errors.add("trusField015 must not be blank if provided");
        }
        if (dto.getTrusField016() != null && dto.getTrusField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("trusField016 must not be negative");
        }
        return errors;
    }
}
