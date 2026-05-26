package com.pnb.stop;

import javax.enterprise.context.ApplicationScoped;

/**
 * StopMapper059 — Maps between entity and DTO.
 */
@ApplicationScoped
public class StopMapper059 {

    public StopDto059 toDto(StopV059 entity) {
        if (entity == null) return null;
        StopDto059 dto = new StopDto059();
        // dto.setStopField000(entity.getStopField000());
        // dto.setStopField001(entity.getStopField001());
        // dto.setStopField002(entity.getStopField002());
        // dto.setStopField003(entity.getStopField003());
        // dto.setStopField004(entity.getStopField004());
        return dto;
    }

    public StopV059 toEntity(StopDto059 dto) {
        if (dto == null) return null;
        StopV059 entity = new StopV059();
        // entity.setStopField000(dto.getStopField000());
        // entity.setStopField001(dto.getStopField001());
        // entity.setStopField002(dto.getStopField002());
        // entity.setStopField003(dto.getStopField003());
        // entity.setStopField004(dto.getStopField004());
        return entity;
    }
}
