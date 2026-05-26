package com.pnb.fee;

import javax.enterprise.context.ApplicationScoped;

/**
 * FeeMapper044 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FeeMapper044 {

    public FeeDto044 toDto(FeeV044 entity) {
        if (entity == null) return null;
        FeeDto044 dto = new FeeDto044();
        // dto.setFeeField000(entity.getFeeField000());
        // dto.setFeeField001(entity.getFeeField001());
        // dto.setFeeField002(entity.getFeeField002());
        // dto.setFeeField003(entity.getFeeField003());
        // dto.setFeeField004(entity.getFeeField004());
        return dto;
    }

    public FeeV044 toEntity(FeeDto044 dto) {
        if (dto == null) return null;
        FeeV044 entity = new FeeV044();
        // entity.setFeeField000(dto.getFeeField000());
        // entity.setFeeField001(dto.getFeeField001());
        // entity.setFeeField002(dto.getFeeField002());
        // entity.setFeeField003(dto.getFeeField003());
        // entity.setFeeField004(dto.getFeeField004());
        return entity;
    }
}
