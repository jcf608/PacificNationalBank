package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator038 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator038 {

    public List<String> validate(DepositDto038 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000().isBlank()) {
            errors.add("depoField000 must not be blank if provided");
        }
        if (dto.getDepoField001() != null && dto.getDepoField001().isBlank()) {
            errors.add("depoField001 must not be blank if provided");
        }
        if (dto.getDepoField002() != null && dto.getDepoField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField002 must not be negative");
        }
        if (dto.getDepoField007() != null && dto.getDepoField007() < 0) {
            errors.add("depoField007 must not be negative");
        }
        if (dto.getDepoField008() != null && dto.getDepoField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField008 must not be negative");
        }
        return errors;
    }
}
