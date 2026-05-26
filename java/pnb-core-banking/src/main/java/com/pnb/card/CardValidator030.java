package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator030 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator030 {

    public List<String> validate(CardDto030 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField001() != null && dto.getCardField001() < 0) {
            errors.add("cardField001 must not be negative");
        }
        if (dto.getCardField004() != null && dto.getCardField004() < 0) {
            errors.add("cardField004 must not be negative");
        }
        if (dto.getCardField005() != null && dto.getCardField005().isBlank()) {
            errors.add("cardField005 must not be blank if provided");
        }
        if (dto.getCardField008() != null && dto.getCardField008() < 0) {
            errors.add("cardField008 must not be negative");
        }
        if (dto.getCardField009() != null && dto.getCardField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField009 must not be negative");
        }
        if (dto.getCardField010() != null && dto.getCardField010().isBlank()) {
            errors.add("cardField010 must not be blank if provided");
        }
        if (dto.getCardField011() != null && dto.getCardField011().isBlank()) {
            errors.add("cardField011 must not be blank if provided");
        }
        if (dto.getCardField012() != null && dto.getCardField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField012 must not be negative");
        }
        if (dto.getCardField013() != null && dto.getCardField013().isBlank()) {
            errors.add("cardField013 must not be blank if provided");
        }
        return errors;
    }
}
