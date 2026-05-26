package com.pnb.loan;

import javax.enterprise.context.ApplicationScoped;

/**
 * LoanMapper037 — Maps between entity and DTO.
 */
@ApplicationScoped
public class LoanMapper037 {

    public LoanDto037 toDto(LoanV037 entity) {
        if (entity == null) return null;
        LoanDto037 dto = new LoanDto037();
        // dto.setLoanField000(entity.getLoanField000());
        // dto.setLoanField001(entity.getLoanField001());
        // dto.setLoanField002(entity.getLoanField002());
        // dto.setLoanField003(entity.getLoanField003());
        // dto.setLoanField004(entity.getLoanField004());
        return dto;
    }

    public LoanV037 toEntity(LoanDto037 dto) {
        if (dto == null) return null;
        LoanV037 entity = new LoanV037();
        // entity.setLoanField000(dto.getLoanField000());
        // entity.setLoanField001(dto.getLoanField001());
        // entity.setLoanField002(dto.getLoanField002());
        // entity.setLoanField003(dto.getLoanField003());
        // entity.setLoanField004(dto.getLoanField004());
        return entity;
    }
}
