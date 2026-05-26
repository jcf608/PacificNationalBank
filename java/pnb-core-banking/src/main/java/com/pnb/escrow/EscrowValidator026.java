package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator026 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator026 {

    public List<String> validate(EscrowDto026 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField003() != null && dto.getEscrField003().isBlank()) {
            errors.add("escrField003 must not be blank if provided");
        }
        if (dto.getEscrField004() != null && dto.getEscrField004().isBlank()) {
            errors.add("escrField004 must not be blank if provided");
        }
        if (dto.getEscrField005() != null && dto.getEscrField005() < 0) {
            errors.add("escrField005 must not be negative");
        }
        if (dto.getEscrField008() != null && dto.getEscrField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField008 must not be negative");
        }
        return errors;
    }
}
