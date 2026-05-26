package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator030 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator030 {

    public List<String> validate(DepositDto030 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField000 must not be negative");
        }
        if (dto.getDepoField001() != null && dto.getDepoField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField001 must not be negative");
        }
        if (dto.getDepoField003() != null && dto.getDepoField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField003 must not be negative");
        }
        if (dto.getDepoField011() != null && dto.getDepoField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField011 must not be negative");
        }
        if (dto.getDepoField013() != null && dto.getDepoField013().isBlank()) {
            errors.add("depoField013 must not be blank if provided");
        }
        return errors;
    }
}
