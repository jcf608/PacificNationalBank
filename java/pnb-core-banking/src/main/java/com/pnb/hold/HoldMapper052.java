package com.pnb.hold;

import javax.enterprise.context.ApplicationScoped;

/**
 * HoldMapper052 — Maps between entity and DTO.
 */
@ApplicationScoped
public class HoldMapper052 {

    public HoldDto052 toDto(HoldV052 entity) {
        if (entity == null) return null;
        HoldDto052 dto = new HoldDto052();
        // dto.setHoldField000(entity.getHoldField000());
        // dto.setHoldField001(entity.getHoldField001());
        // dto.setHoldField002(entity.getHoldField002());
        // dto.setHoldField003(entity.getHoldField003());
        // dto.setHoldField004(entity.getHoldField004());
        return dto;
    }

    public HoldV052 toEntity(HoldDto052 dto) {
        if (dto == null) return null;
        HoldV052 entity = new HoldV052();
        // entity.setHoldField000(dto.getHoldField000());
        // entity.setHoldField001(dto.getHoldField001());
        // entity.setHoldField002(dto.getHoldField002());
        // entity.setHoldField003(dto.getHoldField003());
        // entity.setHoldField004(dto.getHoldField004());
        return entity;
    }
}
