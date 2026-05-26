package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator047 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator047 {

    public List<String> validate(DepositDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField001() != null && dto.getDepoField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField001 must not be negative");
        }
        if (dto.getDepoField003() != null && dto.getDepoField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField003 must not be negative");
        }
        if (dto.getDepoField004() != null && dto.getDepoField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField004 must not be negative");
        }
        if (dto.getDepoField005() != null && dto.getDepoField005() < 0) {
            errors.add("depoField005 must not be negative");
        }
        if (dto.getDepoField009() != null && dto.getDepoField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField009 must not be negative");
        }
        if (dto.getDepoField016() != null && dto.getDepoField016() < 0) {
            errors.add("depoField016 must not be negative");
        }
        if (dto.getDepoField018() != null && dto.getDepoField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField018 must not be negative");
        }
        return errors;
    }
}
