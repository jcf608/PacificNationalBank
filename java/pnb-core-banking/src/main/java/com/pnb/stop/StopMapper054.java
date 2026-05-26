package com.pnb.stop;

import javax.enterprise.context.ApplicationScoped;

/**
 * StopMapper054 — Maps between entity and DTO.
 */
@ApplicationScoped
public class StopMapper054 {

    public StopDto054 toDto(StopV054 entity) {
        if (entity == null) return null;
        StopDto054 dto = new StopDto054();
        // dto.setStopField000(entity.getStopField000());
        // dto.setStopField001(entity.getStopField001());
        // dto.setStopField002(entity.getStopField002());
        // dto.setStopField003(entity.getStopField003());
        // dto.setStopField004(entity.getStopField004());
        return dto;
    }

    public StopV054 toEntity(StopDto054 dto) {
        if (dto == null) return null;
        StopV054 entity = new StopV054();
        // entity.setStopField000(dto.getStopField000());
        // entity.setStopField001(dto.getStopField001());
        // entity.setStopField002(dto.getStopField002());
        // entity.setStopField003(dto.getStopField003());
        // entity.setStopField004(dto.getStopField004());
        return entity;
    }
}
