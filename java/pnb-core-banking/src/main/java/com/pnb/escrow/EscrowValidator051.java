package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator051 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator051 {

    public List<String> validate(EscrowDto051 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField004() != null && dto.getEscrField004() < 0) {
            errors.add("escrField004 must not be negative");
        }
        if (dto.getEscrField006() != null && dto.getEscrField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField006 must not be negative");
        }
        if (dto.getEscrField008() != null && dto.getEscrField008() < 0) {
            errors.add("escrField008 must not be negative");
        }
        if (dto.getEscrField009() != null && dto.getEscrField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField009 must not be negative");
        }
        return errors;
    }
}
