package com.pnb.alert;

import javax.enterprise.context.ApplicationScoped;

/**
 * AlertMapper020 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AlertMapper020 {

    public AlertDto020 toDto(AlertV020 entity) {
        if (entity == null) return null;
        AlertDto020 dto = new AlertDto020();
        // dto.setAlerField000(entity.getAlerField000());
        // dto.setAlerField001(entity.getAlerField001());
        // dto.setAlerField002(entity.getAlerField002());
        // dto.setAlerField003(entity.getAlerField003());
        // dto.setAlerField004(entity.getAlerField004());
        return dto;
    }

    public AlertV020 toEntity(AlertDto020 dto) {
        if (dto == null) return null;
        AlertV020 entity = new AlertV020();
        // entity.setAlerField000(dto.getAlerField000());
        // entity.setAlerField001(dto.getAlerField001());
        // entity.setAlerField002(dto.getAlerField002());
        // entity.setAlerField003(dto.getAlerField003());
        // entity.setAlerField004(dto.getAlerField004());
        return entity;
    }
}
