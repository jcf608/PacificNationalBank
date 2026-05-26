package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator053 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator053 {

    public List<String> validate(DepositDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000() < 0) {
            errors.add("depoField000 must not be negative");
        }
        if (dto.getDepoField003() != null && dto.getDepoField003().isBlank()) {
            errors.add("depoField003 must not be blank if provided");
        }
        if (dto.getDepoField005() != null && dto.getDepoField005() < 0) {
            errors.add("depoField005 must not be negative");
        }
        if (dto.getDepoField008() != null && dto.getDepoField008().isBlank()) {
            errors.add("depoField008 must not be blank if provided");
        }
        if (dto.getDepoField009() != null && dto.getDepoField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField009 must not be negative");
        }
        if (dto.getDepoField012() != null && dto.getDepoField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField012 must not be negative");
        }
        return errors;
    }
}
