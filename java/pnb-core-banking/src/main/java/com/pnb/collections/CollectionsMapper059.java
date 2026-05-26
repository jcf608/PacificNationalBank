package com.pnb.collections;

import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsMapper059 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CollectionsMapper059 {

    public CollectionsDto059 toDto(CollectionsV059 entity) {
        if (entity == null) return null;
        CollectionsDto059 dto = new CollectionsDto059();
        // dto.setCollField000(entity.getCollField000());
        // dto.setCollField001(entity.getCollField001());
        // dto.setCollField002(entity.getCollField002());
        // dto.setCollField003(entity.getCollField003());
        // dto.setCollField004(entity.getCollField004());
        return dto;
    }

    public CollectionsV059 toEntity(CollectionsDto059 dto) {
        if (dto == null) return null;
        CollectionsV059 entity = new CollectionsV059();
        // entity.setCollField000(dto.getCollField000());
        // entity.setCollField001(dto.getCollField001());
        // entity.setCollField002(dto.getCollField002());
        // entity.setCollField003(dto.getCollField003());
        // entity.setCollField004(dto.getCollField004());
        return entity;
    }
}
