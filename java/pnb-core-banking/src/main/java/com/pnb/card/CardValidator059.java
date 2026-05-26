package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator059 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator059 {

    public List<String> validate(CardDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField000() != null && dto.getCardField000().isBlank()) {
            errors.add("cardField000 must not be blank if provided");
        }
        if (dto.getCardField002() != null && dto.getCardField002() < 0) {
            errors.add("cardField002 must not be negative");
        }
        if (dto.getCardField005() != null && dto.getCardField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField005 must not be negative");
        }
        if (dto.getCardField007() != null && dto.getCardField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField007 must not be negative");
        }
        if (dto.getCardField012() != null && dto.getCardField012().isBlank()) {
            errors.add("cardField012 must not be blank if provided");
        }
        if (dto.getCardField016() != null && dto.getCardField016() < 0) {
            errors.add("cardField016 must not be negative");
        }
        if (dto.getCardField017() != null && dto.getCardField017().isBlank()) {
            errors.add("cardField017 must not be blank if provided");
        }
        if (dto.getCardField018() != null && dto.getCardField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField018 must not be negative");
        }
        return errors;
    }
}
