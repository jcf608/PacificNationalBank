package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator057 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator057 {

    public List<String> validate(LoanDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField000() != null && dto.getLoanField000() < 0) {
            errors.add("loanField000 must not be negative");
        }
        if (dto.getLoanField001() != null && dto.getLoanField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField001 must not be negative");
        }
        if (dto.getLoanField002() != null && dto.getLoanField002().isBlank()) {
            errors.add("loanField002 must not be blank if provided");
        }
        if (dto.getLoanField008() != null && dto.getLoanField008().isBlank()) {
            errors.add("loanField008 must not be blank if provided");
        }
        if (dto.getLoanField009() != null && dto.getLoanField009() < 0) {
            errors.add("loanField009 must not be negative");
        }
        if (dto.getLoanField010() != null && dto.getLoanField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField010 must not be negative");
        }
        if (dto.getLoanField013() != null && dto.getLoanField013().compareTo(BigDecimal.ZERO) < 0) {
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
