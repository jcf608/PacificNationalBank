package com.pnb.ach;

import javax.enterprise.context.ApplicationScoped;

/**
 * AchMapper040 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AchMapper040 {

    public AchDto040 toDto(AchV040 entity) {
        if (entity == null) return null;
        AchDto040 dto = new AchDto040();
        // dto.setAchField000(entity.getAchField000());
        // dto.setAchField001(entity.getAchField001());
        // dto.setAchField002(entity.getAchField002());
        // dto.setAchField003(entity.getAchField003());
        // dto.setAchField004(entity.getAchField004());
        return dto;
    }

    public AchV040 toEntity(AchDto040 dto) {
        if (dto == null) return null;
        AchV040 entity = new AchV040();
        // entity.setAchField000(dto.getAchField000());
        // entity.setAchField001(dto.getAchField001());
        // entity.setAchField002(dto.getAchField002());
        // entity.setAchField003(dto.getAchField003());
        // entity.setAchField004(dto.getAchField004());
        return entity;
    }
}
