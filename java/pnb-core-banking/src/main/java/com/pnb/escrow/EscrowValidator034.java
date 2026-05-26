package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator034 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator034 {

    public List<String> validate(EscrowDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField004() != null && dto.getEscrField004().isBlank()) {
            errors.add("escrField004 must not be blank if provided");
        }
        if (dto.getEscrField009() != null && dto.getEscrField009() < 0) {
            errors.add("escrField009 must not be negative");
        }
        if (dto.getEscrField015() != null && dto.getEscrField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField015 must not be negative");
        }
        if (dto.getEscrField017() != null && dto.getEscrField017().isBlank()) {
            errors.add("escrField017 must not be blank if provided");
        }
        return errors;
    }
}
