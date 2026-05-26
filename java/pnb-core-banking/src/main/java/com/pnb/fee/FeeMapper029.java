package com.pnb.fee;

import javax.enterprise.context.ApplicationScoped;

/**
 * FeeMapper029 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FeeMapper029 {

    public FeeDto029 toDto(FeeV029 entity) {
        if (entity == null) return null;
        FeeDto029 dto = new FeeDto029();
        // dto.setFeeField000(entity.getFeeField000());
        // dto.setFeeField001(entity.getFeeField001());
        // dto.setFeeField002(entity.getFeeField002());
        // dto.setFeeField003(entity.getFeeField003());
        // dto.setFeeField004(entity.getFeeField004());
        return dto;
    }

    public FeeV029 toEntity(FeeDto029 dto) {
        if (dto == null) return null;
        FeeV029 entity = new FeeV029();
        // entity.setFeeField000(dto.getFeeField000());
        // entity.setFeeField001(dto.getFeeField001());
        // entity.setFeeField002(dto.getFeeField002());
        // entity.setFeeField003(dto.getFeeField003());
        // entity.setFeeField004(dto.getFeeField004());
        return entity;
    }
}
