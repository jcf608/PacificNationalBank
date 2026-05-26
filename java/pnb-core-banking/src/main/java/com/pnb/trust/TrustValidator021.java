package com.pnb.trust;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TrustValidator021 — Business rule validation.
 */
@ApplicationScoped
public class TrustValidator021 {

    public List<String> validate(TrustDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("trust DTO must not be null");
            return errors;
        }
        if (dto.getTrusField000() != null && dto.getTrusField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("trusField000 must not be negative");
        }
        if (dto.getTrusField004() != null && dto.getTrusField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("trusField004 must not be negative");
        }
        if (dto.getTrusField005() != null && dto.getTrusField005() < 0) {
            errors.add("trusField005 must not be negative");
        }
        if (dto.getTrusField006() != null && dto.getTrusField006().isBlank()) {
            errors.add("trusField006 must not be blank if provided");
        }
        if (dto.getTrusField008() != null && dto.getTrusField008() < 0) {
            errors.add("trusField008 must not be negative");
        }
        if (dto.getTrusField009() != null && dto.getTrusField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("trusField009 must not be negative");
        }
        if (dto.getTrusField013() != null && dto.getTrusField013().isBlank()) {
            errors.add("trusField013 must not be blank if provided");
        }
        if (dto.getTrusField014() != null && dto.getTrusField014() < 0) {
            errors.add("trusField014 must not be negative");
        }
        if (dto.getTrusField015() != null && dto.getTrusField015() < 0) {
            errors.add("trusField015 must not be negative");
        }
        if (dto.getTrusField016() != null && dto.getTrusField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("trusField016 must not be negative");
        }
        return errors;
    }
}
