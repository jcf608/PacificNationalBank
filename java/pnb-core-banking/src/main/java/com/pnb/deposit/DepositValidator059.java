package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator059 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator059 {

    public List<String> validate(DepositDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField000 must not be negative");
        }
        if (dto.getDepoField003() != null && dto.getDepoField003() < 0) {
            errors.add("depoField003 must not be negative");
        }
        if (dto.getDepoField004() != null && dto.getDepoField004().isBlank()) {
            errors.add("depoField004 must not be blank if provided");
        }
        if (dto.getDepoField006() != null && dto.getDepoField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField006 must not be negative");
        }
        if (dto.getDepoField008() != null && dto.getDepoField008() < 0) {
            errors.add("depoField008 must not be negative");
        }
        if (dto.getDepoField011() != null && dto.getDepoField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField011 must not be negative");
        }
        if (dto.getDepoField015() != null && dto.getDepoField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField015 must not be negative");
        }
        if (dto.getDepoField016() != null && dto.getDepoField016() < 0) {
            errors.add("depoField016 must not be negative");
        }
        if (dto.getDepoField017() != null && dto.getDepoField017() < 0) {
            errors.add("depoField017 must not be negative");
        }
        if (dto.getDepoField018() != null && dto.getDepoField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField018 must not be negative");
        }
        return errors;
    }
}
