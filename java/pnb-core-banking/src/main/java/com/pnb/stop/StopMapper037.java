package com.pnb.stop;

import javax.enterprise.context.ApplicationScoped;

/**
 * StopMapper037 — Maps between entity and DTO.
 */
@ApplicationScoped
public class StopMapper037 {

    public StopDto037 toDto(StopV037 entity) {
        if (entity == null) return null;
        StopDto037 dto = new StopDto037();
        // dto.setStopField000(entity.getStopField000());
        // dto.setStopField001(entity.getStopField001());
        // dto.setStopField002(entity.getStopField002());
        // dto.setStopField003(entity.getStopField003());
        // dto.setStopField004(entity.getStopField004());
        return dto;
    }

    public StopV037 toEntity(StopDto037 dto) {
        if (dto == null) return null;
        StopV037 entity = new StopV037();
        // entity.setStopField000(dto.getStopField000());
        // entity.setStopField001(dto.getStopField001());
        // entity.setStopField002(dto.getStopField002());
        // entity.setStopField003(dto.getStopField003());
        // entity.setStopField004(dto.getStopField004());
        return entity;
    }
}
