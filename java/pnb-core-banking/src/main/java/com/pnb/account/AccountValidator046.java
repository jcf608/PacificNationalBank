package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator046 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator046 {

    public List<String> validate(AccountDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField010() != null && dto.getAccoField010().isBlank()) {
            errors.add("accoField010 must not be blank if provided");
        }
        if (dto.getAccoField012() != null && dto.getAccoField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField012 must not be negative");
        }
        if (dto.getAccoField015() != null && dto.getAccoField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField015 must not be negative");
        }
        if (dto.getAccoField017() != null && dto.getAccoField017().isBlank()) {
            errors.add("accoField017 must not be blank if provided");
        }
        return errors;
    }
}
