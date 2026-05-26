package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator027 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator027 {

    public List<String> validate(AccountDto027 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField001() != null && dto.getAccoField001() < 0) {
            errors.add("accoField001 must not be negative");
        }
        if (dto.getAccoField002() != null && dto.getAccoField002().isBlank()) {
            errors.add("accoField002 must not be blank if provided");
        }
        if (dto.getAccoField008() != null && dto.getAccoField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField008 must not be negative");
        }
        if (dto.getAccoField009() != null && dto.getAccoField009().isBlank()) {
            errors.add("accoField009 must not be blank if provided");
        }
        return errors;
    }
}
