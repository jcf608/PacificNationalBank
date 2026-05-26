package com.pnb.loan;

import javax.enterprise.context.ApplicationScoped;

/**
 * LoanMapper025 — Maps between entity and DTO.
 */
@ApplicationScoped
public class LoanMapper025 {

    public LoanDto025 toDto(LoanV025 entity) {
        if (entity == null) return null;
        LoanDto025 dto = new LoanDto025();
        // dto.setLoanField000(entity.getLoanField000());
        // dto.setLoanField001(entity.getLoanField001());
        // dto.setLoanField002(entity.getLoanField002());
        // dto.setLoanField003(entity.getLoanField003());
        // dto.setLoanField004(entity.getLoanField004());
        return dto;
    }

    public LoanV025 toEntity(LoanDto025 dto) {
        if (dto == null) return null;
        LoanV025 entity = new LoanV025();
        // entity.setLoanField000(dto.getLoanField000());
        // entity.setLoanField001(dto.getLoanField001());
        // entity.setLoanField002(dto.getLoanField002());
        // entity.setLoanField003(dto.getLoanField003());
        // entity.setLoanField004(dto.getLoanField004());
        return entity;
    }
}
