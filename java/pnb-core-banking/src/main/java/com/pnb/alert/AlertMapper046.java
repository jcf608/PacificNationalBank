package com.pnb.alert;

import javax.enterprise.context.ApplicationScoped;

/**
 * AlertMapper046 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AlertMapper046 {

    public AlertDto046 toDto(AlertV046 entity) {
        if (entity == null) return null;
        AlertDto046 dto = new AlertDto046();
        // dto.setAlerField000(entity.getAlerField000());
        // dto.setAlerField001(entity.getAlerField001());
        // dto.setAlerField002(entity.getAlerField002());
        // dto.setAlerField003(entity.getAlerField003());
        // dto.setAlerField004(entity.getAlerField004());
        return dto;
    }

    public AlertV046 toEntity(AlertDto046 dto) {
        if (dto == null) return null;
        AlertV046 entity = new AlertV046();
        // entity.setAlerField000(dto.getAlerField000());
        // entity.setAlerField001(dto.getAlerField001());
        // entity.setAlerField002(dto.getAlerField002());
        // entity.setAlerField003(dto.getAlerField003());
        // entity.setAlerField004(dto.getAlerField004());
        return entity;
    }
}
