package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator029 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator029 {

    public List<String> validate(DepositDto029 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000() < 0) {
            errors.add("depoField000 must not be negative");
        }
        if (dto.getDepoField001() != null && dto.getDepoField001().isBlank()) {
            errors.add("depoField001 must not be blank if provided");
        }
        if (dto.getDepoField002() != null && dto.getDepoField002() < 0) {
            errors.add("depoField002 must not be negative");
        }
        if (dto.getDepoField003() != null && dto.getDepoField003().isBlank()) {
            errors.add("depoField003 must not be blank if provided");
        }
        if (dto.getDepoField004() != null && dto.getDepoField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField004 must not be negative");
        }
        if (dto.getDepoField005() != null && dto.getDepoField005().isBlank()) {
            errors.add("depoField005 must not be blank if provided");
        }
        if (dto.getDepoField007() != null && dto.getDepoField007() < 0) {
            errors.add("depoField007 must not be negative");
        }
        return errors;
    }
}
