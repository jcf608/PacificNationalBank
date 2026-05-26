package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator053 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator053 {

    public List<String> validate(AccountDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField000() != null && dto.getAccoField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField000 must not be negative");
        }
        if (dto.getAccoField002() != null && dto.getAccoField002() < 0) {
            errors.add("accoField002 must not be negative");
        }
        if (dto.getAccoField004() != null && dto.getAccoField004().isBlank()) {
            errors.add("accoField004 must not be blank if provided");
        }
        if (dto.getAccoField009() != null && dto.getAccoField009() < 0) {
            errors.add("accoField009 must not be negative");
        }
        if (dto.getAccoField011() != null && dto.getAccoField011().isBlank()) {
            errors.add("accoField011 must not be blank if provided");
        }
        if (dto.getAccoField012() != null && dto.getAccoField012() < 0) {
            errors.add("accoField012 must not be negative");
        }
        return errors;
    }
}
