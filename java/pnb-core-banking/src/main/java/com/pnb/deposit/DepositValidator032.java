package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator032 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator032 {

    public List<String> validate(DepositDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000().isBlank()) {
            errors.add("depoField000 must not be blank if provided");
        }
        if (dto.getDepoField004() != null && dto.getDepoField004().isBlank()) {
            errors.add("depoField004 must not be blank if provided");
        }
        if (dto.getDepoField005() != null && dto.getDepoField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField005 must not be negative");
        }
        if (dto.getDepoField006() != null && dto.getDepoField006().isBlank()) {
            errors.add("depoField006 must not be blank if provided");
        }
        if (dto.getDepoField008() != null && dto.getDepoField008() < 0) {
            errors.add("depoField008 must not be negative");
        }
        if (dto.getDepoField009() != null && dto.getDepoField009().isBlank()) {
            errors.add("depoField009 must not be blank if provided");
        }
        if (dto.getDepoField012() != null && dto.getDepoField012() < 0) {
            errors.add("depoField012 must not be negative");
        }
        if (dto.getDepoField015() != null && dto.getDepoField015() < 0) {
            errors.add("depoField015 must not be negative");
        }
        return errors;
    }
}
