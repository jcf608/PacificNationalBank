package com.pnb.card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CardValidator035 — Business rule validation.
 */
@ApplicationScoped
public class CardValidator035 {

    public List<String> validate(CardDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("card DTO must not be null");
            return errors;
        }
        if (dto.getCardField000() != null && dto.getCardField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField000 must not be negative");
        }
        if (dto.getCardField002() != null && dto.getCardField002().isBlank()) {
            errors.add("cardField002 must not be blank if provided");
        }
        if (dto.getCardField003() != null && dto.getCardField003() < 0) {
            errors.add("cardField003 must not be negative");
        }
        if (dto.getCardField006() != null && dto.getCardField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField006 must not be negative");
        }
        if (dto.getCardField007() != null && dto.getCardField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField007 must not be negative");
        }
        if (dto.getCardField009() != null && dto.getCardField009() < 0) {
            errors.add("cardField009 must not be negative");
        }
        if (dto.getCardField010() != null && dto.getCardField010().isBlank()) {
            errors.add("cardField010 must not be blank if provided");
        }
        if (dto.getCardField011() != null && dto.getCardField011() < 0) {
            errors.add("cardField011 must not be negative");
        }
        if (dto.getCardField015() != null && dto.getCardField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("cardField015 must not be negative");
        }
        if (dto.getCardField016() != null && dto.getCardField016() < 0) {
            errors.add("cardField016 must not be negative");
        }
        if (dto.getCardField017() != null && dto.getCardField017().isBlank()) {
            errors.add("cardField017 must not be blank if provided");
        }
        return errors;
    }
}
