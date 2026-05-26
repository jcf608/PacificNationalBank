package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator041 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator041 {

    public List<String> validate(EscrowDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField001() != null && dto.getEscrField001().isBlank()) {
            errors.add("escrField001 must not be blank if provided");
        }
        if (dto.getEscrField002() != null && dto.getEscrField002().isBlank()) {
            errors.add("escrField002 must not be blank if provided");
        }
        if (dto.getEscrField003() != null && dto.getEscrField003().isBlank()) {
            errors.add("escrField003 must not be blank if provided");
        }
        if (dto.getEscrField004() != null && dto.getEscrField004().isBlank()) {
            errors.add("escrField004 must not be blank if provided");
        }
        if (dto.getEscrField005() != null && dto.getEscrField005().isBlank()) {
            errors.add("escrField005 must not be blank if provided");
        }
        if (dto.getEscrField006() != null && dto.getEscrField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField006 must not be negative");
        }
        if (dto.getEscrField009() != null && dto.getEscrField009() < 0) {
            errors.add("escrField009 must not be negative");
        }
        if (dto.getEscrField010() != null && dto.getEscrField010() < 0) {
            errors.add("escrField010 must not be negative");
        }
        return errors;
    }
}
