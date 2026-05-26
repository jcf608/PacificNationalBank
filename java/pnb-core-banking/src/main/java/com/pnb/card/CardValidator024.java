package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator024 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator024 {

    public List<String> validate(CardDto024 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField000() != null && dto.getCardField000() < 0) {
            errors.add("cardField000 must not be negative");
        }
        if (dto.getCardField001() != null && dto.getCardField001() < 0) {
            errors.add("cardField001 must not be negative");
        }
        if (dto.getCardField002() != null && dto.getCardField002() < 0) {
            errors.add("cardField002 must not be negative");
        }
        if (dto.getCardField003() != null && dto.getCardField003() < 0) {
            errors.add("cardField003 must not be negative");
        }
        if (dto.getCardField004() != null && dto.getCardField004() < 0) {
            errors.add("cardField004 must not be negative");
        }
        if (dto.getCardField006() != null && dto.getCardField006().isBlank()) {
            errors.add("cardField006 must not be blank if provided");
        }
        if (dto.getCardField007() != null && dto.getCardField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField007 must not be negative");
        }
        return errors;
    }
}
