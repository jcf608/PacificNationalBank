package com.pnb.hold;

import javax.enterprise.context.ApplicationScoped;

/**
 * HoldMapper041 — Maps between entity and DTO.
 */
@ApplicationScoped
public class HoldMapper041 {

    public HoldDto041 toDto(HoldV041 entity) {
        if (entity == null) return null;
        HoldDto041 dto = new HoldDto041();
        // dto.setHoldField000(entity.getHoldField000());
        // dto.setHoldField001(entity.getHoldField001());
        // dto.setHoldField002(entity.getHoldField002());
        // dto.setHoldField003(entity.getHoldField003());
        // dto.setHoldField004(entity.getHoldField004());
        return dto;
    }

    public HoldV041 toEntity(HoldDto041 dto) {
        if (dto == null) return null;
        HoldV041 entity = new HoldV041();
        // entity.setHoldField000(dto.getHoldField000());
        // entity.setHoldField001(dto.getHoldField001());
        // entity.setHoldField002(dto.getHoldField002());
        // entity.setHoldField003(dto.getHoldField003());
        // entity.setHoldField004(dto.getHoldField004());
        return entity;
    }
}
