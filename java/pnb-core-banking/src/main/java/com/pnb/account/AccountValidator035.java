package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator035 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator035 {

    public List<String> validate(AccountDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField001() != null && dto.getAccoField001() < 0) {
            errors.add("accoField001 must not be negative");
        }
        if (dto.getAccoField003() != null && dto.getAccoField003() < 0) {
            errors.add("accoField003 must not be negative");
        }
        if (dto.getAccoField004() != null && dto.getAccoField004() < 0) {
            errors.add("accoField004 must not be negative");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005() < 0) {
            errors.add("accoField005 must not be negative");
        }
        if (dto.getAccoField007() != null && dto.getAccoField007() < 0) {
            errors.add("accoField007 must not be negative");
        }
        if (dto.getAccoField010() != null && dto.getAccoField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField010 must not be negative");
        }
        if (dto.getAccoField011() != null && dto.getAccoField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField011 must not be negative");
        }
        if (dto.getAccoField013() != null && dto.getAccoField013() < 0) {
            errors.add("accoField013 must not be negative");
        }
        if (dto.getAccoField015() != null && dto.getAccoField015() < 0) {
            errors.add("accoField015 must not be negative");
        }
        return errors;
    }
}
