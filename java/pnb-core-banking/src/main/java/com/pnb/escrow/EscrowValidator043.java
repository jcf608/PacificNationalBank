package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator043 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator043 {

    public List<String> validate(EscrowDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField001() != null && dto.getEscrField001().isBlank()) {
            errors.add("escrField001 must not be blank if provided");
        }
        if (dto.getEscrField004() != null && dto.getEscrField004() < 0) {
            errors.add("escrField004 must not be negative");
        }
        if (dto.getEscrField005() != null && dto.getEscrField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField005 must not be negative");
        }
        if (dto.getEscrField006() != null && dto.getEscrField006() < 0) {
            errors.add("escrField006 must not be negative");
        }
        if (dto.getEscrField012() != null && dto.getEscrField012().isBlank()) {
            errors.add("escrField012 must not be blank if provided");
        }
        if (dto.getEscrField013() != null && dto.getEscrField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField013 must not be negative");
        }
        if (dto.getEscrField014() != null && dto.getEscrField014() < 0) {
            errors.add("escrField014 must not be negative");
        }
        return errors;
    }
}
