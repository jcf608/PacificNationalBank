package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator032 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator032 {

    public List<String> validate(LoanDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField001() != null && dto.getLoanField001().isBlank()) {
            errors.add("loanField001 must not be blank if provided");
        }
        if (dto.getLoanField006() != null && dto.getLoanField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField006 must not be negative");
        }
        if (dto.getLoanField011() != null && dto.getLoanField011() < 0) {
            errors.add("loanField011 must not be negative");
        }
        if (dto.getLoanField013() != null && dto.getLoanField013().isBlank()) {
            errors.add("loanField013 must not be blank if provided");
        }
        if (dto.getLoanField015() != null && dto.getLoanField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField015 must not be negative");
        }
        return errors;
    }
}
