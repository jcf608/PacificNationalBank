package com.pnb.hold;

import javax.enterprise.context.ApplicationScoped;

/**
 * HoldMapper047 — Maps between entity and DTO.
 */
@ApplicationScoped
public class HoldMapper047 {

    public HoldDto047 toDto(HoldV047 entity) {
        if (entity == null) return null;
        HoldDto047 dto = new HoldDto047();
        // dto.setHoldField000(entity.getHoldField000());
        // dto.setHoldField001(entity.getHoldField001());
        // dto.setHoldField002(entity.getHoldField002());
        // dto.setHoldField003(entity.getHoldField003());
        // dto.setHoldField004(entity.getHoldField004());
        return dto;
    }

    public HoldV047 toEntity(HoldDto047 dto) {
        if (dto == null) return null;
        HoldV047 entity = new HoldV047();
        // entity.setHoldField000(dto.getHoldField000());
        // entity.setHoldField001(dto.getHoldField001());
        // entity.setHoldField002(dto.getHoldField002());
        // entity.setHoldField003(dto.getHoldField003());
        // entity.setHoldField004(dto.getHoldField004());
        return entity;
    }
}
