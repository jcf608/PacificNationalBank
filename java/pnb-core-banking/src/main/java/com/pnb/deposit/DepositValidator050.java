package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator050 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator050 {

    public List<String> validate(DepositDto050 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField001() != null && dto.getDepoField001().isBlank()) {
            errors.add("depoField001 must not be blank if provided");
        }
        if (dto.getDepoField002() != null && dto.getDepoField002().isBlank()) {
            errors.add("depoField002 must not be blank if provided");
        }
        if (dto.getDepoField005() != null && dto.getDepoField005() < 0) {
            errors.add("depoField005 must not be negative");
        }
        return errors;
    }
}
