package com.pnb.hold;

import javax.enterprise.context.ApplicationScoped;

/**
 * HoldMapper053 — Maps between entity and DTO.
 */
@ApplicationScoped
public class HoldMapper053 {

    public HoldDto053 toDto(HoldV053 entity) {
        if (entity == null) return null;
        HoldDto053 dto = new HoldDto053();
        // dto.setHoldField000(entity.getHoldField000());
        // dto.setHoldField001(entity.getHoldField001());
        // dto.setHoldField002(entity.getHoldField002());
        // dto.setHoldField003(entity.getHoldField003());
        // dto.setHoldField004(entity.getHoldField004());
        return dto;
    }

    public HoldV053 toEntity(HoldDto053 dto) {
        if (dto == null) return null;
        HoldV053 entity = new HoldV053();
        // entity.setHoldField000(dto.getHoldField000());
        // entity.setHoldField001(dto.getHoldField001());
        // entity.setHoldField002(dto.getHoldField002());
        // entity.setHoldField003(dto.getHoldField003());
        // entity.setHoldField004(dto.getHoldField004());
        return entity;
    }
}
