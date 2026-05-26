package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator052 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator052 {

    public List<String> validate(CardDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField000() != null && dto.getCardField000() < 0) {
            errors.add("cardField000 must not be negative");
        }
        if (dto.getCardField005() != null && dto.getCardField005().isBlank()) {
            errors.add("cardField005 must not be blank if provided");
        }
        if (dto.getCardField008() != null && dto.getCardField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField008 must not be negative");
        }
        if (dto.getCardField009() != null && dto.getCardField009() < 0) {
            errors.add("cardField009 must not be negative");
        }
        return errors;
    }
}
