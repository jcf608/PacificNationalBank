package com.pnb.collections;

import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsMapper036 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CollectionsMapper036 {

    public CollectionsDto036 toDto(CollectionsV036 entity) {
        if (entity == null) return null;
        CollectionsDto036 dto = new CollectionsDto036();
        // dto.setCollField000(entity.getCollField000());
        // dto.setCollField001(entity.getCollField001());
        // dto.setCollField002(entity.getCollField002());
        // dto.setCollField003(entity.getCollField003());
        // dto.setCollField004(entity.getCollField004());
        return dto;
    }

    public CollectionsV036 toEntity(CollectionsDto036 dto) {
        if (dto == null) return null;
        CollectionsV036 entity = new CollectionsV036();
        // entity.setCollField000(dto.getCollField000());
        // entity.setCollField001(dto.getCollField001());
        // entity.setCollField002(dto.getCollField002());
        // entity.setCollField003(dto.getCollField003());
        // entity.setCollField004(dto.getCollField004());
        return entity;
    }
}
