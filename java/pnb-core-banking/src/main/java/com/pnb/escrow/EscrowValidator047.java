package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator047 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator047 {

    public List<String> validate(EscrowDto047 dto) {
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
        if (dto.getEscrField003() != null && dto.getEscrField003().isBlank()) {
            errors.add("escrField003 must not be blank if provided");
        }
        if (dto.getEscrField009() != null && dto.getEscrField009().isBlank()) {
            errors.add("escrField009 must not be blank if provided");
        }
        if (dto.getEscrField011() != null && dto.getEscrField011().isBlank()) {
            errors.add("escrField011 must not be blank if provided");
        }
        if (dto.getEscrField012() != null && dto.getEscrField012().isBlank()) {
            errors.add("escrField012 must not be blank if provided");
        }
        if (dto.getEscrField014() != null && dto.getEscrField014() < 0) {
            errors.add("escrField014 must not be negative");
        }
        if (dto.getEscrField017() != null && dto.getEscrField017() < 0) {
            errors.add("escrField017 must not be negative");
        }
        return errors;
    }
}
