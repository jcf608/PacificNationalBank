package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator024 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator024 {

    public List<String> validate(AccountDto024 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField003() != null && dto.getAccoField003() < 0) {
            errors.add("accoField003 must not be negative");
        }
        if (dto.getAccoField006() != null && dto.getAccoField006() < 0) {
            errors.add("accoField006 must not be negative");
        }
        if (dto.getAccoField007() != null && dto.getAccoField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField007 must not be negative");
        }
        return errors;
    }
}
