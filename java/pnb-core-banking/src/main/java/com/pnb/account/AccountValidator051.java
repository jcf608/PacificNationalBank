package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator051 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator051 {

    public List<String> validate(AccountDto051 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField004() != null && dto.getAccoField004().isBlank()) {
            errors.add("accoField004 must not be blank if provided");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField005 must not be negative");
        }
        if (dto.getAccoField008() != null && dto.getAccoField008() < 0) {
            errors.add("accoField008 must not be negative");
        }
        return errors;
    }
}
