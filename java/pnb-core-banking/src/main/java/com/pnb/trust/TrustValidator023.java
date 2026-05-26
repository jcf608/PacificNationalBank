package com.pnb.trust;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TrustValidator023 — Business rule validation.
 */
@ApplicationScoped
public class TrustValidator023 {

    public List<String> validate(TrustDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("trust DTO must not be null");
            return errors;
        }
        if (dto.getTrusField003() != null && dto.getTrusField003().isBlank()) {
            errors.add("trusField003 must not be blank if provided");
        }
        if (dto.getTrusField006() != null && dto.getTrusField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("trusField006 must not be negative");
        }
        if (dto.getTrusField007() != null && dto.getTrusField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("trusField007 must not be negative");
        }
        if (dto.getTrusField012() != null && dto.getTrusField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("trusField012 must not be negative");
        }
        if (dto.getTrusField013() != null && dto.getTrusField013().isBlank()) {
            errors.add("trusField013 must not be blank if provided");
        }
        if (dto.getTrusField016() != null && dto.getTrusField016().isBlank()) {
            errors.add("trusField016 must not be blank if provided");
        }
        if (dto.getTrusField018() != null && dto.getTrusField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("trusField018 must not be negative");
        }
        return errors;
    }
}
