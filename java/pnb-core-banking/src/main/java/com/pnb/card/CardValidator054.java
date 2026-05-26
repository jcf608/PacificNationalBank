package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator054 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator054 {

    public List<String> validate(CardDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField001() != null && dto.getCardField001().isBlank()) {
            errors.add("cardField001 must not be blank if provided");
        }
        if (dto.getCardField002() != null && dto.getCardField002().isBlank()) {
            errors.add("cardField002 must not be blank if provided");
        }
        if (dto.getCardField007() != null && dto.getCardField007() < 0) {
            errors.add("cardField007 must not be negative");
        }
        if (dto.getCardField010() != null && dto.getCardField010() < 0) {
            errors.add("cardField010 must not be negative");
        }
        if (dto.getCardField011() != null && dto.getCardField011().isBlank()) {
            errors.add("cardField011 must not be blank if provided");
        }
        if (dto.getCardField012() != null && dto.getCardField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField012 must not be negative");
        }
        if (dto.getCardField013() != null && dto.getCardField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField013 must not be negative");
        }
        return errors;
    }
}
