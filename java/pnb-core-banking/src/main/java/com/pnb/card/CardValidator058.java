package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator058 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator058 {

    public List<String> validate(CardDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField000() != null && dto.getCardField000() < 0) {
            errors.add("cardField000 must not be negative");
        }
        if (dto.getCardField002() != null && dto.getCardField002() < 0) {
            errors.add("cardField002 must not be negative");
        }
        if (dto.getCardField003() != null && dto.getCardField003().isBlank()) {
            errors.add("cardField003 must not be blank if provided");
        }
        if (dto.getCardField004() != null && dto.getCardField004().isBlank()) {
            errors.add("cardField004 must not be blank if provided");
        }
        if (dto.getCardField005() != null && dto.getCardField005() < 0) {
            errors.add("cardField005 must not be negative");
        }
        if (dto.getCardField006() != null && dto.getCardField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField006 must not be negative");
        }
        if (dto.getCardField010() != null && dto.getCardField010() < 0) {
            errors.add("cardField010 must not be negative");
        }
        if (dto.getCardField012() != null && dto.getCardField012() < 0) {
            errors.add("cardField012 must not be negative");
        }
        if (dto.getCardField014() != null && dto.getCardField014().isBlank()) {
            errors.add("cardField014 must not be blank if provided");
        }
        if (dto.getCardField015() != null && dto.getCardField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField015 must not be negative");
        }
        if (dto.getCardField017() != null && dto.getCardField017().isBlank()) {
            errors.add("cardField017 must not be blank if provided");
        }
        return errors;
    }
}
