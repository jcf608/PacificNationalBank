package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator055 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator055 {

    public List<String> validate(CardDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField001() != null && dto.getCardField001().isBlank()) {
            errors.add("cardField001 must not be blank if provided");
        }
        if (dto.getCardField002() != null && dto.getCardField002() < 0) {
            errors.add("cardField002 must not be negative");
        }
        if (dto.getCardField005() != null && dto.getCardField005() < 0) {
            errors.add("cardField005 must not be negative");
        }
        if (dto.getCardField009() != null && dto.getCardField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField009 must not be negative");
        }
        if (dto.getCardField010() != null && dto.getCardField010() < 0) {
            errors.add("cardField010 must not be negative");
        }
        if (dto.getCardField011() != null && dto.getCardField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField011 must not be negative");
        }
        if (dto.getCardField012() != null && dto.getCardField012() < 0) {
            errors.add("cardField012 must not be negative");
        }
        return errors;
    }
}
