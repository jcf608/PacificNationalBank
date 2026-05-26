package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator021 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator021 {

    public List<String> validate(LoanDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField000() != null && dto.getLoanField000().isBlank()) {
            errors.add("loanField000 must not be blank if provided");
        }
        if (dto.getLoanField001() != null && dto.getLoanField001() < 0) {
            errors.add("loanField001 must not be negative");
        }
        if (dto.getLoanField003() != null && dto.getLoanField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField003 must not be negative");
        }
        if (dto.getLoanField004() != null && dto.getLoanField004() < 0) {
            errors.add("loanField004 must not be negative");
        }
        if (dto.getLoanField006() != null && dto.getLoanField006() < 0) {
            errors.add("loanField006 must not be negative");
        }
        if (dto.getLoanField009() != null && dto.getLoanField009().isBlank()) {
            errors.add("loanField009 must not be blank if provided");
        }
        if (dto.getLoanField013() != null && dto.getLoanField013() < 0) {
            errors.add("loanField013 must not be negative");
        }
        if (dto.getLoanField014() != null && dto.getLoanField014().isBlank()) {
            errors.add("loanField014 must not be blank if provided");
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
