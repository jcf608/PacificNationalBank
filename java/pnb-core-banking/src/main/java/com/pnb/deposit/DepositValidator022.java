package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator022 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator022 {

    public List<String> validate(DepositDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField000 must not be negative");
        }
        if (dto.getDepoField002() != null && dto.getDepoField002() < 0) {
            errors.add("depoField002 must not be negative");
        }
        if (dto.getDepoField007() != null && dto.getDepoField007().isBlank()) {
            errors.add("depoField007 must not be blank if provided");
        }
        if (dto.getDepoField011() != null && dto.getDepoField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField011 must not be negative");
        }
        if (dto.getDepoField012() != null && dto.getDepoField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField012 must not be negative");
        }
        if (dto.getDepoField013() != null && dto.getDepoField013() < 0) {
            errors.add("depoField013 must not be negative");
        }
        if (dto.getDepoField015() != null && dto.getDepoField015() < 0) {
            errors.add("depoField015 must not be negative");
        }
        if (dto.getDepoField017() != null && dto.getDepoField017() < 0) {
            errors.add("depoField017 must not be negative");
        }
        return errors;
    }
}
