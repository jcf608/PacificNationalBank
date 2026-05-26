package com.pnb.alert;

import javax.enterprise.context.ApplicationScoped;

/**
 * AlertMapper041 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AlertMapper041 {

    public AlertDto041 toDto(AlertV041 entity) {
        if (entity == null) return null;
        AlertDto041 dto = new AlertDto041();
        // dto.setAlerField000(entity.getAlerField000());
        // dto.setAlerField001(entity.getAlerField001());
        // dto.setAlerField002(entity.getAlerField002());
        // dto.setAlerField003(entity.getAlerField003());
        // dto.setAlerField004(entity.getAlerField004());
        return dto;
    }

    public AlertV041 toEntity(AlertDto041 dto) {
        if (dto == null) return null;
        AlertV041 entity = new AlertV041();
        // entity.setAlerField000(dto.getAlerField000());
        // entity.setAlerField001(dto.getAlerField001());
        // entity.setAlerField002(dto.getAlerField002());
        // entity.setAlerField003(dto.getAlerField003());
        // entity.setAlerField004(dto.getAlerField004());
        return entity;
    }
}
