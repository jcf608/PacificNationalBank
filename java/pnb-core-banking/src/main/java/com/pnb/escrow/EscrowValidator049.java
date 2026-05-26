package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator049 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator049 {

    public List<String> validate(EscrowDto049 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField003() != null && dto.getEscrField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField003 must not be negative");
        }
        if (dto.getEscrField007() != null && dto.getEscrField007() < 0) {
            errors.add("escrField007 must not be negative");
        }
        return errors;
    }
}
