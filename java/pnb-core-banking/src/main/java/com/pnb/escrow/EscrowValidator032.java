package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator032 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator032 {

    public List<String> validate(EscrowDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField002() != null && dto.getEscrField002() < 0) {
            errors.add("escrField002 must not be negative");
        }
        if (dto.getEscrField004() != null && dto.getEscrField004().isBlank()) {
            errors.add("escrField004 must not be blank if provided");
        }
        if (dto.getEscrField005() != null && dto.getEscrField005() < 0) {
            errors.add("escrField005 must not be negative");
        }
        if (dto.getEscrField009() != null && dto.getEscrField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField009 must not be negative");
        }
        if (dto.getEscrField013() != null && dto.getEscrField013() < 0) {
            errors.add("escrField013 must not be negative");
        }
        if (dto.getEscrField015() != null && dto.getEscrField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField015 must not be negative");
        }
        return errors;
    }
}
