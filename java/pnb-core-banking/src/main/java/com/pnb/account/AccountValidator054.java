package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator054 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator054 {

    public List<String> validate(AccountDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField000() != null && dto.getAccoField000().isBlank()) {
            errors.add("accoField000 must not be blank if provided");
        }
        if (dto.getAccoField002() != null && dto.getAccoField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField002 must not be negative");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005().isBlank()) {
            errors.add("accoField005 must not be blank if provided");
        }
        if (dto.getAccoField006() != null && dto.getAccoField006() < 0) {
            errors.add("accoField006 must not be negative");
        }
        if (dto.getAccoField010() != null && dto.getAccoField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField010 must not be negative");
        }
        if (dto.getAccoField012() != null && dto.getAccoField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField012 must not be negative");
        }
        if (dto.getAccoField013() != null && dto.getAccoField013() < 0) {
            errors.add("accoField013 must not be negative");
        }
        return errors;
    }
}
