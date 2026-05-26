package com.pnb.wire;

import javax.enterprise.context.ApplicationScoped;

/**
 * WireMapper026 — Maps between entity and DTO.
 */
@ApplicationScoped
public class WireMapper026 {

    public WireDto026 toDto(WireV026 entity) {
        if (entity == null) return null;
        WireDto026 dto = new WireDto026();
        // dto.setWireField000(entity.getWireField000());
        // dto.setWireField001(entity.getWireField001());
        // dto.setWireField002(entity.getWireField002());
        // dto.setWireField003(entity.getWireField003());
        // dto.setWireField004(entity.getWireField004());
        return dto;
    }

    public WireV026 toEntity(WireDto026 dto) {
        if (dto == null) return null;
        WireV026 entity = new WireV026();
        // entity.setWireField000(dto.getWireField000());
        // entity.setWireField001(dto.getWireField001());
        // entity.setWireField002(dto.getWireField002());
        // entity.setWireField003(dto.getWireField003());
        // entity.setWireField004(dto.getWireField004());
        return entity;
    }
}
