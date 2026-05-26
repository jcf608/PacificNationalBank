package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator041 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator041 {

    public List<String> validate(DepositDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField000 must not be negative");
        }
        if (dto.getDepoField004() != null && dto.getDepoField004() < 0) {
            errors.add("depoField004 must not be negative");
        }
        if (dto.getDepoField005() != null && dto.getDepoField005().isBlank()) {
            errors.add("depoField005 must not be blank if provided");
        }
        return errors;
    }
}
