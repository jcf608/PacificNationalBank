package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator030 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator030 {

    public List<String> validate(EscrowDto030 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField000() != null && dto.getEscrField000().isBlank()) {
            errors.add("escrField000 must not be blank if provided");
        }
        if (dto.getEscrField007() != null && dto.getEscrField007() < 0) {
            errors.add("escrField007 must not be negative");
        }
        if (dto.getEscrField008() != null && dto.getEscrField008() < 0) {
            errors.add("escrField008 must not be negative");
        }
        if (dto.getEscrField012() != null && dto.getEscrField012() < 0) {
            errors.add("escrField012 must not be negative");
        }
        return errors;
    }
}
