package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator026 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator026 {

    public List<String> validate(DepositDto026 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField002() != null && dto.getDepoField002().isBlank()) {
            errors.add("depoField002 must not be blank if provided");
        }
        if (dto.getDepoField005() != null && dto.getDepoField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField005 must not be negative");
        }
        if (dto.getDepoField007() != null && dto.getDepoField007() < 0) {
            errors.add("depoField007 must not be negative");
        }
        if (dto.getDepoField009() != null && dto.getDepoField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField009 must not be negative");
        }
        return errors;
    }
}
