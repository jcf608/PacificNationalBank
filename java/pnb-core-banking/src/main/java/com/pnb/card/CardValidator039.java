package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator039 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator039 {

    public List<String> validate(CardDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField003() != null && dto.getCardField003() < 0) {
            errors.add("cardField003 must not be negative");
        }
        if (dto.getCardField004() != null && dto.getCardField004() < 0) {
            errors.add("cardField004 must not be negative");
        }
        if (dto.getCardField009() != null && dto.getCardField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField009 must not be negative");
        }
        if (dto.getCardField010() != null && dto.getCardField010() < 0) {
            errors.add("cardField010 must not be negative");
        }
        return errors;
    }
}
