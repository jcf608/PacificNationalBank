package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator022 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator022 {

    public List<String> validate(CardDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField001() != null && dto.getCardField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField001 must not be negative");
        }
        if (dto.getCardField005() != null && dto.getCardField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField005 must not be negative");
        }
        if (dto.getCardField008() != null && dto.getCardField008().isBlank()) {
            errors.add("cardField008 must not be blank if provided");
        }
        if (dto.getCardField009() != null && dto.getCardField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField009 must not be negative");
        }
        if (dto.getCardField012() != null && dto.getCardField012().isBlank()) {
            errors.add("cardField012 must not be blank if provided");
        }
        if (dto.getCardField013() != null && dto.getCardField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField013 must not be negative");
        }
        if (dto.getCardField014() != null && dto.getCardField014() < 0) {
            errors.add("cardField014 must not be negative");
        }
        if (dto.getCardField015() != null && dto.getCardField015() < 0) {
            errors.add("cardField015 must not be negative");
        }
        if (dto.getCardField017() != null && dto.getCardField017().isBlank()) {
            errors.add("cardField017 must not be blank if provided");
        }
        return errors;
    }
}
