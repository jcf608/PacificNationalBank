package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator035 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator035 {

    public List<String> validate(EscrowDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField000() != null && dto.getEscrField000().isBlank()) {
            errors.add("escrField000 must not be blank if provided");
        }
        if (dto.getEscrField001() != null && dto.getEscrField001().isBlank()) {
            errors.add("escrField001 must not be blank if provided");
        }
        if (dto.getEscrField006() != null && dto.getEscrField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField006 must not be negative");
        }
        if (dto.getEscrField013() != null && dto.getEscrField013().isBlank()) {
            errors.add("escrField013 must not be blank if provided");
        }
        if (dto.getEscrField015() != null && dto.getEscrField015() < 0) {
            errors.add("escrField015 must not be negative");
        }
        if (dto.getEscrField017() != null && dto.getEscrField017() < 0) {
            errors.add("escrField017 must not be negative");
        }
        if (dto.getEscrField018() != null && dto.getEscrField018().isBlank()) {
            errors.add("escrField018 must not be blank if provided");
        }
        return errors;
    }
}
