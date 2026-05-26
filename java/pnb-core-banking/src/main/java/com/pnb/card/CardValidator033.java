package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator033 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator033 {

    public List<String> validate(CardDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField000() != null && dto.getCardField000() < 0) {
            errors.add("cardField000 must not be negative");
        }
        if (dto.getCardField001() != null && dto.getCardField001().isBlank()) {
            errors.add("cardField001 must not be blank if provided");
        }
        if (dto.getCardField006() != null && dto.getCardField006() < 0) {
            errors.add("cardField006 must not be negative");
        }
        if (dto.getCardField007() != null && dto.getCardField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField007 must not be negative");
        }
        if (dto.getCardField011() != null && dto.getCardField011().isBlank()) {
            errors.add("cardField011 must not be blank if provided");
        }
        if (dto.getCardField012() != null && dto.getCardField012().isBlank()) {
            errors.add("cardField012 must not be blank if provided");
        }
        if (dto.getCardField013() != null && dto.getCardField013() < 0) {
            errors.add("cardField013 must not be negative");
        }
        if (dto.getCardField016() != null && dto.getCardField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField016 must not be negative");
        }
        return errors;
    }
}
