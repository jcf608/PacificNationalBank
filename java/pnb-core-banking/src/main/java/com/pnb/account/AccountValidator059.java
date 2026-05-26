package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator059 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator059 {

    public List<String> validate(AccountDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField000() != null && dto.getAccoField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField000 must not be negative");
        }
        if (dto.getAccoField003() != null && dto.getAccoField003().isBlank()) {
            errors.add("accoField003 must not be blank if provided");
        }
        if (dto.getAccoField004() != null && dto.getAccoField004().isBlank()) {
            errors.add("accoField004 must not be blank if provided");
        }
        if (dto.getAccoField006() != null && dto.getAccoField006() < 0) {
            errors.add("accoField006 must not be negative");
        }
        if (dto.getAccoField009() != null && dto.getAccoField009() < 0) {
            errors.add("accoField009 must not be negative");
        }
        if (dto.getAccoField010() != null && dto.getAccoField010() < 0) {
            errors.add("accoField010 must not be negative");
        }
        if (dto.getAccoField013() != null && dto.getAccoField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField013 must not be negative");
        }
        if (dto.getAccoField015() != null && dto.getAccoField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField015 must not be negative");
        }
        if (dto.getAccoField017() != null && dto.getAccoField017().isBlank()) {
            errors.add("accoField017 must not be blank if provided");
        }
        return errors;
    }
}
