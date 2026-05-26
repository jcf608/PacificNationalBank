package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator046 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator046 {

    public List<String> validate(EscrowDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField001() != null && dto.getEscrField001() < 0) {
            errors.add("escrField001 must not be negative");
        }
        if (dto.getEscrField004() != null && dto.getEscrField004().isBlank()) {
            errors.add("escrField004 must not be blank if provided");
        }
        if (dto.getEscrField005() != null && dto.getEscrField005() < 0) {
            errors.add("escrField005 must not be negative");
        }
        if (dto.getEscrField006() != null && dto.getEscrField006() < 0) {
            errors.add("escrField006 must not be negative");
        }
        if (dto.getEscrField007() != null && dto.getEscrField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField007 must not be negative");
        }
        if (dto.getEscrField011() != null && dto.getEscrField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField011 must not be negative");
        }
        if (dto.getEscrField012() != null && dto.getEscrField012().isBlank()) {
            errors.add("escrField012 must not be blank if provided");
        }
        if (dto.getEscrField014() != null && dto.getEscrField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField014 must not be negative");
        }
        if (dto.getEscrField016() != null && dto.getEscrField016().isBlank()) {
            errors.add("escrField016 must not be blank if provided");
        }
        if (dto.getEscrField017() != null && dto.getEscrField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField017 must not be negative");
        }
        return errors;
    }
}
