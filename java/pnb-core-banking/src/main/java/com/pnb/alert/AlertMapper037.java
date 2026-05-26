package com.pnb.alert;

import javax.enterprise.context.ApplicationScoped;

/**
 * AlertMapper037 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AlertMapper037 {

    public AlertDto037 toDto(AlertV037 entity) {
        if (entity == null) return null;
        AlertDto037 dto = new AlertDto037();
        // dto.setAlerField000(entity.getAlerField000());
        // dto.setAlerField001(entity.getAlerField001());
        // dto.setAlerField002(entity.getAlerField002());
        // dto.setAlerField003(entity.getAlerField003());
        // dto.setAlerField004(entity.getAlerField004());
        return dto;
    }

    public AlertV037 toEntity(AlertDto037 dto) {
        if (dto == null) return null;
        AlertV037 entity = new AlertV037();
        // entity.setAlerField000(dto.getAlerField000());
        // entity.setAlerField001(dto.getAlerField001());
        // entity.setAlerField002(dto.getAlerField002());
        // entity.setAlerField003(dto.getAlerField003());
        // entity.setAlerField004(dto.getAlerField004());
        return entity;
    }
}
