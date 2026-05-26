package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator047 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator047 {

    public List<String> validate(AccountDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField001() != null && dto.getAccoField001().isBlank()) {
            errors.add("accoField001 must not be blank if provided");
        }
        if (dto.getAccoField002() != null && dto.getAccoField002() < 0) {
            errors.add("accoField002 must not be negative");
        }
        if (dto.getAccoField006() != null && dto.getAccoField006().isBlank()) {
            errors.add("accoField006 must not be blank if provided");
        }
        if (dto.getAccoField008() != null && dto.getAccoField008().isBlank()) {
            errors.add("accoField008 must not be blank if provided");
        }
        if (dto.getAccoField010() != null && dto.getAccoField010() < 0) {
            errors.add("accoField010 must not be negative");
        }
        if (dto.getAccoField013() != null && dto.getAccoField013().isBlank()) {
            errors.add("accoField013 must not be blank if provided");
        }
        if (dto.getAccoField014() != null && dto.getAccoField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField014 must not be negative");
        }
        if (dto.getAccoField016() != null && dto.getAccoField016() < 0) {
            errors.add("accoField016 must not be negative");
        }
        return errors;
    }
}
