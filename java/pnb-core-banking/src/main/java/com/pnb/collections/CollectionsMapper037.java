package com.pnb.collections;

import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsMapper037 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CollectionsMapper037 {

    public CollectionsDto037 toDto(CollectionsV037 entity) {
        if (entity == null) return null;
        CollectionsDto037 dto = new CollectionsDto037();
        // dto.setCollField000(entity.getCollField000());
        // dto.setCollField001(entity.getCollField001());
        // dto.setCollField002(entity.getCollField002());
        // dto.setCollField003(entity.getCollField003());
        // dto.setCollField004(entity.getCollField004());
        return dto;
    }

    public CollectionsV037 toEntity(CollectionsDto037 dto) {
        if (dto == null) return null;
        CollectionsV037 entity = new CollectionsV037();
        // entity.setCollField000(dto.getCollField000());
        // entity.setCollField001(dto.getCollField001());
        // entity.setCollField002(dto.getCollField002());
        // entity.setCollField003(dto.getCollField003());
        // entity.setCollField004(dto.getCollField004());
        return entity;
    }
}
