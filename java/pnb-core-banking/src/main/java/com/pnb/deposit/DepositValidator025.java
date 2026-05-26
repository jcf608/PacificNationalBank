package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator025 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator025 {

    public List<String> validate(DepositDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField004() != null && dto.getDepoField004() < 0) {
            errors.add("depoField004 must not be negative");
        }
        if (dto.getDepoField005() != null && dto.getDepoField005().isBlank()) {
            errors.add("depoField005 must not be blank if provided");
        }
        if (dto.getDepoField006() != null && dto.getDepoField006() < 0) {
            errors.add("depoField006 must not be negative");
        }
        if (dto.getDepoField007() != null && dto.getDepoField007() < 0) {
            errors.add("depoField007 must not be negative");
        }
        return errors;
    }
}
