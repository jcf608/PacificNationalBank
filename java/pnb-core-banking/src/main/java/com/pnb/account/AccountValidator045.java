package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator045 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator045 {

    public List<String> validate(AccountDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField000() != null && dto.getAccoField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField000 must not be negative");
        }
        if (dto.getAccoField001() != null && dto.getAccoField001().isBlank()) {
            errors.add("accoField001 must not be blank if provided");
        }
        if (dto.getAccoField002() != null && dto.getAccoField002().isBlank()) {
            errors.add("accoField002 must not be blank if provided");
        }
        if (dto.getAccoField003() != null && dto.getAccoField003().isBlank()) {
            errors.add("accoField003 must not be blank if provided");
        }
        if (dto.getAccoField004() != null && dto.getAccoField004() < 0) {
            errors.add("accoField004 must not be negative");
        }
        if (dto.getAccoField013() != null && dto.getAccoField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField013 must not be negative");
        }
        if (dto.getAccoField015() != null && dto.getAccoField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField015 must not be negative");
        }
        return errors;
    }
}
