package com.pnb.fee;

import javax.enterprise.context.ApplicationScoped;

/**
 * FeeMapper021 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FeeMapper021 {

    public FeeDto021 toDto(FeeV021 entity) {
        if (entity == null) return null;
        FeeDto021 dto = new FeeDto021();
        // dto.setFeeField000(entity.getFeeField000());
        // dto.setFeeField001(entity.getFeeField001());
        // dto.setFeeField002(entity.getFeeField002());
        // dto.setFeeField003(entity.getFeeField003());
        // dto.setFeeField004(entity.getFeeField004());
        return dto;
    }

    public FeeV021 toEntity(FeeDto021 dto) {
        if (dto == null) return null;
        FeeV021 entity = new FeeV021();
        // entity.setFeeField000(dto.getFeeField000());
        // entity.setFeeField001(dto.getFeeField001());
        // entity.setFeeField002(dto.getFeeField002());
        // entity.setFeeField003(dto.getFeeField003());
        // entity.setFeeField004(dto.getFeeField004());
        return entity;
    }
}
