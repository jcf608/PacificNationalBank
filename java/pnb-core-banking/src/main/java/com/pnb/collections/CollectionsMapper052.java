package com.pnb.collections;

import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsMapper052 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CollectionsMapper052 {

    public CollectionsDto052 toDto(CollectionsV052 entity) {
        if (entity == null) return null;
        CollectionsDto052 dto = new CollectionsDto052();
        // dto.setCollField000(entity.getCollField000());
        // dto.setCollField001(entity.getCollField001());
        // dto.setCollField002(entity.getCollField002());
        // dto.setCollField003(entity.getCollField003());
        // dto.setCollField004(entity.getCollField004());
        return dto;
    }

    public CollectionsV052 toEntity(CollectionsDto052 dto) {
        if (dto == null) return null;
        CollectionsV052 entity = new CollectionsV052();
        // entity.setCollField000(dto.getCollField000());
        // entity.setCollField001(dto.getCollField001());
        // entity.setCollField002(dto.getCollField002());
        // entity.setCollField003(dto.getCollField003());
        // entity.setCollField004(dto.getCollField004());
        return entity;
    }
}
