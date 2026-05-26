package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator035 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator035 {

    public List<String> validate(LoanDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField001() != null && dto.getLoanField001().isBlank()) {
            errors.add("loanField001 must not be blank if provided");
        }
        if (dto.getLoanField004() != null && dto.getLoanField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField004 must not be negative");
        }
        if (dto.getLoanField006() != null && dto.getLoanField006() < 0) {
            errors.add("loanField006 must not be negative");
        }
        if (dto.getLoanField009() != null && dto.getLoanField009().isBlank()) {
            errors.add("loanField009 must not be blank if provided");
        }
        if (dto.getLoanField010() != null && dto.getLoanField010() < 0) {
            errors.add("loanField010 must not be negative");
        }
        if (dto.getLoanField014() != null && dto.getLoanField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField014 must not be negative");
        }
        if (dto.getLoanField015() != null && dto.getLoanField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField015 must not be negative");
        }
        if (dto.getLoanField016() != null && dto.getLoanField016() < 0) {
            errors.add("loanField016 must not be negative");
        }
        if (dto.getLoanField017() != null && dto.getLoanField017().isBlank()) {
            errors.add("loanField017 must not be blank if provided");
        }
        if (dto.getLoanField018() != null && dto.getLoanField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField018 must not be negative");
        }
        return errors;
    }
}
