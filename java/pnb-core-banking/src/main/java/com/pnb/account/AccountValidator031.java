package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator031 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator031 {

    public List<String> validate(AccountDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField000() != null && dto.getAccoField000().isBlank()) {
            errors.add("accoField000 must not be blank if provided");
        }
        if (dto.getAccoField001() != null && dto.getAccoField001() < 0) {
            errors.add("accoField001 must not be negative");
        }
        if (dto.getAccoField002() != null && dto.getAccoField002() < 0) {
            errors.add("accoField002 must not be negative");
        }
        if (dto.getAccoField004() != null && dto.getAccoField004() < 0) {
            errors.add("accoField004 must not be negative");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField005 must not be negative");
        }
        if (dto.getAccoField007() != null && dto.getAccoField007().isBlank()) {
            errors.add("accoField007 must not be blank if provided");
        }
        if (dto.getAccoField010() != null && dto.getAccoField010().isBlank()) {
            errors.add("accoField010 must not be blank if provided");
        }
        if (dto.getAccoField011() != null && dto.getAccoField011() < 0) {
            errors.add("accoField011 must not be negative");
        }
        if (dto.getAccoField012() != null && dto.getAccoField012() < 0) {
            errors.add("accoField012 must not be negative");
        }
        if (dto.getAccoField013() != null && dto.getAccoField013() < 0) {
            errors.add("accoField013 must not be negative");
        }
        return errors;
    }
}
