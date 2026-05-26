package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator035 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator035 {

    public List<String> validate(DepositDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField002() != null && dto.getDepoField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField002 must not be negative");
        }
        if (dto.getDepoField004() != null && dto.getDepoField004() < 0) {
            errors.add("depoField004 must not be negative");
        }
        if (dto.getDepoField007() != null && dto.getDepoField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField007 must not be negative");
        }
        if (dto.getDepoField008() != null && dto.getDepoField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField008 must not be negative");
        }
        if (dto.getDepoField017() != null && dto.getDepoField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField017 must not be negative");
        }
        return errors;
    }
}
