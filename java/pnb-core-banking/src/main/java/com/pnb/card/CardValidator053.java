package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator053 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator053 {

    public List<String> validate(CardDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField003() != null && dto.getCardField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField003 must not be negative");
        }
        if (dto.getCardField004() != null && dto.getCardField004() < 0) {
            errors.add("cardField004 must not be negative");
        }
        if (dto.getCardField005() != null && dto.getCardField005().isBlank()) {
            errors.add("cardField005 must not be blank if provided");
        }
        if (dto.getCardField006() != null && dto.getCardField006().isBlank()) {
            errors.add("cardField006 must not be blank if provided");
        }
        return errors;
    }
}
