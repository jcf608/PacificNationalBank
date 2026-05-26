package com.pnb.hold;

import javax.enterprise.context.ApplicationScoped;

/**
 * HoldMapper031 — Maps between entity and DTO.
 */
@ApplicationScoped
public class HoldMapper031 {

    public HoldDto031 toDto(HoldV031 entity) {
        if (entity == null) return null;
        HoldDto031 dto = new HoldDto031();
        // dto.setHoldField000(entity.getHoldField000());
        // dto.setHoldField001(entity.getHoldField001());
        // dto.setHoldField002(entity.getHoldField002());
        // dto.setHoldField003(entity.getHoldField003());
        // dto.setHoldField004(entity.getHoldField004());
        return dto;
    }

    public HoldV031 toEntity(HoldDto031 dto) {
        if (dto == null) return null;
        HoldV031 entity = new HoldV031();
        // entity.setHoldField000(dto.getHoldField000());
        // entity.setHoldField001(dto.getHoldField001());
        // entity.setHoldField002(dto.getHoldField002());
        // entity.setHoldField003(dto.getHoldField003());
        // entity.setHoldField004(dto.getHoldField004());
        return entity;
    }
}
