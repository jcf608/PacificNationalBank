package com.pnb.hold;

import javax.enterprise.context.ApplicationScoped;

/**
 * HoldMapper027 — Maps between entity and DTO.
 */
@ApplicationScoped
public class HoldMapper027 {

    public HoldDto027 toDto(HoldV027 entity) {
        if (entity == null) return null;
        HoldDto027 dto = new HoldDto027();
        // dto.setHoldField000(entity.getHoldField000());
        // dto.setHoldField001(entity.getHoldField001());
        // dto.setHoldField002(entity.getHoldField002());
        // dto.setHoldField003(entity.getHoldField003());
        // dto.setHoldField004(entity.getHoldField004());
        return dto;
    }

    public HoldV027 toEntity(HoldDto027 dto) {
        if (dto == null) return null;
        HoldV027 entity = new HoldV027();
        // entity.setHoldField000(dto.getHoldField000());
        // entity.setHoldField001(dto.getHoldField001());
        // entity.setHoldField002(dto.getHoldField002());
        // entity.setHoldField003(dto.getHoldField003());
        // entity.setHoldField004(dto.getHoldField004());
        return entity;
    }
}
