package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator044 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator044 {

    public List<String> validate(AccountDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField004() != null && dto.getAccoField004() < 0) {
            errors.add("accoField004 must not be negative");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005().isBlank()) {
            errors.add("accoField005 must not be blank if provided");
        }
        if (dto.getAccoField007() != null && dto.getAccoField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField007 must not be negative");
        }
        if (dto.getAccoField008() != null && dto.getAccoField008().isBlank()) {
            errors.add("accoField008 must not be blank if provided");
        }
        if (dto.getAccoField009() != null && dto.getAccoField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField009 must not be negative");
        }
        if (dto.getAccoField013() != null && dto.getAccoField013().isBlank()) {
            errors.add("accoField013 must not be blank if provided");
        }
        if (dto.getAccoField015() != null && dto.getAccoField015() < 0) {
            errors.add("accoField015 must not be negative");
        }
        return errors;
    }
}
