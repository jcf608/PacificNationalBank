package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator057 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator057 {

    public List<String> validate(DepositDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField000 must not be negative");
        }
        if (dto.getDepoField002() != null && dto.getDepoField002().isBlank()) {
            errors.add("depoField002 must not be blank if provided");
        }
        if (dto.getDepoField003() != null && dto.getDepoField003().isBlank()) {
            errors.add("depoField003 must not be blank if provided");
        }
        if (dto.getDepoField004() != null && dto.getDepoField004() < 0) {
            errors.add("depoField004 must not be negative");
        }
        if (dto.getDepoField005() != null && dto.getDepoField005() < 0) {
            errors.add("depoField005 must not be negative");
        }
        if (dto.getDepoField006() != null && dto.getDepoField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField006 must not be negative");
        }
        if (dto.getDepoField007() != null && dto.getDepoField007() < 0) {
            errors.add("depoField007 must not be negative");
        }
        if (dto.getDepoField009() != null && dto.getDepoField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField009 must not be negative");
        }
        if (dto.getDepoField011() != null && dto.getDepoField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField011 must not be negative");
        }
        if (dto.getDepoField012() != null && dto.getDepoField012().isBlank()) {
            errors.add("depoField012 must not be blank if provided");
        }
        if (dto.getDepoField013() != null && dto.getDepoField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField013 must not be negative");
        }
        if (dto.getDepoField015() != null && dto.getDepoField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField015 must not be negative");
        }
        return errors;
    }
}
