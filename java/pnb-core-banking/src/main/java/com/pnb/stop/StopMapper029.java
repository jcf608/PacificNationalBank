package com.pnb.stop;

import javax.enterprise.context.ApplicationScoped;

/**
 * StopMapper029 — Maps between entity and DTO.
 */
@ApplicationScoped
public class StopMapper029 {

    public StopDto029 toDto(StopV029 entity) {
        if (entity == null) return null;
        StopDto029 dto = new StopDto029();
        // dto.setStopField000(entity.getStopField000());
        // dto.setStopField001(entity.getStopField001());
        // dto.setStopField002(entity.getStopField002());
        // dto.setStopField003(entity.getStopField003());
        // dto.setStopField004(entity.getStopField004());
        return dto;
    }

    public StopV029 toEntity(StopDto029 dto) {
        if (dto == null) return null;
        StopV029 entity = new StopV029();
        // entity.setStopField000(dto.getStopField000());
        // entity.setStopField001(dto.getStopField001());
        // entity.setStopField002(dto.getStopField002());
        // entity.setStopField003(dto.getStopField003());
        // entity.setStopField004(dto.getStopField004());
        return entity;
    }
}
