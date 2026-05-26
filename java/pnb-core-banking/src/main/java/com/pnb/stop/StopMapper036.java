package com.pnb.stop;

import javax.enterprise.context.ApplicationScoped;

/**
 * StopMapper036 — Maps between entity and DTO.
 */
@ApplicationScoped
public class StopMapper036 {

    public StopDto036 toDto(StopV036 entity) {
        if (entity == null) return null;
        StopDto036 dto = new StopDto036();
        // dto.setStopField000(entity.getStopField000());
        // dto.setStopField001(entity.getStopField001());
        // dto.setStopField002(entity.getStopField002());
        // dto.setStopField003(entity.getStopField003());
        // dto.setStopField004(entity.getStopField004());
        return dto;
    }

    public StopV036 toEntity(StopDto036 dto) {
        if (dto == null) return null;
        StopV036 entity = new StopV036();
        // entity.setStopField000(dto.getStopField000());
        // entity.setStopField001(dto.getStopField001());
        // entity.setStopField002(dto.getStopField002());
        // entity.setStopField003(dto.getStopField003());
        // entity.setStopField004(dto.getStopField004());
        return entity;
    }
}
