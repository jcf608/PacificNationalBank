package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator034 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator034 {

    public List<String> validate(AccountDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField002() != null && dto.getAccoField002().isBlank()) {
            errors.add("accoField002 must not be blank if provided");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005() < 0) {
            errors.add("accoField005 must not be negative");
        }
        if (dto.getAccoField006() != null && dto.getAccoField006() < 0) {
            errors.add("accoField006 must not be negative");
        }
        if (dto.getAccoField008() != null && dto.getAccoField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField008 must not be negative");
        }
        if (dto.getAccoField011() != null && dto.getAccoField011() < 0) {
            errors.add("accoField011 must not be negative");
        }
        if (dto.getAccoField013() != null && dto.getAccoField013().isBlank()) {
            errors.add("accoField013 must not be blank if provided");
        }
        if (dto.getAccoField016() != null && dto.getAccoField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField016 must not be negative");
        }
        if (dto.getAccoField017() != null && dto.getAccoField017().isBlank()) {
            errors.add("accoField017 must not be blank if provided");
        }
        return errors;
    }
}
