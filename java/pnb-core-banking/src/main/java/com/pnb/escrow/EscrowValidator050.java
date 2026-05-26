package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator050 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator050 {

    public List<String> validate(EscrowDto050 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField000() != null && dto.getEscrField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField000 must not be negative");
        }
        if (dto.getEscrField001() != null && dto.getEscrField001() < 0) {
            errors.add("escrField001 must not be negative");
        }
        if (dto.getEscrField005() != null && dto.getEscrField005().isBlank()) {
            errors.add("escrField005 must not be blank if provided");
        }
        if (dto.getEscrField006() != null && dto.getEscrField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField006 must not be negative");
        }
        if (dto.getEscrField007() != null && dto.getEscrField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField007 must not be negative");
        }
        if (dto.getEscrField008() != null && dto.getEscrField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField008 must not be negative");
        }
        if (dto.getEscrField009() != null && dto.getEscrField009() < 0) {
            errors.add("escrField009 must not be negative");
        }
        return errors;
    }
}
