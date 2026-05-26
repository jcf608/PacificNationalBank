package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator031 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator031 {

    public List<String> validate(LoanDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField003() != null && dto.getLoanField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField003 must not be negative");
        }
        if (dto.getLoanField011() != null && dto.getLoanField011() < 0) {
            errors.add("loanField011 must not be negative");
        }
        if (dto.getLoanField013() != null && dto.getLoanField013() < 0) {
            errors.add("loanField013 must not be negative");
        }
        return errors;
    }
}
