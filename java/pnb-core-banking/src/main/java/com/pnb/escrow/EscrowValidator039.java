package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator039 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator039 {

    public List<String> validate(EscrowDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField005() != null && dto.getEscrField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField005 must not be negative");
        }
        if (dto.getEscrField008() != null && dto.getEscrField008() < 0) {
            errors.add("escrField008 must not be negative");
        }
        if (dto.getEscrField010() != null && dto.getEscrField010().isBlank()) {
            errors.add("escrField010 must not be blank if provided");
        }
        return errors;
    }
}
