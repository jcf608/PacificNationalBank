package com.pnb.collections;

import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsMapper024 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CollectionsMapper024 {

    public CollectionsDto024 toDto(CollectionsV024 entity) {
        if (entity == null) return null;
        CollectionsDto024 dto = new CollectionsDto024();
        // dto.setCollField000(entity.getCollField000());
        // dto.setCollField001(entity.getCollField001());
        // dto.setCollField002(entity.getCollField002());
        // dto.setCollField003(entity.getCollField003());
        // dto.setCollField004(entity.getCollField004());
        return dto;
    }

    public CollectionsV024 toEntity(CollectionsDto024 dto) {
        if (dto == null) return null;
        CollectionsV024 entity = new CollectionsV024();
        // entity.setCollField000(dto.getCollField000());
        // entity.setCollField001(dto.getCollField001());
        // entity.setCollField002(dto.getCollField002());
        // entity.setCollField003(dto.getCollField003());
        // entity.setCollField004(dto.getCollField004());
        return entity;
    }
}
