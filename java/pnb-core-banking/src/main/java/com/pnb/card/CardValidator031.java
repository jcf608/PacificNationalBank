package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator031 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator031 {

    public List<String> validate(CardDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField000() != null && dto.getCardField000().isBlank()) {
            errors.add("cardField000 must not be blank if provided");
        }
        if (dto.getCardField006() != null && dto.getCardField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField006 must not be negative");
        }
        if (dto.getCardField007() != null && dto.getCardField007() < 0) {
            errors.add("cardField007 must not be negative");
        }
        if (dto.getCardField014() != null && dto.getCardField014().isBlank()) {
            errors.add("cardField014 must not be blank if provided");
        }
        return errors;
    }
}
