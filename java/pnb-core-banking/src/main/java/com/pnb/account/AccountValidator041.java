package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator041 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator041 {

    public List<String> validate(AccountDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField009() != null && dto.getAccoField009() < 0) {
            errors.add("accoField009 must not be negative");
        }
        if (dto.getAccoField010() != null && dto.getAccoField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField010 must not be negative");
        }
        if (dto.getAccoField012() != null && dto.getAccoField012() < 0) {
            errors.add("accoField012 must not be negative");
        }
        return errors;
    }
}
