package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator044 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator044 {

    public List<String> validate(EscrowDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField005() != null && dto.getEscrField005().isBlank()) {
            errors.add("escrField005 must not be blank if provided");
        }
        if (dto.getEscrField007() != null && dto.getEscrField007().isBlank()) {
            errors.add("escrField007 must not be blank if provided");
        }
        if (dto.getEscrField011() != null && dto.getEscrField011().isBlank()) {
            errors.add("escrField011 must not be blank if provided");
        }
        if (dto.getEscrField013() != null && dto.getEscrField013() < 0) {
            errors.add("escrField013 must not be negative");
        }
        if (dto.getEscrField014() != null && dto.getEscrField014().isBlank()) {
            errors.add("escrField014 must not be blank if provided");
        }
        if (dto.getEscrField015() != null && dto.getEscrField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField015 must not be negative");
        }
        return errors;
    }
}
