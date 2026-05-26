package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator023 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator023 {

    public List<String> validate(DepositDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000() < 0) {
            errors.add("depoField000 must not be negative");
        }
        if (dto.getDepoField005() != null && dto.getDepoField005() < 0) {
            errors.add("depoField005 must not be negative");
        }
        if (dto.getDepoField006() != null && dto.getDepoField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField006 must not be negative");
        }
        if (dto.getDepoField010() != null && dto.getDepoField010() < 0) {
            errors.add("depoField010 must not be negative");
        }
        if (dto.getDepoField012() != null && dto.getDepoField012().isBlank()) {
            errors.add("depoField012 must not be blank if provided");
        }
        if (dto.getDepoField017() != null && dto.getDepoField017().isBlank()) {
            errors.add("depoField017 must not be blank if provided");
        }
        if (dto.getDepoField018() != null && dto.getDepoField018() < 0) {
            errors.add("depoField018 must not be negative");
        }
        return errors;
    }
}
