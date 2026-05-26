package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator042 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator042 {

    public List<String> validate(CardDto042 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField000() != null && dto.getCardField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField000 must not be negative");
        }
        if (dto.getCardField002() != null && dto.getCardField002() < 0) {
            errors.add("cardField002 must not be negative");
        }
        if (dto.getCardField005() != null && dto.getCardField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField005 must not be negative");
        }
        if (dto.getCardField010() != null && dto.getCardField010().isBlank()) {
            errors.add("cardField010 must not be blank if provided");
        }
        if (dto.getCardField012() != null && dto.getCardField012().isBlank()) {
            errors.add("cardField012 must not be blank if provided");
        }
        return errors;
    }
}
