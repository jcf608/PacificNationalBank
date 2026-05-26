package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator032 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator032 {

    public List<String> validate(AccountDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField000() != null && dto.getAccoField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField000 must not be negative");
        }
        if (dto.getAccoField001() != null && dto.getAccoField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField001 must not be negative");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField005 must not be negative");
        }
        if (dto.getAccoField008() != null && dto.getAccoField008() < 0) {
            errors.add("accoField008 must not be negative");
        }
        if (dto.getAccoField013() != null && dto.getAccoField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField013 must not be negative");
        }
        return errors;
    }
}
