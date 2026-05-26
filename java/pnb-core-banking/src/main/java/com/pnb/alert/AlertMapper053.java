package com.pnb.alert;

import javax.enterprise.context.ApplicationScoped;

/**
 * AlertMapper053 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AlertMapper053 {

    public AlertDto053 toDto(AlertV053 entity) {
        if (entity == null) return null;
        AlertDto053 dto = new AlertDto053();
        // dto.setAlerField000(entity.getAlerField000());
        // dto.setAlerField001(entity.getAlerField001());
        // dto.setAlerField002(entity.getAlerField002());
        // dto.setAlerField003(entity.getAlerField003());
        // dto.setAlerField004(entity.getAlerField004());
        return dto;
    }

    public AlertV053 toEntity(AlertDto053 dto) {
        if (dto == null) return null;
        AlertV053 entity = new AlertV053();
        // entity.setAlerField000(dto.getAlerField000());
        // entity.setAlerField001(dto.getAlerField001());
        // entity.setAlerField002(dto.getAlerField002());
        // entity.setAlerField003(dto.getAlerField003());
        // entity.setAlerField004(dto.getAlerField004());
        return entity;
    }
}
