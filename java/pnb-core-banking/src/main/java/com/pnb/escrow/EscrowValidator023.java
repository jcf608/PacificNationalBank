package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator023 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator023 {

    public List<String> validate(EscrowDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField000() != null && dto.getEscrField000() < 0) {
            errors.add("escrField000 must not be negative");
        }
        if (dto.getEscrField001() != null && dto.getEscrField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField001 must not be negative");
        }
        if (dto.getEscrField002() != null && dto.getEscrField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField002 must not be negative");
        }
        if (dto.getEscrField003() != null && dto.getEscrField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField003 must not be negative");
        }
        if (dto.getEscrField004() != null && dto.getEscrField004().isBlank()) {
            errors.add("escrField004 must not be blank if provided");
        }
        if (dto.getEscrField005() != null && dto.getEscrField005().isBlank()) {
            errors.add("escrField005 must not be blank if provided");
        }
        if (dto.getEscrField006() != null && dto.getEscrField006() < 0) {
            errors.add("escrField006 must not be negative");
        }
        if (dto.getEscrField007() != null && dto.getEscrField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField007 must not be negative");
        }
        if (dto.getEscrField010() != null && dto.getEscrField010() < 0) {
            errors.add("escrField010 must not be negative");
        }
        if (dto.getEscrField016() != null && dto.getEscrField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField016 must not be negative");
        }
        return errors;
    }
}
