package com.pnb.wire;

import javax.enterprise.context.ApplicationScoped;

/**
 * WireMapper024 — Maps between entity and DTO.
 */
@ApplicationScoped
public class WireMapper024 {

    public WireDto024 toDto(WireV024 entity) {
        if (entity == null) return null;
        WireDto024 dto = new WireDto024();
        // dto.setWireField000(entity.getWireField000());
        // dto.setWireField001(entity.getWireField001());
        // dto.setWireField002(entity.getWireField002());
        // dto.setWireField003(entity.getWireField003());
        // dto.setWireField004(entity.getWireField004());
        return dto;
    }

    public WireV024 toEntity(WireDto024 dto) {
        if (dto == null) return null;
        WireV024 entity = new WireV024();
        // entity.setWireField000(dto.getWireField000());
        // entity.setWireField001(dto.getWireField001());
        // entity.setWireField002(dto.getWireField002());
        // entity.setWireField003(dto.getWireField003());
        // entity.setWireField004(dto.getWireField004());
        return entity;
    }
}
