package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator025 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator025 {

    public List<String> validate(EscrowDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField001() != null && dto.getEscrField001().isBlank()) {
            errors.add("escrField001 must not be blank if provided");
        }
        if (dto.getEscrField006() != null && dto.getEscrField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField006 must not be negative");
        }
        if (dto.getEscrField007() != null && dto.getEscrField007() < 0) {
            errors.add("escrField007 must not be negative");
        }
        return errors;
    }
}
