package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator022 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator022 {

    public List<String> validate(AccountDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField001() != null && dto.getAccoField001() < 0) {
            errors.add("accoField001 must not be negative");
        }
        if (dto.getAccoField002() != null && dto.getAccoField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField002 must not be negative");
        }
        if (dto.getAccoField007() != null && dto.getAccoField007().isBlank()) {
            errors.add("accoField007 must not be blank if provided");
        }
        if (dto.getAccoField008() != null && dto.getAccoField008().isBlank()) {
            errors.add("accoField008 must not be blank if provided");
        }
        if (dto.getAccoField009() != null && dto.getAccoField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField009 must not be negative");
        }
        if (dto.getAccoField010() != null && dto.getAccoField010().isBlank()) {
            errors.add("accoField010 must not be blank if provided");
        }
        if (dto.getAccoField011() != null && dto.getAccoField011().isBlank()) {
            errors.add("accoField011 must not be blank if provided");
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
        if (dto.getAccoField017() != null && dto.getAccoField017() < 0) {
            errors.add("accoField017 must not be negative");
        }
        return errors;
    }
}
