package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator043 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator043 {

    public List<String> validate(DepositDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField001() != null && dto.getDepoField001() < 0) {
            errors.add("depoField001 must not be negative");
        }
        if (dto.getDepoField004() != null && dto.getDepoField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField004 must not be negative");
        }
        if (dto.getDepoField005() != null && dto.getDepoField005() < 0) {
            errors.add("depoField005 must not be negative");
        }
        if (dto.getDepoField006() != null && dto.getDepoField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField006 must not be negative");
        }
        if (dto.getDepoField010() != null && dto.getDepoField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField010 must not be negative");
        }
        if (dto.getDepoField012() != null && dto.getDepoField012() < 0) {
            errors.add("depoField012 must not be negative");
        }
        return errors;
    }
}
