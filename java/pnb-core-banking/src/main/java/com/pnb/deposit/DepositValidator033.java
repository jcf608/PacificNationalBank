package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator033 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator033 {

    public List<String> validate(DepositDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000() < 0) {
            errors.add("depoField000 must not be negative");
        }
        if (dto.getDepoField002() != null && dto.getDepoField002() < 0) {
            errors.add("depoField002 must not be negative");
        }
        if (dto.getDepoField003() != null && dto.getDepoField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField003 must not be negative");
        }
        if (dto.getDepoField007() != null && dto.getDepoField007().isBlank()) {
            errors.add("depoField007 must not be blank if provided");
        }
        if (dto.getDepoField010() != null && dto.getDepoField010().isBlank()) {
            errors.add("depoField010 must not be blank if provided");
        }
        if (dto.getDepoField015() != null && dto.getDepoField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField015 must not be negative");
        }
        return errors;
    }
}
