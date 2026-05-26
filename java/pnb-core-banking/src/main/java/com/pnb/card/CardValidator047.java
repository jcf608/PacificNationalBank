package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator047 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator047 {

    public List<String> validate(CardDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField001() != null && dto.getCardField001() < 0) {
            errors.add("cardField001 must not be negative");
        }
        if (dto.getCardField010() != null && dto.getCardField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField010 must not be negative");
        }
        if (dto.getCardField012() != null && dto.getCardField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField012 must not be negative");
        }
        if (dto.getCardField016() != null && dto.getCardField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField016 must not be negative");
        }
        return errors;
    }
}
