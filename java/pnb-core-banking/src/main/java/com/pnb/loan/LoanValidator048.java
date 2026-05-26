package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator048 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator048 {

    public List<String> validate(LoanDto048 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField003() != null && dto.getLoanField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField003 must not be negative");
        }
        if (dto.getLoanField006() != null && dto.getLoanField006().isBlank()) {
            errors.add("loanField006 must not be blank if provided");
        }
        return errors;
    }
}
