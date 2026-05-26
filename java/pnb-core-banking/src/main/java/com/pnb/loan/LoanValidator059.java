package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator059 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator059 {

    public List<String> validate(LoanDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField002() != null && dto.getLoanField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField002 must not be negative");
        }
        if (dto.getLoanField004() != null && dto.getLoanField004() < 0) {
            errors.add("loanField004 must not be negative");
        }
        if (dto.getLoanField007() != null && dto.getLoanField007() < 0) {
            errors.add("loanField007 must not be negative");
        }
        if (dto.getLoanField009() != null && dto.getLoanField009().isBlank()) {
            errors.add("loanField009 must not be blank if provided");
        }
        if (dto.getLoanField010() != null && dto.getLoanField010() < 0) {
            errors.add("loanField010 must not be negative");
        }
        return errors;
    }
}
