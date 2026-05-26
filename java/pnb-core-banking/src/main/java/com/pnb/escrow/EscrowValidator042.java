package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator042 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator042 {

    public List<String> validate(EscrowDto042 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField003() != null && dto.getEscrField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField003 must not be negative");
        }
        if (dto.getEscrField005() != null && dto.getEscrField005().isBlank()) {
            errors.add("escrField005 must not be blank if provided");
        }
        if (dto.getEscrField007() != null && dto.getEscrField007() < 0) {
            errors.add("escrField007 must not be negative");
        }
        if (dto.getEscrField008() != null && dto.getEscrField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField008 must not be negative");
        }
        if (dto.getEscrField010() != null && dto.getEscrField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField010 must not be negative");
        }
        if (dto.getEscrField013() != null && dto.getEscrField013() < 0) {
            errors.add("escrField013 must not be negative");
        }
        return errors;
    }
}
