package com.pnb.stop;

import javax.enterprise.context.ApplicationScoped;

/**
 * StopMapper053 — Maps between entity and DTO.
 */
@ApplicationScoped
public class StopMapper053 {

    public StopDto053 toDto(StopV053 entity) {
        if (entity == null) return null;
        StopDto053 dto = new StopDto053();
        // dto.setStopField000(entity.getStopField000());
        // dto.setStopField001(entity.getStopField001());
        // dto.setStopField002(entity.getStopField002());
        // dto.setStopField003(entity.getStopField003());
        // dto.setStopField004(entity.getStopField004());
        return dto;
    }

    public StopV053 toEntity(StopDto053 dto) {
        if (dto == null) return null;
        StopV053 entity = new StopV053();
        // entity.setStopField000(dto.getStopField000());
        // entity.setStopField001(dto.getStopField001());
        // entity.setStopField002(dto.getStopField002());
        // entity.setStopField003(dto.getStopField003());
        // entity.setStopField004(dto.getStopField004());
        return entity;
    }
}
