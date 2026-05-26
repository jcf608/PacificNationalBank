package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator058 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator058 {

    public List<String> validate(DepositDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField002() != null && dto.getDepoField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField002 must not be negative");
        }
        if (dto.getDepoField003() != null && dto.getDepoField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField003 must not be negative");
        }
        if (dto.getDepoField004() != null && dto.getDepoField004().isBlank()) {
            errors.add("depoField004 must not be blank if provided");
        }
        if (dto.getDepoField005() != null && dto.getDepoField005() < 0) {
            errors.add("depoField005 must not be negative");
        }
        if (dto.getDepoField008() != null && dto.getDepoField008().isBlank()) {
            errors.add("depoField008 must not be blank if provided");
        }
        if (dto.getDepoField013() != null && dto.getDepoField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField013 must not be negative");
        }
        if (dto.getDepoField015() != null && dto.getDepoField015() < 0) {
            errors.add("depoField015 must not be negative");
        }
        if (dto.getDepoField016() != null && dto.getDepoField016() < 0) {
            errors.add("depoField016 must not be negative");
        }
        if (dto.getDepoField017() != null && dto.getDepoField017().isBlank()) {
            errors.add("depoField017 must not be blank if provided");
        }
        return errors;
    }
}
