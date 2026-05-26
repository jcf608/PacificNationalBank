package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator055 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator055 {

    public List<String> validate(AccountDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField002() != null && dto.getAccoField002() < 0) {
            errors.add("accoField002 must not be negative");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005() < 0) {
            errors.add("accoField005 must not be negative");
        }
        if (dto.getAccoField008() != null && dto.getAccoField008().isBlank()) {
            errors.add("accoField008 must not be blank if provided");
        }
        if (dto.getAccoField009() != null && dto.getAccoField009().isBlank()) {
            errors.add("accoField009 must not be blank if provided");
        }
        if (dto.getAccoField011() != null && dto.getAccoField011().isBlank()) {
            errors.add("accoField011 must not be blank if provided");
        }
        return errors;
    }
}
