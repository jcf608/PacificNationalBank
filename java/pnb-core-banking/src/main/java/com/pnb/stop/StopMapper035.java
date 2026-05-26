package com.pnb.stop;

import javax.enterprise.context.ApplicationScoped;

/**
 * StopMapper035 — Maps between entity and DTO.
 */
@ApplicationScoped
public class StopMapper035 {

    public StopDto035 toDto(StopV035 entity) {
        if (entity == null) return null;
        StopDto035 dto = new StopDto035();
        // dto.setStopField000(entity.getStopField000());
        // dto.setStopField001(entity.getStopField001());
        // dto.setStopField002(entity.getStopField002());
        // dto.setStopField003(entity.getStopField003());
        // dto.setStopField004(entity.getStopField004());
        return dto;
    }

    public StopV035 toEntity(StopDto035 dto) {
        if (dto == null) return null;
        StopV035 entity = new StopV035();
        // entity.setStopField000(dto.getStopField000());
        // entity.setStopField001(dto.getStopField001());
        // entity.setStopField002(dto.getStopField002());
        // entity.setStopField003(dto.getStopField003());
        // entity.setStopField004(dto.getStopField004());
        return entity;
    }
}
