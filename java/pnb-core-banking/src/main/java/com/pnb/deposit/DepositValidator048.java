package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator048 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator048 {

    public List<String> validate(DepositDto048 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField001() != null && dto.getDepoField001().isBlank()) {
            errors.add("depoField001 must not be blank if provided");
        }
        if (dto.getDepoField004() != null && dto.getDepoField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField004 must not be negative");
        }
        return errors;
    }
}
