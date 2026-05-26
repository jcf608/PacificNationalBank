package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator052 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator052 {

    public List<String> validate(AccountDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField003() != null && dto.getAccoField003().isBlank()) {
            errors.add("accoField003 must not be blank if provided");
        }
        if (dto.getAccoField004() != null && dto.getAccoField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField004 must not be negative");
        }
        if (dto.getAccoField009() != null && dto.getAccoField009().isBlank()) {
            errors.add("accoField009 must not be blank if provided");
        }
        if (dto.getAccoField010() != null && dto.getAccoField010() < 0) {
            errors.add("accoField010 must not be negative");
        }
        return errors;
    }
}
