package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator021 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator021 {

    public List<String> validate(AccountDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField004() != null && dto.getAccoField004() < 0) {
            errors.add("accoField004 must not be negative");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005() < 0) {
            errors.add("accoField005 must not be negative");
        }
        if (dto.getAccoField006() != null && dto.getAccoField006() < 0) {
            errors.add("accoField006 must not be negative");
        }
        if (dto.getAccoField008() != null && dto.getAccoField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField008 must not be negative");
        }
        if (dto.getAccoField010() != null && dto.getAccoField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField010 must not be negative");
        }
        return errors;
    }
}
