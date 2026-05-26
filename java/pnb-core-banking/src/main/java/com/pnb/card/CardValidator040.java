package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator040 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator040 {

    public List<String> validate(CardDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField000() != null && dto.getCardField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField000 must not be negative");
        }
        if (dto.getCardField001() != null && dto.getCardField001().isBlank()) {
            errors.add("cardField001 must not be blank if provided");
        }
        if (dto.getCardField002() != null && dto.getCardField002().isBlank()) {
            errors.add("cardField002 must not be blank if provided");
        }
        if (dto.getCardField004() != null && dto.getCardField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField004 must not be negative");
        }
        if (dto.getCardField011() != null && dto.getCardField011() < 0) {
            errors.add("cardField011 must not be negative");
        }
        return errors;
    }
}
