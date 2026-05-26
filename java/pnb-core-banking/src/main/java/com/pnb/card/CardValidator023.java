package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator023 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator023 {

    public List<String> validate(CardDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField001() != null && dto.getCardField001() < 0) {
            errors.add("cardField001 must not be negative");
        }
        if (dto.getCardField003() != null && dto.getCardField003() < 0) {
            errors.add("cardField003 must not be negative");
        }
        if (dto.getCardField006() != null && dto.getCardField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField006 must not be negative");
        }
        if (dto.getCardField010() != null && dto.getCardField010().isBlank()) {
            errors.add("cardField010 must not be blank if provided");
        }
        if (dto.getCardField015() != null && dto.getCardField015() < 0) {
            errors.add("cardField015 must not be negative");
        }
        if (dto.getCardField016() != null && dto.getCardField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField016 must not be negative");
        }
        if (dto.getCardField018() != null && dto.getCardField018() < 0) {
            errors.add("cardField018 must not be negative");
        }
        return errors;
    }
}
