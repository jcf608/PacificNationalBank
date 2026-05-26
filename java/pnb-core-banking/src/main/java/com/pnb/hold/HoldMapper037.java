package com.pnb.hold;

import javax.enterprise.context.ApplicationScoped;

/**
 * HoldMapper037 — Maps between entity and DTO.
 */
@ApplicationScoped
public class HoldMapper037 {

    public HoldDto037 toDto(HoldV037 entity) {
        if (entity == null) return null;
        HoldDto037 dto = new HoldDto037();
        // dto.setHoldField000(entity.getHoldField000());
        // dto.setHoldField001(entity.getHoldField001());
        // dto.setHoldField002(entity.getHoldField002());
        // dto.setHoldField003(entity.getHoldField003());
        // dto.setHoldField004(entity.getHoldField004());
        return dto;
    }

    public HoldV037 toEntity(HoldDto037 dto) {
        if (dto == null) return null;
        HoldV037 entity = new HoldV037();
        // entity.setHoldField000(dto.getHoldField000());
        // entity.setHoldField001(dto.getHoldField001());
        // entity.setHoldField002(dto.getHoldField002());
        // entity.setHoldField003(dto.getHoldField003());
        // entity.setHoldField004(dto.getHoldField004());
        return entity;
    }
}
