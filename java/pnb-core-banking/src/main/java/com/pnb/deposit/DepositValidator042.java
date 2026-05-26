package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator042 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator042 {

    public List<String> validate(DepositDto042 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000().isBlank()) {
            errors.add("depoField000 must not be blank if provided");
        }
        if (dto.getDepoField002() != null && dto.getDepoField002() < 0) {
            errors.add("depoField002 must not be negative");
        }
        if (dto.getDepoField003() != null && dto.getDepoField003() < 0) {
            errors.add("depoField003 must not be negative");
        }
        if (dto.getDepoField004() != null && dto.getDepoField004().isBlank()) {
            errors.add("depoField004 must not be blank if provided");
        }
        if (dto.getDepoField006() != null && dto.getDepoField006().isBlank()) {
            errors.add("depoField006 must not be blank if provided");
        }
        if (dto.getDepoField013() != null && dto.getDepoField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField013 must not be negative");
        }
        return errors;
    }
}
