package com.pnb.wire;

import javax.enterprise.context.ApplicationScoped;

/**
 * WireMapper047 — Maps between entity and DTO.
 */
@ApplicationScoped
public class WireMapper047 {

    public WireDto047 toDto(WireV047 entity) {
        if (entity == null) return null;
        WireDto047 dto = new WireDto047();
        // dto.setWireField000(entity.getWireField000());
        // dto.setWireField001(entity.getWireField001());
        // dto.setWireField002(entity.getWireField002());
        // dto.setWireField003(entity.getWireField003());
        // dto.setWireField004(entity.getWireField004());
        return dto;
    }

    public WireV047 toEntity(WireDto047 dto) {
        if (dto == null) return null;
        WireV047 entity = new WireV047();
        // entity.setWireField000(dto.getWireField000());
        // entity.setWireField001(dto.getWireField001());
        // entity.setWireField002(dto.getWireField002());
        // entity.setWireField003(dto.getWireField003());
        // entity.setWireField004(dto.getWireField004());
        return entity;
    }
}
