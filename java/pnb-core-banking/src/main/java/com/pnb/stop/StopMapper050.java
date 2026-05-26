package com.pnb.stop;

import javax.enterprise.context.ApplicationScoped;

/**
 * StopMapper050 — Maps between entity and DTO.
 */
@ApplicationScoped
public class StopMapper050 {

    public StopDto050 toDto(StopV050 entity) {
        if (entity == null) return null;
        StopDto050 dto = new StopDto050();
        // dto.setStopField000(entity.getStopField000());
        // dto.setStopField001(entity.getStopField001());
        // dto.setStopField002(entity.getStopField002());
        // dto.setStopField003(entity.getStopField003());
        // dto.setStopField004(entity.getStopField004());
        return dto;
    }

    public StopV050 toEntity(StopDto050 dto) {
        if (dto == null) return null;
        StopV050 entity = new StopV050();
        // entity.setStopField000(dto.getStopField000());
        // entity.setStopField001(dto.getStopField001());
        // entity.setStopField002(dto.getStopField002());
        // entity.setStopField003(dto.getStopField003());
        // entity.setStopField004(dto.getStopField004());
        return entity;
    }
}
