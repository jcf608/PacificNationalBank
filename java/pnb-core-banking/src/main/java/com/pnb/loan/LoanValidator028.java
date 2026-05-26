package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator028 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator028 {

    public List<String> validate(LoanDto028 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField003() != null && dto.getLoanField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField003 must not be negative");
        }
        if (dto.getLoanField007() != null && dto.getLoanField007().isBlank()) {
            errors.add("loanField007 must not be blank if provided");
        }
        if (dto.getLoanField008() != null && dto.getLoanField008() < 0) {
            errors.add("loanField008 must not be negative");
        }
        return errors;
    }
}
