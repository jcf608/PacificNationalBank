package com.pnb.hold;

import javax.enterprise.context.ApplicationScoped;

/**
 * HoldMapper030 — Maps between entity and DTO.
 */
@ApplicationScoped
public class HoldMapper030 {

    public HoldDto030 toDto(HoldV030 entity) {
        if (entity == null) return null;
        HoldDto030 dto = new HoldDto030();
        // dto.setHoldField000(entity.getHoldField000());
        // dto.setHoldField001(entity.getHoldField001());
        // dto.setHoldField002(entity.getHoldField002());
        // dto.setHoldField003(entity.getHoldField003());
        // dto.setHoldField004(entity.getHoldField004());
        return dto;
    }

    public HoldV030 toEntity(HoldDto030 dto) {
        if (dto == null) return null;
        HoldV030 entity = new HoldV030();
        // entity.setHoldField000(dto.getHoldField000());
        // entity.setHoldField001(dto.getHoldField001());
        // entity.setHoldField002(dto.getHoldField002());
        // entity.setHoldField003(dto.getHoldField003());
        // entity.setHoldField004(dto.getHoldField004());
        return entity;
    }
}
