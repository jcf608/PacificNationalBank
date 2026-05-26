package com.pnb.stop;

import javax.enterprise.context.ApplicationScoped;

/**
 * StopMapper034 — Maps between entity and DTO.
 */
@ApplicationScoped
public class StopMapper034 {

    public StopDto034 toDto(StopV034 entity) {
        if (entity == null) return null;
        StopDto034 dto = new StopDto034();
        // dto.setStopField000(entity.getStopField000());
        // dto.setStopField001(entity.getStopField001());
        // dto.setStopField002(entity.getStopField002());
        // dto.setStopField003(entity.getStopField003());
        // dto.setStopField004(entity.getStopField004());
        return dto;
    }

    public StopV034 toEntity(StopDto034 dto) {
        if (dto == null) return null;
        StopV034 entity = new StopV034();
        // entity.setStopField000(dto.getStopField000());
        // entity.setStopField001(dto.getStopField001());
        // entity.setStopField002(dto.getStopField002());
        // entity.setStopField003(dto.getStopField003());
        // entity.setStopField004(dto.getStopField004());
        return entity;
    }
}
