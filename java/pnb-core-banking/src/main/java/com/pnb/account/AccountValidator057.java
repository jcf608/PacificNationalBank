package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator057 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator057 {

    public List<String> validate(AccountDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField000() != null && dto.getAccoField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField000 must not be negative");
        }
        if (dto.getAccoField007() != null && dto.getAccoField007().isBlank()) {
            errors.add("accoField007 must not be blank if provided");
        }
        if (dto.getAccoField008() != null && dto.getAccoField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField008 must not be negative");
        }
        if (dto.getAccoField010() != null && dto.getAccoField010() < 0) {
            errors.add("accoField010 must not be negative");
        }
        if (dto.getAccoField015() != null && dto.getAccoField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField015 must not be negative");
        }
        if (dto.getAccoField016() != null && dto.getAccoField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField016 must not be negative");
        }
        return errors;
    }
}
