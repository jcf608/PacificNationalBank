package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator056 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator056 {

    public List<String> validate(AccountDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField002() != null && dto.getAccoField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField002 must not be negative");
        }
        if (dto.getAccoField003() != null && dto.getAccoField003().isBlank()) {
            errors.add("accoField003 must not be blank if provided");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005() < 0) {
            errors.add("accoField005 must not be negative");
        }
        if (dto.getAccoField007() != null && dto.getAccoField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField007 must not be negative");
        }
        return errors;
    }
}
