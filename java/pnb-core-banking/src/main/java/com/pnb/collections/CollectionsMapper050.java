package com.pnb.collections;

import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsMapper050 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CollectionsMapper050 {

    public CollectionsDto050 toDto(CollectionsV050 entity) {
        if (entity == null) return null;
        CollectionsDto050 dto = new CollectionsDto050();
        // dto.setCollField000(entity.getCollField000());
        // dto.setCollField001(entity.getCollField001());
        // dto.setCollField002(entity.getCollField002());
        // dto.setCollField003(entity.getCollField003());
        // dto.setCollField004(entity.getCollField004());
        return dto;
    }

    public CollectionsV050 toEntity(CollectionsDto050 dto) {
        if (dto == null) return null;
        CollectionsV050 entity = new CollectionsV050();
        // entity.setCollField000(dto.getCollField000());
        // entity.setCollField001(dto.getCollField001());
        // entity.setCollField002(dto.getCollField002());
        // entity.setCollField003(dto.getCollField003());
        // entity.setCollField004(dto.getCollField004());
        return entity;
    }
}
