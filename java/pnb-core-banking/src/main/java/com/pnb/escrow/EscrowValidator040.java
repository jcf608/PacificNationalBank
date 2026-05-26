package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator040 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator040 {

    public List<String> validate(EscrowDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField000() != null && dto.getEscrField000() < 0) {
            errors.add("escrField000 must not be negative");
        }
        if (dto.getEscrField002() != null && dto.getEscrField002() < 0) {
            errors.add("escrField002 must not be negative");
        }
        if (dto.getEscrField004() != null && dto.getEscrField004() < 0) {
            errors.add("escrField004 must not be negative");
        }
        if (dto.getEscrField007() != null && dto.getEscrField007() < 0) {
            errors.add("escrField007 must not be negative");
        }
        if (dto.getEscrField008() != null && dto.getEscrField008() < 0) {
            errors.add("escrField008 must not be negative");
        }
        if (dto.getEscrField009() != null && dto.getEscrField009() < 0) {
            errors.add("escrField009 must not be negative");
        }
        if (dto.getEscrField011() != null && dto.getEscrField011().isBlank()) {
            errors.add("escrField011 must not be blank if provided");
        }
        return errors;
    }
}
