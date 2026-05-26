package com.pnb.collections;

import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsMapper049 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CollectionsMapper049 {

    public CollectionsDto049 toDto(CollectionsV049 entity) {
        if (entity == null) return null;
        CollectionsDto049 dto = new CollectionsDto049();
        // dto.setCollField000(entity.getCollField000());
        // dto.setCollField001(entity.getCollField001());
        // dto.setCollField002(entity.getCollField002());
        // dto.setCollField003(entity.getCollField003());
        // dto.setCollField004(entity.getCollField004());
        return dto;
    }

    public CollectionsV049 toEntity(CollectionsDto049 dto) {
        if (dto == null) return null;
        CollectionsV049 entity = new CollectionsV049();
        // entity.setCollField000(dto.getCollField000());
        // entity.setCollField001(dto.getCollField001());
        // entity.setCollField002(dto.getCollField002());
        // entity.setCollField003(dto.getCollField003());
        // entity.setCollField004(dto.getCollField004());
        return entity;
    }
}
