package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator053 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator053 {

    public List<String> validate(EscrowDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField001() != null && dto.getEscrField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField001 must not be negative");
        }
        if (dto.getEscrField002() != null && dto.getEscrField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField002 must not be negative");
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
        if (dto.getEscrField008() != null && dto.getEscrField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField008 must not be negative");
        }
        if (dto.getEscrField009() != null && dto.getEscrField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField009 must not be negative");
        }
        if (dto.getEscrField011() != null && dto.getEscrField011() < 0) {
            errors.add("escrField011 must not be negative");
        }
        return errors;
    }
}
