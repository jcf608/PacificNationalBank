package com.pnb.trust;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TrustValidator024 — Business rule validation.
 */
@ApplicationScoped
public class TrustValidator024 {

    public List<String> validate(TrustDto024 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("trust DTO must not be null");
            return errors;
        }
        if (dto.getTrusField004() != null && dto.getTrusField004().isBlank()) {
            errors.add("trusField004 must not be blank if provided");
        }
        if (dto.getTrusField005() != null && dto.getTrusField005() < 0) {
            errors.add("trusField005 must not be negative");
        }
        if (dto.getTrusField006() != null && dto.getTrusField006().isBlank()) {
            errors.add("trusField006 must not be blank if provided");
        }
        if (dto.getTrusField007() != null && dto.getTrusField007().isBlank()) {
            errors.add("trusField007 must not be blank if provided");
        }
        return errors;
    }
}
