package com.pnb.hold;

import javax.enterprise.context.ApplicationScoped;

/**
 * HoldMapper046 — Maps between entity and DTO.
 */
@ApplicationScoped
public class HoldMapper046 {

    public HoldDto046 toDto(HoldV046 entity) {
        if (entity == null) return null;
        HoldDto046 dto = new HoldDto046();
        // dto.setHoldField000(entity.getHoldField000());
        // dto.setHoldField001(entity.getHoldField001());
        // dto.setHoldField002(entity.getHoldField002());
        // dto.setHoldField003(entity.getHoldField003());
        // dto.setHoldField004(entity.getHoldField004());
        return dto;
    }

    public HoldV046 toEntity(HoldDto046 dto) {
        if (dto == null) return null;
        HoldV046 entity = new HoldV046();
        // entity.setHoldField000(dto.getHoldField000());
        // entity.setHoldField001(dto.getHoldField001());
        // entity.setHoldField002(dto.getHoldField002());
        // entity.setHoldField003(dto.getHoldField003());
        // entity.setHoldField004(dto.getHoldField004());
        return entity;
    }
}
