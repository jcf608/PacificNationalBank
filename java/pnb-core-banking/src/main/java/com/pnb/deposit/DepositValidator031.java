package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator031 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator031 {

    public List<String> validate(DepositDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField003() != null && dto.getDepoField003() < 0) {
            errors.add("depoField003 must not be negative");
        }
        if (dto.getDepoField008() != null && dto.getDepoField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField008 must not be negative");
        }
        if (dto.getDepoField013() != null && dto.getDepoField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField013 must not be negative");
        }
        if (dto.getDepoField014() != null && dto.getDepoField014() < 0) {
            errors.add("depoField014 must not be negative");
        }
        return errors;
    }
}
