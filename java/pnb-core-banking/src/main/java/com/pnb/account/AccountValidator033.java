package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator033 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator033 {

    public List<String> validate(AccountDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField000() != null && dto.getAccoField000() < 0) {
            errors.add("accoField000 must not be negative");
        }
        if (dto.getAccoField004() != null && dto.getAccoField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField004 must not be negative");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField005 must not be negative");
        }
        if (dto.getAccoField006() != null && dto.getAccoField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField006 must not be negative");
        }
        if (dto.getAccoField009() != null && dto.getAccoField009() < 0) {
            errors.add("accoField009 must not be negative");
        }
        if (dto.getAccoField010() != null && dto.getAccoField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField010 must not be negative");
        }
        if (dto.getAccoField011() != null && dto.getAccoField011().isBlank()) {
            errors.add("accoField011 must not be blank if provided");
        }
        if (dto.getAccoField012() != null && dto.getAccoField012().isBlank()) {
            errors.add("accoField012 must not be blank if provided");
        }
        if (dto.getAccoField014() != null && dto.getAccoField014().isBlank()) {
            errors.add("accoField014 must not be blank if provided");
        }
        if (dto.getAccoField015() != null && dto.getAccoField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField015 must not be negative");
        }
        if (dto.getAccoField016() != null && dto.getAccoField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField016 must not be negative");
        }
        return errors;
    }
}
