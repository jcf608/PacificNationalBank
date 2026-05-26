package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator049 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator049 {

    public List<String> validate(AccountDto049 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField000() != null && dto.getAccoField000() < 0) {
            errors.add("accoField000 must not be negative");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005() < 0) {
            errors.add("accoField005 must not be negative");
        }
        if (dto.getAccoField007() != null && dto.getAccoField007() < 0) {
            errors.add("accoField007 must not be negative");
        }
        return errors;
    }
}
