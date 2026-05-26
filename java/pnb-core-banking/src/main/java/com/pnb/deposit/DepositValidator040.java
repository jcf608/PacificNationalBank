package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator040 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator040 {

    public List<String> validate(DepositDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField002() != null && dto.getDepoField002().isBlank()) {
            errors.add("depoField002 must not be blank if provided");
        }
        if (dto.getDepoField003() != null && dto.getDepoField003() < 0) {
            errors.add("depoField003 must not be negative");
        }
        if (dto.getDepoField008() != null && dto.getDepoField008().isBlank()) {
            errors.add("depoField008 must not be blank if provided");
        }
        if (dto.getDepoField010() != null && dto.getDepoField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField010 must not be negative");
        }
        if (dto.getDepoField011() != null && dto.getDepoField011() < 0) {
            errors.add("depoField011 must not be negative");
        }
        return errors;
    }
}
