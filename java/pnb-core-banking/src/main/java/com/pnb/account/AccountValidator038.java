package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator038 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator038 {

    public List<String> validate(AccountDto038 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField000() != null && dto.getAccoField000() < 0) {
            errors.add("accoField000 must not be negative");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField005 must not be negative");
        }
        if (dto.getAccoField008() != null && dto.getAccoField008().isBlank()) {
            errors.add("accoField008 must not be blank if provided");
        }
        return errors;
    }
}
