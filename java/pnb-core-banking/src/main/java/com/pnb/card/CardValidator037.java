package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator037 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator037 {

    public List<String> validate(CardDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField002() != null && dto.getCardField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField002 must not be negative");
        }
        if (dto.getCardField003() != null && dto.getCardField003().isBlank()) {
            errors.add("cardField003 must not be blank if provided");
        }
        if (dto.getCardField008() != null && dto.getCardField008().isBlank()) {
            errors.add("cardField008 must not be blank if provided");
        }
        return errors;
    }
}
