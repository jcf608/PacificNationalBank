package com.pnb.collections;

import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsMapper035 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CollectionsMapper035 {

    public CollectionsDto035 toDto(CollectionsV035 entity) {
        if (entity == null) return null;
        CollectionsDto035 dto = new CollectionsDto035();
        // dto.setCollField000(entity.getCollField000());
        // dto.setCollField001(entity.getCollField001());
        // dto.setCollField002(entity.getCollField002());
        // dto.setCollField003(entity.getCollField003());
        // dto.setCollField004(entity.getCollField004());
        return dto;
    }

    public CollectionsV035 toEntity(CollectionsDto035 dto) {
        if (dto == null) return null;
        CollectionsV035 entity = new CollectionsV035();
        // entity.setCollField000(dto.getCollField000());
        // entity.setCollField001(dto.getCollField001());
        // entity.setCollField002(dto.getCollField002());
        // entity.setCollField003(dto.getCollField003());
        // entity.setCollField004(dto.getCollField004());
        return entity;
    }
}
