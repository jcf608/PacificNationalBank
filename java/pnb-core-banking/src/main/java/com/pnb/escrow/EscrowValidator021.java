package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator021 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator021 {

    public List<String> validate(EscrowDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField002() != null && dto.getEscrField002().isBlank()) {
            errors.add("escrField002 must not be blank if provided");
        }
        if (dto.getEscrField004() != null && dto.getEscrField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField004 must not be negative");
        }
        if (dto.getEscrField007() != null && dto.getEscrField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField007 must not be negative");
        }
        if (dto.getEscrField010() != null && dto.getEscrField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField010 must not be negative");
        }
        if (dto.getEscrField011() != null && dto.getEscrField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField011 must not be negative");
        }
        if (dto.getEscrField016() != null && dto.getEscrField016() < 0) {
            errors.add("escrField016 must not be negative");
        }
        return errors;
    }
}
