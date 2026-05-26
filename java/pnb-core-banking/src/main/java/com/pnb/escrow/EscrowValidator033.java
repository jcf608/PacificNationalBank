package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator033 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator033 {

    public List<String> validate(EscrowDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField000() != null && dto.getEscrField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField000 must not be negative");
        }
        if (dto.getEscrField001() != null && dto.getEscrField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField001 must not be negative");
        }
        if (dto.getEscrField002() != null && dto.getEscrField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField002 must not be negative");
        }
        if (dto.getEscrField003() != null && dto.getEscrField003() < 0) {
            errors.add("escrField003 must not be negative");
        }
        if (dto.getEscrField007() != null && dto.getEscrField007() < 0) {
            errors.add("escrField007 must not be negative");
        }
        if (dto.getEscrField008() != null && dto.getEscrField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("escrField008 must not be negative");
        }
        if (dto.getEscrField009() != null && dto.getEscrField009().isBlank()) {
            errors.add("escrField009 must not be blank if provided");
        }
        if (dto.getEscrField010() != null && dto.getEscrField010() < 0) {
            errors.add("escrField010 must not be negative");
        }
        if (dto.getEscrField012() != null && dto.getEscrField012().isBlank()) {
            errors.add("escrField012 must not be blank if provided");
        }
        if (dto.getEscrField013() != null && dto.getEscrField013().isBlank()) {
            errors.add("escrField013 must not be blank if provided");
        }
        if (dto.getEscrField014() != null && dto.getEscrField014() < 0) {
            errors.add("escrField014 must not be negative");
        }
        if (dto.getEscrField015() != null && dto.getEscrField015() < 0) {
            errors.add("escrField015 must not be negative");
        }
        if (dto.getEscrField016() != null && dto.getEscrField016().isBlank()) {
            errors.add("escrField016 must not be blank if provided");
        }
        return errors;
    }
}
