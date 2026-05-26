package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator025 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator025 {

    public List<String> validate(CardDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField000() != null && dto.getCardField000().isBlank()) {
            errors.add("cardField000 must not be blank if provided");
        }
        if (dto.getCardField007() != null && dto.getCardField007() < 0) {
            errors.add("cardField007 must not be negative");
        }
        if (dto.getCardField008() != null && dto.getCardField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField008 must not be negative");
        }
        return errors;
    }
}
