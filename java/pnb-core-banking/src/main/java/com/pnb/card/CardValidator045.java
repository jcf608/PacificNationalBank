package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator045 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator045 {

    public List<String> validate(CardDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField000() != null && dto.getCardField000() < 0) {
            errors.add("cardField000 must not be negative");
        }
        if (dto.getCardField001() != null && dto.getCardField001().isBlank()) {
            errors.add("cardField001 must not be blank if provided");
        }
        if (dto.getCardField003() != null && dto.getCardField003() < 0) {
            errors.add("cardField003 must not be negative");
        }
        if (dto.getCardField004() != null && dto.getCardField004().isBlank()) {
            errors.add("cardField004 must not be blank if provided");
        }
        if (dto.getCardField005() != null && dto.getCardField005().isBlank()) {
            errors.add("cardField005 must not be blank if provided");
        }
        if (dto.getCardField006() != null && dto.getCardField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField006 must not be negative");
        }
        if (dto.getCardField007() != null && dto.getCardField007().isBlank()) {
            errors.add("cardField007 must not be blank if provided");
        }
        if (dto.getCardField010() != null && dto.getCardField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField010 must not be negative");
        }
        if (dto.getCardField015() != null && dto.getCardField015().isBlank()) {
            errors.add("cardField015 must not be blank if provided");
        }
        return errors;
    }
}
