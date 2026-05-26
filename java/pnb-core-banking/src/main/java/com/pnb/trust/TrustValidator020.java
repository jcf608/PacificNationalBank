package com.pnb.trust;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TrustValidator020 — Business rule validation.
 */
@ApplicationScoped
public class TrustValidator020 {

    public List<String> validate(TrustDto020 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("trust DTO must not be null");
            return errors;
        }
        if (dto.getTrusField002() != null && dto.getTrusField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("trusField002 must not be negative");
        }
        if (dto.getTrusField008() != null && dto.getTrusField008().isBlank()) {
            errors.add("trusField008 must not be blank if provided");
        }
        if (dto.getTrusField010() != null && dto.getTrusField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("trusField010 must not be negative");
        }
        if (dto.getTrusField015() != null && dto.getTrusField015() < 0) {
            errors.add("trusField015 must not be negative");
        }
        return errors;
    }
}
