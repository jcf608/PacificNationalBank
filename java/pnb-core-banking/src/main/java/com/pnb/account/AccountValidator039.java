package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator039 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator039 {

    public List<String> validate(AccountDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField000() != null && dto.getAccoField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField000 must not be negative");
        }
        if (dto.getAccoField004() != null && dto.getAccoField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField004 must not be negative");
        }
        if (dto.getAccoField006() != null && dto.getAccoField006().isBlank()) {
            errors.add("accoField006 must not be blank if provided");
        }
        if (dto.getAccoField007() != null && dto.getAccoField007().isBlank()) {
            errors.add("accoField007 must not be blank if provided");
        }
        return errors;
    }
}
