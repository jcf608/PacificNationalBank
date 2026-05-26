package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator025 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator025 {

    public List<String> validate(AccountDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField001() != null && dto.getAccoField001().isBlank()) {
            errors.add("accoField001 must not be blank if provided");
        }
        if (dto.getAccoField002() != null && dto.getAccoField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField002 must not be negative");
        }
        if (dto.getAccoField008() != null && dto.getAccoField008().isBlank()) {
            errors.add("accoField008 must not be blank if provided");
        }
        return errors;
    }
}
