package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator054 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator054 {

    public List<String> validate(DepositDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField001() != null && dto.getDepoField001() < 0) {
            errors.add("depoField001 must not be negative");
        }
        if (dto.getDepoField002() != null && dto.getDepoField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField002 must not be negative");
        }
        if (dto.getDepoField008() != null && dto.getDepoField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField008 must not be negative");
        }
        if (dto.getDepoField011() != null && dto.getDepoField011() < 0) {
            errors.add("depoField011 must not be negative");
        }
        return errors;
    }
}
