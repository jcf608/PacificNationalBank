package com.pnb.alert;

import javax.enterprise.context.ApplicationScoped;

/**
 * AlertMapper022 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AlertMapper022 {

    public AlertDto022 toDto(AlertV022 entity) {
        if (entity == null) return null;
        AlertDto022 dto = new AlertDto022();
        // dto.setAlerField000(entity.getAlerField000());
        // dto.setAlerField001(entity.getAlerField001());
        // dto.setAlerField002(entity.getAlerField002());
        // dto.setAlerField003(entity.getAlerField003());
        // dto.setAlerField004(entity.getAlerField004());
        return dto;
    }

    public AlertV022 toEntity(AlertDto022 dto) {
        if (dto == null) return null;
        AlertV022 entity = new AlertV022();
        // entity.setAlerField000(dto.getAlerField000());
        // entity.setAlerField001(dto.getAlerField001());
        // entity.setAlerField002(dto.getAlerField002());
        // entity.setAlerField003(dto.getAlerField003());
        // entity.setAlerField004(dto.getAlerField004());
        return entity;
    }
}
