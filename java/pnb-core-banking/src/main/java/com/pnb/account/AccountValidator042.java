package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator042 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator042 {

    public List<String> validate(AccountDto042 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField001() != null && dto.getAccoField001().isBlank()) {
            errors.add("accoField001 must not be blank if provided");
        }
        if (dto.getAccoField003() != null && dto.getAccoField003().isBlank()) {
            errors.add("accoField003 must not be blank if provided");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005().isBlank()) {
            errors.add("accoField005 must not be blank if provided");
        }
        if (dto.getAccoField006() != null && dto.getAccoField006().isBlank()) {
            errors.add("accoField006 must not be blank if provided");
        }
        if (dto.getAccoField013() != null && dto.getAccoField013() < 0) {
            errors.add("accoField013 must not be negative");
        }
        return errors;
    }
}
