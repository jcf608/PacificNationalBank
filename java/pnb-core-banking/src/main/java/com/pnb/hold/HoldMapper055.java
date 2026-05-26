package com.pnb.hold;

import javax.enterprise.context.ApplicationScoped;

/**
 * HoldMapper055 — Maps between entity and DTO.
 */
@ApplicationScoped
public class HoldMapper055 {

    public HoldDto055 toDto(HoldV055 entity) {
        if (entity == null) return null;
        HoldDto055 dto = new HoldDto055();
        // dto.setHoldField000(entity.getHoldField000());
        // dto.setHoldField001(entity.getHoldField001());
        // dto.setHoldField002(entity.getHoldField002());
        // dto.setHoldField003(entity.getHoldField003());
        // dto.setHoldField004(entity.getHoldField004());
        return dto;
    }

    public HoldV055 toEntity(HoldDto055 dto) {
        if (dto == null) return null;
        HoldV055 entity = new HoldV055();
        // entity.setHoldField000(dto.getHoldField000());
        // entity.setHoldField001(dto.getHoldField001());
        // entity.setHoldField002(dto.getHoldField002());
        // entity.setHoldField003(dto.getHoldField003());
        // entity.setHoldField004(dto.getHoldField004());
        return entity;
    }
}
