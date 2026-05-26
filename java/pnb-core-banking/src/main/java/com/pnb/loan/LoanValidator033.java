package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator033 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator033 {

    public List<String> validate(LoanDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField001() != null && dto.getLoanField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField001 must not be negative");
        }
        if (dto.getLoanField003() != null && dto.getLoanField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField003 must not be negative");
        }
        if (dto.getLoanField006() != null && dto.getLoanField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField006 must not be negative");
        }
        if (dto.getLoanField009() != null && dto.getLoanField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField009 must not be negative");
        }
        if (dto.getLoanField011() != null && dto.getLoanField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField011 must not be negative");
        }
        if (dto.getLoanField012() != null && dto.getLoanField012() < 0) {
            errors.add("loanField012 must not be negative");
        }
        if (dto.getLoanField015() != null && dto.getLoanField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField015 must not be negative");
        }
        if (dto.getLoanField016() != null && dto.getLoanField016().isBlank()) {
            errors.add("loanField016 must not be blank if provided");
        }
        return errors;
    }
}
