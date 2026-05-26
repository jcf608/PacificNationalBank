package com.pnb.fee;

import javax.enterprise.context.ApplicationScoped;

/**
 * FeeMapper028 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FeeMapper028 {

    public FeeDto028 toDto(FeeV028 entity) {
        if (entity == null) return null;
        FeeDto028 dto = new FeeDto028();
        // dto.setFeeField000(entity.getFeeField000());
        // dto.setFeeField001(entity.getFeeField001());
        // dto.setFeeField002(entity.getFeeField002());
        // dto.setFeeField003(entity.getFeeField003());
        // dto.setFeeField004(entity.getFeeField004());
        return dto;
    }

    public FeeV028 toEntity(FeeDto028 dto) {
        if (dto == null) return null;
        FeeV028 entity = new FeeV028();
        // entity.setFeeField000(dto.getFeeField000());
        // entity.setFeeField001(dto.getFeeField001());
        // entity.setFeeField002(dto.getFeeField002());
        // entity.setFeeField003(dto.getFeeField003());
        // entity.setFeeField004(dto.getFeeField004());
        return entity;
    }
}
