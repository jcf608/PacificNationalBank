package com.pnb.alert;

import javax.enterprise.context.ApplicationScoped;

/**
 * AlertMapper051 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AlertMapper051 {

    public AlertDto051 toDto(AlertV051 entity) {
        if (entity == null) return null;
        AlertDto051 dto = new AlertDto051();
        // dto.setAlerField000(entity.getAlerField000());
        // dto.setAlerField001(entity.getAlerField001());
        // dto.setAlerField002(entity.getAlerField002());
        // dto.setAlerField003(entity.getAlerField003());
        // dto.setAlerField004(entity.getAlerField004());
        return dto;
    }

    public AlertV051 toEntity(AlertDto051 dto) {
        if (dto == null) return null;
        AlertV051 entity = new AlertV051();
        // entity.setAlerField000(dto.getAlerField000());
        // entity.setAlerField001(dto.getAlerField001());
        // entity.setAlerField002(dto.getAlerField002());
        // entity.setAlerField003(dto.getAlerField003());
        // entity.setAlerField004(dto.getAlerField004());
        return entity;
    }
}
