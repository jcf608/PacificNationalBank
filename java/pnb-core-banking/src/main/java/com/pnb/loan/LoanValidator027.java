package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator027 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator027 {

    public List<String> validate(LoanDto027 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField001() != null && dto.getLoanField001() < 0) {
            errors.add("loanField001 must not be negative");
        }
        if (dto.getLoanField002() != null && dto.getLoanField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField002 must not be negative");
        }
        if (dto.getLoanField004() != null && dto.getLoanField004().isBlank()) {
            errors.add("loanField004 must not be blank if provided");
        }
        if (dto.getLoanField010() != null && dto.getLoanField010() < 0) {
            errors.add("loanField010 must not be negative");
        }
        return errors;
    }
}
