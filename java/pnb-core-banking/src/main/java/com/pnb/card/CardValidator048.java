package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator048 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator048 {

    public List<String> validate(CardDto048 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField005() != null && dto.getCardField005().isBlank()) {
            errors.add("cardField005 must not be blank if provided");
        }
        if (dto.getCardField007() != null && dto.getCardField007() < 0) {
            errors.add("cardField007 must not be negative");
        }
        return errors;
    }
}
