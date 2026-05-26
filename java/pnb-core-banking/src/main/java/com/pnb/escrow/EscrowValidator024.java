package com.pnb.escrow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowValidator024 — Business rule validation.
 */
@ApplicationScoped
public class EscrowValidator024 {

    public List<String> validate(EscrowDto024 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("escrow DTO must not be null");
            return errors;
        }
        if (dto.getEscrField005() != null && dto.getEscrField005().isBlank()) {
            errors.add("escrField005 must not be blank if provided");
        }
        return errors;
    }
}
