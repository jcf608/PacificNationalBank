package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator020 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator020 {

    public List<String> validate(DepositDto020 dto) {
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
        if (dto.getDepoField008() != null && dto.getDepoField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField008 must not be negative");
        }
        if (dto.getDepoField010() != null && dto.getDepoField010() < 0) {
            errors.add("depoField010 must not be negative");
        }
        if (dto.getDepoField011() != null && dto.getDepoField011() < 0) {
            errors.add("depoField011 must not be negative");
        }
        if (dto.getDepoField012() != null && dto.getDepoField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField012 must not be negative");
        }
        if (dto.getDepoField013() != null && dto.getDepoField013().isBlank()) {
            errors.add("depoField013 must not be blank if provided");
        }
        if (dto.getDepoField015() != null && dto.getDepoField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField015 must not be negative");
        }
        return errors;
    }
}
