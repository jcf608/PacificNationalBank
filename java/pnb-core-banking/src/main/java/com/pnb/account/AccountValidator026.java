package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator026 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator026 {

    public List<String> validate(AccountDto026 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField000() != null && dto.getAccoField000().isBlank()) {
            errors.add("accoField000 must not be blank if provided");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005() < 0) {
            errors.add("accoField005 must not be negative");
        }
        if (dto.getAccoField006() != null && dto.getAccoField006().isBlank()) {
            errors.add("accoField006 must not be blank if provided");
        }
        if (dto.getAccoField008() != null && dto.getAccoField008() < 0) {
            errors.add("accoField008 must not be negative");
        }
        if (dto.getAccoField009() != null && dto.getAccoField009() < 0) {
            errors.add("accoField009 must not be negative");
        }
        return errors;
    }
}
