package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator024 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator024 {

    public List<String> validate(LoanDto024 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField000() != null && dto.getLoanField000().isBlank()) {
            errors.add("loanField000 must not be blank if provided");
        }
        if (dto.getLoanField003() != null && dto.getLoanField003().isBlank()) {
            errors.add("loanField003 must not be blank if provided");
        }
        return errors;
    }
}
