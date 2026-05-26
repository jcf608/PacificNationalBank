package com.pnb.alert;

import javax.enterprise.context.ApplicationScoped;

/**
 * AlertMapper052 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AlertMapper052 {

    public AlertDto052 toDto(AlertV052 entity) {
        if (entity == null) return null;
        AlertDto052 dto = new AlertDto052();
        // dto.setAlerField000(entity.getAlerField000());
        // dto.setAlerField001(entity.getAlerField001());
        // dto.setAlerField002(entity.getAlerField002());
        // dto.setAlerField003(entity.getAlerField003());
        // dto.setAlerField004(entity.getAlerField004());
        return dto;
    }

    public AlertV052 toEntity(AlertDto052 dto) {
        if (dto == null) return null;
        AlertV052 entity = new AlertV052();
        // entity.setAlerField000(dto.getAlerField000());
        // entity.setAlerField001(dto.getAlerField001());
        // entity.setAlerField002(dto.getAlerField002());
        // entity.setAlerField003(dto.getAlerField003());
        // entity.setAlerField004(dto.getAlerField004());
        return entity;
    }
}
