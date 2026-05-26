package com.pnb.alert;

import javax.enterprise.context.ApplicationScoped;

/**
 * AlertMapper034 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AlertMapper034 {

    public AlertDto034 toDto(AlertV034 entity) {
        if (entity == null) return null;
        AlertDto034 dto = new AlertDto034();
        // dto.setAlerField000(entity.getAlerField000());
        // dto.setAlerField001(entity.getAlerField001());
        // dto.setAlerField002(entity.getAlerField002());
        // dto.setAlerField003(entity.getAlerField003());
        // dto.setAlerField004(entity.getAlerField004());
        return dto;
    }

    public AlertV034 toEntity(AlertDto034 dto) {
        if (dto == null) return null;
        AlertV034 entity = new AlertV034();
        // entity.setAlerField000(dto.getAlerField000());
        // entity.setAlerField001(dto.getAlerField001());
        // entity.setAlerField002(dto.getAlerField002());
        // entity.setAlerField003(dto.getAlerField003());
        // entity.setAlerField004(dto.getAlerField004());
        return entity;
    }
}
