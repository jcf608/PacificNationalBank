package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator056 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator056 {

    public List<String> validate(CardDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField000() != null && dto.getCardField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField000 must not be negative");
        }
        if (dto.getCardField001() != null && dto.getCardField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField001 must not be negative");
        }
        if (dto.getCardField003() != null && dto.getCardField003().isBlank()) {
            errors.add("cardField003 must not be blank if provided");
        }
        if (dto.getCardField004() != null && dto.getCardField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField004 must not be negative");
        }
        if (dto.getCardField007() != null && dto.getCardField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField007 must not be negative");
        }
        if (dto.getCardField008() != null && dto.getCardField008().isBlank()) {
            errors.add("cardField008 must not be blank if provided");
        }
        if (dto.getCardField009() != null && dto.getCardField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField009 must not be negative");
        }
        if (dto.getCardField010() != null && dto.getCardField010().isBlank()) {
            errors.add("cardField010 must not be blank if provided");
        }
        if (dto.getCardField013() != null && dto.getCardField013().isBlank()) {
            errors.add("cardField013 must not be blank if provided");
        }
        if (dto.getCardField014() != null && dto.getCardField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField014 must not be negative");
        }
        if (dto.getCardField015() != null && dto.getCardField015().isBlank()) {
            errors.add("cardField015 must not be blank if provided");
        }
        return errors;
    }
}
