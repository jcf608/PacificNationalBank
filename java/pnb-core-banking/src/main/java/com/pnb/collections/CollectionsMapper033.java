package com.pnb.collections;

import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsMapper033 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CollectionsMapper033 {

    public CollectionsDto033 toDto(CollectionsV033 entity) {
        if (entity == null) return null;
        CollectionsDto033 dto = new CollectionsDto033();
        // dto.setCollField000(entity.getCollField000());
        // dto.setCollField001(entity.getCollField001());
        // dto.setCollField002(entity.getCollField002());
        // dto.setCollField003(entity.getCollField003());
        // dto.setCollField004(entity.getCollField004());
        return dto;
    }

    public CollectionsV033 toEntity(CollectionsDto033 dto) {
        if (dto == null) return null;
        CollectionsV033 entity = new CollectionsV033();
        // entity.setCollField000(dto.getCollField000());
        // entity.setCollField001(dto.getCollField001());
        // entity.setCollField002(dto.getCollField002());
        // entity.setCollField003(dto.getCollField003());
        // entity.setCollField004(dto.getCollField004());
        return entity;
    }
}
