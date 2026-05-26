package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator050 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator050 {

    public List<String> validate(CardDto050 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField001() != null && dto.getCardField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField001 must not be negative");
        }
        if (dto.getCardField002() != null && dto.getCardField002() < 0) {
            errors.add("cardField002 must not be negative");
        }
        if (dto.getCardField004() != null && dto.getCardField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField004 must not be negative");
        }
        if (dto.getCardField007() != null && dto.getCardField007() < 0) {
            errors.add("cardField007 must not be negative");
        }
        if (dto.getCardField009() != null && dto.getCardField009() < 0) {
            errors.add("cardField009 must not be negative");
        }
        return errors;
    }
}
