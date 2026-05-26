package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator058 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator058 {

    public List<String> validate(AccountDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField004() != null && dto.getAccoField004().isBlank()) {
            errors.add("accoField004 must not be blank if provided");
        }
        if (dto.getAccoField006() != null && dto.getAccoField006() < 0) {
            errors.add("accoField006 must not be negative");
        }
        if (dto.getAccoField009() != null && dto.getAccoField009().isBlank()) {
            errors.add("accoField009 must not be blank if provided");
        }
        if (dto.getAccoField017() != null && dto.getAccoField017() < 0) {
            errors.add("accoField017 must not be negative");
        }
        return errors;
    }
}
