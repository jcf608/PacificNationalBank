package com.pnb.stop;

import javax.enterprise.context.ApplicationScoped;

/**
 * StopMapper058 — Maps between entity and DTO.
 */
@ApplicationScoped
public class StopMapper058 {

    public StopDto058 toDto(StopV058 entity) {
        if (entity == null) return null;
        StopDto058 dto = new StopDto058();
        // dto.setStopField000(entity.getStopField000());
        // dto.setStopField001(entity.getStopField001());
        // dto.setStopField002(entity.getStopField002());
        // dto.setStopField003(entity.getStopField003());
        // dto.setStopField004(entity.getStopField004());
        return dto;
    }

    public StopV058 toEntity(StopDto058 dto) {
        if (dto == null) return null;
        StopV058 entity = new StopV058();
        // entity.setStopField000(dto.getStopField000());
        // entity.setStopField001(dto.getStopField001());
        // entity.setStopField002(dto.getStopField002());
        // entity.setStopField003(dto.getStopField003());
        // entity.setStopField004(dto.getStopField004());
        return entity;
    }
}
