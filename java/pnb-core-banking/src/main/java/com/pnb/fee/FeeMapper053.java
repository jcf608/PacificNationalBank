package com.pnb.fee;

import javax.enterprise.context.ApplicationScoped;

/**
 * FeeMapper053 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FeeMapper053 {

    public FeeDto053 toDto(FeeV053 entity) {
        if (entity == null) return null;
        FeeDto053 dto = new FeeDto053();
        // dto.setFeeField000(entity.getFeeField000());
        // dto.setFeeField001(entity.getFeeField001());
        // dto.setFeeField002(entity.getFeeField002());
        // dto.setFeeField003(entity.getFeeField003());
        // dto.setFeeField004(entity.getFeeField004());
        return dto;
    }

    public FeeV053 toEntity(FeeDto053 dto) {
        if (dto == null) return null;
        FeeV053 entity = new FeeV053();
        // entity.setFeeField000(dto.getFeeField000());
        // entity.setFeeField001(dto.getFeeField001());
        // entity.setFeeField002(dto.getFeeField002());
        // entity.setFeeField003(dto.getFeeField003());
        // entity.setFeeField004(dto.getFeeField004());
        return entity;
    }
}
