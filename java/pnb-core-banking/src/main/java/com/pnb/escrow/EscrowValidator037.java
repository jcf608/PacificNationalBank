package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator037 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator037 {

    public List<String> validate(EscrowDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField001() != null && dto.getEscrField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField001 must not be negative");
        }
        if (dto.getEscrField003() != null && dto.getEscrField003() < 0) {
            errors.add("escrField003 must not be negative");
        }
        if (dto.getEscrField005() != null && dto.getEscrField005() < 0) {
            errors.add("escrField005 must not be negative");
        }
        if (dto.getEscrField006() != null && dto.getEscrField006().isBlank()) {
            errors.add("escrField006 must not be blank if provided");
        }
        return errors;
    }
}
