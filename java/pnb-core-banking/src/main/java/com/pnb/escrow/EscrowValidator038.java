package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator038 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator038 {

    public List<String> validate(EscrowDto038 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField000() != null && dto.getEscrField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField000 must not be negative");
        }
        if (dto.getEscrField004() != null && dto.getEscrField004() < 0) {
            errors.add("escrField004 must not be negative");
        }
        if (dto.getEscrField006() != null && dto.getEscrField006() < 0) {
            errors.add("escrField006 must not be negative");
        }
        if (dto.getEscrField007() != null && dto.getEscrField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField007 must not be negative");
        }
        if (dto.getEscrField009() != null && dto.getEscrField009().isBlank()) {
            errors.add("escrField009 must not be blank if provided");
        }
        return errors;
    }
}
