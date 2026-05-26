package com.pnb.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AccountValidator023 — Business rule validation.
 */
@ApplicationScoped
public class AccountValidator023 {

    public List<String> validate(AccountDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("account DTO must not be null");
            return errors;
        }
        if (dto.getAccoField000() != null && dto.getAccoField000().isBlank()) {
            errors.add("accoField000 must not be blank if provided");
        }
        if (dto.getAccoField003() != null && dto.getAccoField003() < 0) {
            errors.add("accoField003 must not be negative");
        }
        if (dto.getAccoField004() != null && dto.getAccoField004() < 0) {
            errors.add("accoField004 must not be negative");
        }
        if (dto.getAccoField005() != null && dto.getAccoField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField005 must not be negative");
        }
        if (dto.getAccoField007() != null && dto.getAccoField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("accoField007 must not be negative");
        }
        if (dto.getAccoField011() != null && dto.getAccoField011() < 0) {
            errors.add("accoField011 must not be negative");
        }
        if (dto.getAccoField013() != null && dto.getAccoField013().isBlank()) {
            errors.add("accoField013 must not be blank if provided");
        }
        if (dto.getAccoField018() != null && dto.getAccoField018().isBlank()) {
            errors.add("accoField018 must not be blank if provided");
        }
        return errors;
    }
}
