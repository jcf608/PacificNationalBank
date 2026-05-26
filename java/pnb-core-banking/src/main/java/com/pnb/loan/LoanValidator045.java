package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator045 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator045 {

    public List<String> validate(LoanDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField000() != null && dto.getLoanField000() < 0) {
            errors.add("loanField000 must not be negative");
        }
        if (dto.getLoanField001() != null && dto.getLoanField001() < 0) {
            errors.add("loanField001 must not be negative");
        }
        if (dto.getLoanField008() != null && dto.getLoanField008() < 0) {
            errors.add("loanField008 must not be negative");
        }
        if (dto.getLoanField010() != null && dto.getLoanField010() < 0) {
            errors.add("loanField010 must not be negative");
        }
        if (dto.getLoanField011() != null && dto.getLoanField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField011 must not be negative");
        }
        if (dto.getLoanField013() != null && dto.getLoanField013() < 0) {
            errors.add("loanField013 must not be negative");
        }
        if (dto.getLoanField014() != null && dto.getLoanField014() < 0) {
            errors.add("loanField014 must not be negative");
        }
        if (dto.getLoanField016() != null && dto.getLoanField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField016 must not be negative");
        }
        return errors;
    }
}
