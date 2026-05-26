package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator034 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator034 {

    public List<String> validate(CardDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField001() != null && dto.getCardField001().isBlank()) {
            errors.add("cardField001 must not be blank if provided");
        }
        if (dto.getCardField003() != null && dto.getCardField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField003 must not be negative");
        }
        if (dto.getCardField004() != null && dto.getCardField004().isBlank()) {
            errors.add("cardField004 must not be blank if provided");
        }
        if (dto.getCardField007() != null && dto.getCardField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField007 must not be negative");
        }
        if (dto.getCardField008() != null && dto.getCardField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField008 must not be negative");
        }
        if (dto.getCardField009() != null && dto.getCardField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField009 must not be negative");
        }
        if (dto.getCardField010() != null && dto.getCardField010() < 0) {
            errors.add("cardField010 must not be negative");
        }
        if (dto.getCardField012() != null && dto.getCardField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField012 must not be negative");
        }
        if (dto.getCardField016() != null && dto.getCardField016() < 0) {
            errors.add("cardField016 must not be negative");
        }
        if (dto.getCardField017() != null && dto.getCardField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField017 must not be negative");
        }
        return errors;
    }
}
