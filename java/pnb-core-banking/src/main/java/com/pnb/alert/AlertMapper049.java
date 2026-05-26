package com.pnb.alert;

import javax.enterprise.context.ApplicationScoped;

/**
 * AlertMapper049 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AlertMapper049 {

    public AlertDto049 toDto(AlertV049 entity) {
        if (entity == null) return null;
        AlertDto049 dto = new AlertDto049();
        // dto.setAlerField000(entity.getAlerField000());
        // dto.setAlerField001(entity.getAlerField001());
        // dto.setAlerField002(entity.getAlerField002());
        // dto.setAlerField003(entity.getAlerField003());
        // dto.setAlerField004(entity.getAlerField004());
        return dto;
    }

    public AlertV049 toEntity(AlertDto049 dto) {
        if (dto == null) return null;
        AlertV049 entity = new AlertV049();
        // entity.setAlerField000(dto.getAlerField000());
        // entity.setAlerField001(dto.getAlerField001());
        // entity.setAlerField002(dto.getAlerField002());
        // entity.setAlerField003(dto.getAlerField003());
        // entity.setAlerField004(dto.getAlerField004());
        return entity;
    }
}
