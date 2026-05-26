package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator029 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator029 {

    public List<String> validate(LoanDto029 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField002() != null && dto.getLoanField002().isBlank()) {
            errors.add("loanField002 must not be blank if provided");
        }
        if (dto.getLoanField004() != null && dto.getLoanField004() < 0) {
            errors.add("loanField004 must not be negative");
        }
        if (dto.getLoanField005() != null && dto.getLoanField005().isBlank()) {
            errors.add("loanField005 must not be blank if provided");
        }
        if (dto.getLoanField007() != null && dto.getLoanField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField007 must not be negative");
        }
        if (dto.getLoanField008() != null && dto.getLoanField008() < 0) {
            errors.add("loanField008 must not be negative");
        }
        if (dto.getLoanField012() != null && dto.getLoanField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField012 must not be negative");
        }
        return errors;
    }
}
