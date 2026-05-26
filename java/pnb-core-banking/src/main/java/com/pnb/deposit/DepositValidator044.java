package com.pnb.deposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * DepositValidator044 — Business rule validation.
 */
@ApplicationScoped
public class DepositValidator044 {

    public List<String> validate(DepositDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("deposit DTO must not be null");
            return errors;
        }
        if (dto.getDepoField000() != null && dto.getDepoField000() < 0) {
            errors.add("depoField000 must not be negative");
        }
        if (dto.getDepoField002() != null && dto.getDepoField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField002 must not be negative");
        }
        if (dto.getDepoField005() != null && dto.getDepoField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField005 must not be negative");
        }
        if (dto.getDepoField007() != null && dto.getDepoField007().isBlank()) {
            errors.add("depoField007 must not be blank if provided");
        }
        if (dto.getDepoField009() != null && dto.getDepoField009().isBlank()) {
            errors.add("depoField009 must not be blank if provided");
        }
        if (dto.getDepoField010() != null && dto.getDepoField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("depoField010 must not be negative");
        }
        if (dto.getDepoField012() != null && dto.getDepoField012() < 0) {
            errors.add("depoField012 must not be negative");
        }
        if (dto.getDepoField015() != null && dto.getDepoField015().isBlank()) {
            errors.add("depoField015 must not be blank if provided");
        }
        return errors;
    }
}
