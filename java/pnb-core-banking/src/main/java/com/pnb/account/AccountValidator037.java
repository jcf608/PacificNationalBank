package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator037 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator037 {

    public List<String> validate(AccountDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField001() != null && dto.getAccoField001() < 0) {
            errors.add("accoField001 must not be negative");
        }
        if (dto.getAccoField002() != null && dto.getAccoField002() < 0) {
            errors.add("accoField002 must not be negative");
        }
        if (dto.getAccoField003() != null && dto.getAccoField003().isBlank()) {
            errors.add("accoField003 must not be blank if provided");
        }
        if (dto.getAccoField006() != null && dto.getAccoField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField006 must not be negative");
        }
        if (dto.getAccoField007() != null && dto.getAccoField007().isBlank()) {
            errors.add("accoField007 must not be blank if provided");
        }
        return errors;
    }
}
