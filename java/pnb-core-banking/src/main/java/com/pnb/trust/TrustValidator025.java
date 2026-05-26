package com.pnb.trust;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TrustValidator025 — Business rule validation.
 */
@ApplicationScoped
public class TrustValidator025 {

    public List<String> validate(TrustDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("trust DTO must not be null");
            return errors;
        }
        if (dto.getTrusField003() != null && dto.getTrusField003().isBlank()) {
            errors.add("trusField003 must not be blank if provided");
        }
        if (dto.getTrusField004() != null && dto.getTrusField004().isBlank()) {
            errors.add("trusField004 must not be blank if provided");
        }
        return errors;
    }
}
