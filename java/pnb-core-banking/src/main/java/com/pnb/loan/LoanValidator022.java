package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator022 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator022 {

    public List<String> validate(LoanDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField000() != null && dto.getLoanField000() < 0) {
            errors.add("loanField000 must not be negative");
        }
        if (dto.getLoanField009() != null && dto.getLoanField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField009 must not be negative");
        }
        if (dto.getLoanField010() != null && dto.getLoanField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField010 must not be negative");
        }
        if (dto.getLoanField011() != null && dto.getLoanField011().isBlank()) {
            errors.add("loanField011 must not be blank if provided");
        }
        if (dto.getLoanField012() != null && dto.getLoanField012().isBlank()) {
            errors.add("loanField012 must not be blank if provided");
        }
        if (dto.getLoanField016() != null && dto.getLoanField016() < 0) {
            errors.add("loanField016 must not be negative");
        }
        if (dto.getLoanField017() != null && dto.getLoanField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField017 must not be negative");
        }
        return errors;
    }
}
