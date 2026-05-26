package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator052 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator052 {

    public List<String> validate(EscrowDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField007() != null && dto.getEscrField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField007 must not be negative");
        }
        if (dto.getEscrField008() != null && dto.getEscrField008() < 0) {
            errors.add("escrField008 must not be negative");
        }
        if (dto.getEscrField011() != null && dto.getEscrField011() < 0) {
            errors.add("escrField011 must not be negative");
        }
        return errors;
    }
}
