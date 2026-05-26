package com.pnb.alert;

import javax.enterprise.context.ApplicationScoped;

/**
 * AlertMapper039 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AlertMapper039 {

    public AlertDto039 toDto(AlertV039 entity) {
        if (entity == null) return null;
        AlertDto039 dto = new AlertDto039();
        // dto.setAlerField000(entity.getAlerField000());
        // dto.setAlerField001(entity.getAlerField001());
        // dto.setAlerField002(entity.getAlerField002());
        // dto.setAlerField003(entity.getAlerField003());
        // dto.setAlerField004(entity.getAlerField004());
        return dto;
    }

    public AlertV039 toEntity(AlertDto039 dto) {
        if (dto == null) return null;
        AlertV039 entity = new AlertV039();
        // entity.setAlerField000(dto.getAlerField000());
        // entity.setAlerField001(dto.getAlerField001());
        // entity.setAlerField002(dto.getAlerField002());
        // entity.setAlerField003(dto.getAlerField003());
        // entity.setAlerField004(dto.getAlerField004());
        return entity;
    }
}
