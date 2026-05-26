package com.pnb.alert;

import javax.enterprise.context.ApplicationScoped;

/**
 * AlertMapper044 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AlertMapper044 {

    public AlertDto044 toDto(AlertV044 entity) {
        if (entity == null) return null;
        AlertDto044 dto = new AlertDto044();
        // dto.setAlerField000(entity.getAlerField000());
        // dto.setAlerField001(entity.getAlerField001());
        // dto.setAlerField002(entity.getAlerField002());
        // dto.setAlerField003(entity.getAlerField003());
        // dto.setAlerField004(entity.getAlerField004());
        return dto;
    }

    public AlertV044 toEntity(AlertDto044 dto) {
        if (dto == null) return null;
        AlertV044 entity = new AlertV044();
        // entity.setAlerField000(dto.getAlerField000());
        // entity.setAlerField001(dto.getAlerField001());
        // entity.setAlerField002(dto.getAlerField002());
        // entity.setAlerField003(dto.getAlerField003());
        // entity.setAlerField004(dto.getAlerField004());
        return entity;
    }
}
