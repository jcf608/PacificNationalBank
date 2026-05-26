package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator055 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator055 {

    public List<String> validate(DepositDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField000 must not be negative");
        }
        if (dto.getDepoField001() != null && dto.getDepoField001().isBlank()) {
            errors.add("depoField001 must not be blank if provided");
        }
        if (dto.getDepoField008() != null && dto.getDepoField008().isBlank()) {
            errors.add("depoField008 must not be blank if provided");
        }
        if (dto.getDepoField013() != null && dto.getDepoField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField013 must not be negative");
        }
        if (dto.getDepoField014() != null && dto.getDepoField014() < 0) {
            errors.add("depoField014 must not be negative");
        }
        return errors;
    }
}
