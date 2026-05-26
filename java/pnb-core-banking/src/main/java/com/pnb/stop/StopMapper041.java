package com.pnb.stop;

import javax.enterprise.context.ApplicationScoped;

/**
 * StopMapper041 — Maps between entity and DTO.
 */
@ApplicationScoped
public class StopMapper041 {

    public StopDto041 toDto(StopV041 entity) {
        if (entity == null) return null;
        StopDto041 dto = new StopDto041();
        // dto.setStopField000(entity.getStopField000());
        // dto.setStopField001(entity.getStopField001());
        // dto.setStopField002(entity.getStopField002());
        // dto.setStopField003(entity.getStopField003());
        // dto.setStopField004(entity.getStopField004());
        return dto;
    }

    public StopV041 toEntity(StopDto041 dto) {
        if (dto == null) return null;
        StopV041 entity = new StopV041();
        // entity.setStopField000(dto.getStopField000());
        // entity.setStopField001(dto.getStopField001());
        // entity.setStopField002(dto.getStopField002());
        // entity.setStopField003(dto.getStopField003());
        // entity.setStopField004(dto.getStopField004());
        return entity;
    }
}
