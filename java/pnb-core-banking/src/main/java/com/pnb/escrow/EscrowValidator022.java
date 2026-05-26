package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator022 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator022 {

    public List<String> validate(EscrowDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField000() != null && dto.getEscrField000() < 0) {
            errors.add("escrField000 must not be negative");
        }
        if (dto.getEscrField003() != null && dto.getEscrField003().isBlank()) {
            errors.add("escrField003 must not be blank if provided");
        }
        if (dto.getEscrField006() != null && dto.getEscrField006().isBlank()) {
            errors.add("escrField006 must not be blank if provided");
        }
        if (dto.getEscrField011() != null && dto.getEscrField011() < 0) {
            errors.add("escrField011 must not be negative");
        }
        if (dto.getEscrField016() != null && dto.getEscrField016() < 0) {
            errors.add("escrField016 must not be negative");
        }
        if (dto.getEscrField017() != null && dto.getEscrField017() < 0) {
            errors.add("escrField017 must not be negative");
        }
        return errors;
    }
}
