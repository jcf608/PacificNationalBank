package com.pnb.stop;

import javax.enterprise.context.ApplicationScoped;

/**
 * StopMapper045 — Maps between entity and DTO.
 */
@ApplicationScoped
public class StopMapper045 {

    public StopDto045 toDto(StopV045 entity) {
        if (entity == null) return null;
        StopDto045 dto = new StopDto045();
        // dto.setStopField000(entity.getStopField000());
        // dto.setStopField001(entity.getStopField001());
        // dto.setStopField002(entity.getStopField002());
        // dto.setStopField003(entity.getStopField003());
        // dto.setStopField004(entity.getStopField004());
        return dto;
    }

    public StopV045 toEntity(StopDto045 dto) {
        if (dto == null) return null;
        StopV045 entity = new StopV045();
        // entity.setStopField000(dto.getStopField000());
        // entity.setStopField001(dto.getStopField001());
        // entity.setStopField002(dto.getStopField002());
        // entity.setStopField003(dto.getStopField003());
        // entity.setStopField004(dto.getStopField004());
        return entity;
    }
}
