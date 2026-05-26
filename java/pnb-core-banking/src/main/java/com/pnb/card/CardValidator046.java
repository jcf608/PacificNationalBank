package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator046 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator046 {

    public List<String> validate(CardDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField004() != null && dto.getCardField004() < 0) {
            errors.add("cardField004 must not be negative");
        }
        if (dto.getCardField005() != null && dto.getCardField005() < 0) {
            errors.add("cardField005 must not be negative");
        }
        if (dto.getCardField007() != null && dto.getCardField007() < 0) {
            errors.add("cardField007 must not be negative");
        }
        if (dto.getCardField010() != null && dto.getCardField010().isBlank()) {
            errors.add("cardField010 must not be blank if provided");
        }
        if (dto.getCardField015() != null && dto.getCardField015().isBlank()) {
            errors.add("cardField015 must not be blank if provided");
        }
        if (dto.getCardField016() != null && dto.getCardField016().isBlank()) {
            errors.add("cardField016 must not be blank if provided");
        }
        return errors;
    }
}
