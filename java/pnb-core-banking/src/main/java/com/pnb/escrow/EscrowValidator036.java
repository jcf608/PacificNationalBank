package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator036 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator036 {

    public List<String> validate(EscrowDto036 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField000() != null && dto.getEscrField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField000 must not be negative");
        }
        if (dto.getEscrField003() != null && dto.getEscrField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField003 must not be negative");
        }
        if (dto.getEscrField004() != null && dto.getEscrField004().isBlank()) {
            errors.add("escrField004 must not be blank if provided");
        }
        if (dto.getEscrField005() != null && dto.getEscrField005().isBlank()) {
            errors.add("escrField005 must not be blank if provided");
        }
        return errors;
    }
}
