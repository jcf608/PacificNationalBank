package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator042 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator042 {

    public List<String> validate(LoanDto042 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField000() != null && dto.getLoanField000().isBlank()) {
            errors.add("loanField000 must not be blank if provided");
        }
        if (dto.getLoanField006() != null && dto.getLoanField006().isBlank()) {
            errors.add("loanField006 must not be blank if provided");
        }
        if (dto.getLoanField007() != null && dto.getLoanField007() < 0) {
            errors.add("loanField007 must not be negative");
        }
        if (dto.getLoanField008() != null && dto.getLoanField008().isBlank()) {
            errors.add("loanField008 must not be blank if provided");
        }
        if (dto.getLoanField011() != null && dto.getLoanField011().isBlank()) {
            errors.add("loanField011 must not be blank if provided");
        }
        if (dto.getLoanField012() != null && dto.getLoanField012() < 0) {
            errors.add("loanField012 must not be negative");
        }
        return errors;
    }
}
