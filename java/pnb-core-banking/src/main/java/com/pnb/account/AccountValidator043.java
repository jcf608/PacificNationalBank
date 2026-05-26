package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator043 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator043 {

    public List<String> validate(AccountDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField000() != null && dto.getAccoField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField000 must not be negative");
        }
        if (dto.getAccoField002() != null && dto.getAccoField002().isBlank()) {
            errors.add("accoField002 must not be blank if provided");
        }
        if (dto.getAccoField003() != null && dto.getAccoField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField003 must not be negative");
        }
        if (dto.getAccoField004() != null && dto.getAccoField004().isBlank()) {
            errors.add("accoField004 must not be blank if provided");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005() < 0) {
            errors.add("accoField005 must not be negative");
        }
        if (dto.getAccoField006() != null && dto.getAccoField006().isBlank()) {
            errors.add("accoField006 must not be blank if provided");
        }
        if (dto.getAccoField007() != null && dto.getAccoField007() < 0) {
            errors.add("accoField007 must not be negative");
        }
        if (dto.getAccoField009() != null && dto.getAccoField009().isBlank()) {
            errors.add("accoField009 must not be blank if provided");
        }
        if (dto.getAccoField010() != null && dto.getAccoField010() < 0) {
            errors.add("accoField010 must not be negative");
        }
        if (dto.getAccoField011() != null && dto.getAccoField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField011 must not be negative");
        }
        return errors;
    }
}
