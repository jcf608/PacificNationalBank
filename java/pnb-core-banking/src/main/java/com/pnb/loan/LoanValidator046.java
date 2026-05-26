package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator046 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator046 {

    public List<String> validate(LoanDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField001() != null && dto.getLoanField001().isBlank()) {
            errors.add("loanField001 must not be blank if provided");
        }
        if (dto.getLoanField005() != null && dto.getLoanField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField005 must not be negative");
        }
        if (dto.getLoanField007() != null && dto.getLoanField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField007 must not be negative");
        }
        if (dto.getLoanField008() != null && dto.getLoanField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField008 must not be negative");
        }
        if (dto.getLoanField009() != null && dto.getLoanField009() < 0) {
            errors.add("loanField009 must not be negative");
        }
        if (dto.getLoanField011() != null && dto.getLoanField011().isBlank()) {
            errors.add("loanField011 must not be blank if provided");
        }
        if (dto.getLoanField013() != null && dto.getLoanField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField013 must not be negative");
        }
        if (dto.getLoanField015() != null && dto.getLoanField015() < 0) {
            errors.add("loanField015 must not be negative");
        }
        return errors;
    }
}
