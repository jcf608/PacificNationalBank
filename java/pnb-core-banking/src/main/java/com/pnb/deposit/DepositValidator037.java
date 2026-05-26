package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator037 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator037 {

    public List<String> validate(DepositDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000().isBlank()) {
            errors.add("depoField000 must not be blank if provided");
        }
        if (dto.getDepoField003() != null && dto.getDepoField003() < 0) {
            errors.add("depoField003 must not be negative");
        }
        if (dto.getDepoField005() != null && dto.getDepoField005().isBlank()) {
            errors.add("depoField005 must not be blank if provided");
        }
        if (dto.getDepoField008() != null && dto.getDepoField008().isBlank()) {
            errors.add("depoField008 must not be blank if provided");
        }
        return errors;
    }
}
