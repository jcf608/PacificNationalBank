package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator043 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator043 {

    public List<String> validate(CardDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField001() != null && dto.getCardField001() < 0) {
            errors.add("cardField001 must not be negative");
        }
        if (dto.getCardField002() != null && dto.getCardField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField002 must not be negative");
        }
        if (dto.getCardField003() != null && dto.getCardField003().isBlank()) {
            errors.add("cardField003 must not be blank if provided");
        }
        if (dto.getCardField004() != null && dto.getCardField004().isBlank()) {
            errors.add("cardField004 must not be blank if provided");
        }
        if (dto.getCardField006() != null && dto.getCardField006() < 0) {
            errors.add("cardField006 must not be negative");
        }
        if (dto.getCardField008() != null && dto.getCardField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField008 must not be negative");
        }
        if (dto.getCardField009() != null && dto.getCardField009() < 0) {
            errors.add("cardField009 must not be negative");
        }
        if (dto.getCardField011() != null && dto.getCardField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField011 must not be negative");
        }
        if (dto.getCardField013() != null && dto.getCardField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField013 must not be negative");
        }
        if (dto.getCardField014() != null && dto.getCardField014() < 0) {
            errors.add("cardField014 must not be negative");
        }
        return errors;
    }
}
