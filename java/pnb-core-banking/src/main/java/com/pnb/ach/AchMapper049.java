package com.pnb.ach;

import javax.enterprise.context.ApplicationScoped;

/**
 * AchMapper049 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AchMapper049 {

    public AchDto049 toDto(AchV049 entity) {
        if (entity == null) return null;
        AchDto049 dto = new AchDto049();
        // dto.setAchField000(entity.getAchField000());
        // dto.setAchField001(entity.getAchField001());
        // dto.setAchField002(entity.getAchField002());
        // dto.setAchField003(entity.getAchField003());
        // dto.setAchField004(entity.getAchField004());
        return dto;
    }

    public AchV049 toEntity(AchDto049 dto) {
        if (dto == null) return null;
        AchV049 entity = new AchV049();
        // entity.setAchField000(dto.getAchField000());
        // entity.setAchField001(dto.getAchField001());
        // entity.setAchField002(dto.getAchField002());
        // entity.setAchField003(dto.getAchField003());
        // entity.setAchField004(dto.getAchField004());
        return entity;
    }
}
