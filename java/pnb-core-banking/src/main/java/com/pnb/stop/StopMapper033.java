package com.pnb.stop;

import javax.enterprise.context.ApplicationScoped;

/**
 * StopMapper033 — Maps between entity and DTO.
 */
@ApplicationScoped
public class StopMapper033 {

    public StopDto033 toDto(StopV033 entity) {
        if (entity == null) return null;
        StopDto033 dto = new StopDto033();
        // dto.setStopField000(entity.getStopField000());
        // dto.setStopField001(entity.getStopField001());
        // dto.setStopField002(entity.getStopField002());
        // dto.setStopField003(entity.getStopField003());
        // dto.setStopField004(entity.getStopField004());
        return dto;
    }

    public StopV033 toEntity(StopDto033 dto) {
        if (dto == null) return null;
        StopV033 entity = new StopV033();
        // entity.setStopField000(dto.getStopField000());
        // entity.setStopField001(dto.getStopField001());
        // entity.setStopField002(dto.getStopField002());
        // entity.setStopField003(dto.getStopField003());
        // entity.setStopField004(dto.getStopField004());
        return entity;
    }
}
