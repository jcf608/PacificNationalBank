package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator049 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator049 {

    public List<String> validate(DepositDto049 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000().isBlank()) {
            errors.add("depoField000 must not be blank if provided");
        }
        if (dto.getDepoField001() != null && dto.getDepoField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField001 must not be negative");
        }
        if (dto.getDepoField002() != null && dto.getDepoField002() < 0) {
            errors.add("depoField002 must not be negative");
        }
        if (dto.getDepoField005() != null && dto.getDepoField005().isBlank()) {
            errors.add("depoField005 must not be blank if provided");
        }
        if (dto.getDepoField006() != null && dto.getDepoField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField006 must not be negative");
        }
        return errors;
    }
}
