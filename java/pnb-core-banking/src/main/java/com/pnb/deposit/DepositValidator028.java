package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator028 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator028 {

    public List<String> validate(DepositDto028 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField001() != null && dto.getDepoField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField001 must not be negative");
        }
        if (dto.getDepoField006() != null && dto.getDepoField006() < 0) {
            errors.add("depoField006 must not be negative");
        }
        if (dto.getDepoField007() != null && dto.getDepoField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField007 must not be negative");
        }
        if (dto.getDepoField008() != null && dto.getDepoField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField008 must not be negative");
        }
        if (dto.getDepoField011() != null && dto.getDepoField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField011 must not be negative");
        }
        return errors;
    }
}
