package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator027 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator027 {

    public List<String> validate(DepositDto027 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField002() != null && dto.getDepoField002().isBlank()) {
            errors.add("depoField002 must not be blank if provided");
        }
        if (dto.getDepoField010() != null && dto.getDepoField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField010 must not be negative");
        }
        return errors;
    }
}
