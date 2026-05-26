package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator034 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator034 {

    public List<String> validate(DepositDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000().isBlank()) {
            errors.add("depoField000 must not be blank if provided");
        }
        if (dto.getDepoField001() != null && dto.getDepoField001() < 0) {
            errors.add("depoField001 must not be negative");
        }
        if (dto.getDepoField003() != null && dto.getDepoField003() < 0) {
            errors.add("depoField003 must not be negative");
        }
        if (dto.getDepoField004() != null && dto.getDepoField004().isBlank()) {
            errors.add("depoField004 must not be blank if provided");
        }
        if (dto.getDepoField007() != null && dto.getDepoField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField007 must not be negative");
        }
        if (dto.getDepoField008() != null && dto.getDepoField008().isBlank()) {
            errors.add("depoField008 must not be blank if provided");
        }
        if (dto.getDepoField011() != null && dto.getDepoField011() < 0) {
            errors.add("depoField011 must not be negative");
        }
        if (dto.getDepoField012() != null && dto.getDepoField012().isBlank()) {
            errors.add("depoField012 must not be blank if provided");
        }
        if (dto.getDepoField013() != null && dto.getDepoField013() < 0) {
            errors.add("depoField013 must not be negative");
        }
        if (dto.getDepoField016() != null && dto.getDepoField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField016 must not be negative");
        }
        return errors;
    }
}
