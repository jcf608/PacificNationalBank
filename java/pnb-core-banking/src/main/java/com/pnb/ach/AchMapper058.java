package com.pnb.ach;

import javax.enterprise.context.ApplicationScoped;

/**
 * AchMapper058 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AchMapper058 {

    public AchDto058 toDto(AchV058 entity) {
        if (entity == null) return null;
        AchDto058 dto = new AchDto058();
        // dto.setAchField000(entity.getAchField000());
        // dto.setAchField001(entity.getAchField001());
        // dto.setAchField002(entity.getAchField002());
        // dto.setAchField003(entity.getAchField003());
        // dto.setAchField004(entity.getAchField004());
        return dto;
    }

    public AchV058 toEntity(AchDto058 dto) {
        if (dto == null) return null;
        AchV058 entity = new AchV058();
        // entity.setAchField000(dto.getAchField000());
        // entity.setAchField001(dto.getAchField001());
        // entity.setAchField002(dto.getAchField002());
        // entity.setAchField003(dto.getAchField003());
        // entity.setAchField004(dto.getAchField004());
        return entity;
    }
}
