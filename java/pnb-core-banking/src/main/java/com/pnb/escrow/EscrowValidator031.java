package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator031 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator031 {

    public List<String> validate(EscrowDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField002() != null && dto.getEscrField002() < 0) {
            errors.add("escrField002 must not be negative");
        }
        if (dto.getEscrField003() != null && dto.getEscrField003().isBlank()) {
            errors.add("escrField003 must not be blank if provided");
        }
        if (dto.getEscrField006() != null && dto.getEscrField006() < 0) {
            errors.add("escrField006 must not be negative");
        }
        if (dto.getEscrField011() != null && dto.getEscrField011() < 0) {
            errors.add("escrField011 must not be negative");
        }
        if (dto.getEscrField012() != null && dto.getEscrField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField012 must not be negative");
        }
        return errors;
    }
}
