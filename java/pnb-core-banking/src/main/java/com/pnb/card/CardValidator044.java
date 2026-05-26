package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator044 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator044 {

    public List<String> validate(CardDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField000() != null && dto.getCardField000().isBlank()) {
            errors.add("cardField000 must not be blank if provided");
        }
        if (dto.getCardField004() != null && dto.getCardField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField004 must not be negative");
        }
        if (dto.getCardField007() != null && dto.getCardField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField007 must not be negative");
        }
        if (dto.getCardField009() != null && dto.getCardField009().isBlank()) {
            errors.add("cardField009 must not be blank if provided");
        }
        if (dto.getCardField010() != null && dto.getCardField010().isBlank()) {
            errors.add("cardField010 must not be blank if provided");
        }
        if (dto.getCardField011() != null && dto.getCardField011() < 0) {
            errors.add("cardField011 must not be negative");
        }
        if (dto.getCardField013() != null && dto.getCardField013().isBlank()) {
            errors.add("cardField013 must not be blank if provided");
        }
        if (dto.getCardField015() != null && dto.getCardField015().isBlank()) {
            errors.add("cardField015 must not be blank if provided");
        }
        return errors;
    }
}
