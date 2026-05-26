package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator046 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator046 {

    public List<String> validate(DepositDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField002() != null && dto.getDepoField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField002 must not be negative");
        }
        if (dto.getDepoField007() != null && dto.getDepoField007() < 0) {
            errors.add("depoField007 must not be negative");
        }
        if (dto.getDepoField015() != null && dto.getDepoField015().isBlank()) {
            errors.add("depoField015 must not be blank if provided");
        }
        return errors;
    }
}
