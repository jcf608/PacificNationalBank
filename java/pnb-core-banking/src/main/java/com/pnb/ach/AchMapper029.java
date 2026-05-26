package com.pnb.ach;

import javax.enterprise.context.ApplicationScoped;

/**
 * AchMapper029 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AchMapper029 {

    public AchDto029 toDto(AchV029 entity) {
        if (entity == null) return null;
        AchDto029 dto = new AchDto029();
        // dto.setAchField000(entity.getAchField000());
        // dto.setAchField001(entity.getAchField001());
        // dto.setAchField002(entity.getAchField002());
        // dto.setAchField003(entity.getAchField003());
        // dto.setAchField004(entity.getAchField004());
        return dto;
    }

    public AchV029 toEntity(AchDto029 dto) {
        if (dto == null) return null;
        AchV029 entity = new AchV029();
        // entity.setAchField000(dto.getAchField000());
        // entity.setAchField001(dto.getAchField001());
        // entity.setAchField002(dto.getAchField002());
        // entity.setAchField003(dto.getAchField003());
        // entity.setAchField004(dto.getAchField004());
        return entity;
    }
}
