package com.pnb.fee;

import javax.enterprise.context.ApplicationScoped;

/**
 * FeeMapper027 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FeeMapper027 {

    public FeeDto027 toDto(FeeV027 entity) {
        if (entity == null) return null;
        FeeDto027 dto = new FeeDto027();
        // dto.setFeeField000(entity.getFeeField000());
        // dto.setFeeField001(entity.getFeeField001());
        // dto.setFeeField002(entity.getFeeField002());
        // dto.setFeeField003(entity.getFeeField003());
        // dto.setFeeField004(entity.getFeeField004());
        return dto;
    }

    public FeeV027 toEntity(FeeDto027 dto) {
        if (dto == null) return null;
        FeeV027 entity = new FeeV027();
        // entity.setFeeField000(dto.getFeeField000());
        // entity.setFeeField001(dto.getFeeField001());
        // entity.setFeeField002(dto.getFeeField002());
        // entity.setFeeField003(dto.getFeeField003());
        // entity.setFeeField004(dto.getFeeField004());
        return entity;
    }
}
