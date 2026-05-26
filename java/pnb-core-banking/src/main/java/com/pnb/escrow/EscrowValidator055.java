package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator055 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator055 {

    public List<String> validate(EscrowDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField000() != null && dto.getEscrField000().isBlank()) {
            errors.add("escrField000 must not be blank if provided");
        }
        if (dto.getEscrField001() != null && dto.getEscrField001() < 0) {
            errors.add("escrField001 must not be negative");
        }
        if (dto.getEscrField002() != null && dto.getEscrField002().isBlank()) {
            errors.add("escrField002 must not be blank if provided");
        }
        if (dto.getEscrField004() != null && dto.getEscrField004().isBlank()) {
            errors.add("escrField004 must not be blank if provided");
        }
        if (dto.getEscrField005() != null && dto.getEscrField005().isBlank()) {
            errors.add("escrField005 must not be blank if provided");
        }
        if (dto.getEscrField006() != null && dto.getEscrField006().isBlank()) {
            errors.add("escrField006 must not be blank if provided");
        }
        if (dto.getEscrField012() != null && dto.getEscrField012().isBlank()) {
            errors.add("escrField012 must not be blank if provided");
        }
        return errors;
    }
}
