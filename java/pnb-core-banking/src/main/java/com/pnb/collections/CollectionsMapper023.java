package com.pnb.collections;

import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsMapper023 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CollectionsMapper023 {

    public CollectionsDto023 toDto(CollectionsV023 entity) {
        if (entity == null) return null;
        CollectionsDto023 dto = new CollectionsDto023();
        // dto.setCollField000(entity.getCollField000());
        // dto.setCollField001(entity.getCollField001());
        // dto.setCollField002(entity.getCollField002());
        // dto.setCollField003(entity.getCollField003());
        // dto.setCollField004(entity.getCollField004());
        return dto;
    }

    public CollectionsV023 toEntity(CollectionsDto023 dto) {
        if (dto == null) return null;
        CollectionsV023 entity = new CollectionsV023();
        // entity.setCollField000(dto.getCollField000());
        // entity.setCollField001(dto.getCollField001());
        // entity.setCollField002(dto.getCollField002());
        // entity.setCollField003(dto.getCollField003());
        // entity.setCollField004(dto.getCollField004());
        return entity;
    }
}
