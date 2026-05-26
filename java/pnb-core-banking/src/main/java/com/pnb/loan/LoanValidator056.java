package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator056 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator056 {

    public List<String> validate(LoanDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField006() != null && dto.getLoanField006() < 0) {
            errors.add("loanField006 must not be negative");
        }
        if (dto.getLoanField007() != null && dto.getLoanField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField007 must not be negative");
        }
        if (dto.getLoanField008() != null && dto.getLoanField008().isBlank()) {
            errors.add("loanField008 must not be blank if provided");
        }
        if (dto.getLoanField009() != null && dto.getLoanField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField009 must not be negative");
        }
        if (dto.getLoanField014() != null && dto.getLoanField014() < 0) {
            errors.add("loanField014 must not be negative");
        }
        return errors;
    }
}
