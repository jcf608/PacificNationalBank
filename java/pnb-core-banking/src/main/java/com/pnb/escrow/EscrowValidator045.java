package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator045 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator045 {

    public List<String> validate(EscrowDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField003() != null && dto.getEscrField003() < 0) {
            errors.add("escrField003 must not be negative");
        }
        if (dto.getEscrField005() != null && dto.getEscrField005() < 0) {
            errors.add("escrField005 must not be negative");
        }
        if (dto.getEscrField008() != null && dto.getEscrField008().isBlank()) {
            errors.add("escrField008 must not be blank if provided");
        }
        if (dto.getEscrField014() != null && dto.getEscrField014() < 0) {
            errors.add("escrField014 must not be negative");
        }
        if (dto.getEscrField016() != null && dto.getEscrField016().isBlank()) {
            errors.add("escrField016 must not be blank if provided");
        }
        return errors;
    }
}
