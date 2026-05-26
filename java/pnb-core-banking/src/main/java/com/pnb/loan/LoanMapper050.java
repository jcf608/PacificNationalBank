package com.pnb.loan;

import javax.enterprise.context.ApplicationScoped;

/**
 * LoanMapper050 — Maps between entity and DTO.
 */
@ApplicationScoped
public class LoanMapper050 {

    public LoanDto050 toDto(LoanV050 entity) {
        if (entity == null) return null;
        LoanDto050 dto = new LoanDto050();
        // dto.setLoanField000(entity.getLoanField000());
        // dto.setLoanField001(entity.getLoanField001());
        // dto.setLoanField002(entity.getLoanField002());
        // dto.setLoanField003(entity.getLoanField003());
        // dto.setLoanField004(entity.getLoanField004());
        return dto;
    }

    public LoanV050 toEntity(LoanDto050 dto) {
        if (dto == null) return null;
        LoanV050 entity = new LoanV050();
        // entity.setLoanField000(dto.getLoanField000());
        // entity.setLoanField001(dto.getLoanField001());
        // entity.setLoanField002(dto.getLoanField002());
        // entity.setLoanField003(dto.getLoanField003());
        // entity.setLoanField004(dto.getLoanField004());
        return entity;
    }
}
