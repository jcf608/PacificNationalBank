package com.pnb.wire;

import javax.enterprise.context.ApplicationScoped;

/**
 * WireMapper053 — Maps between entity and DTO.
 */
@ApplicationScoped
public class WireMapper053 {

    public WireDto053 toDto(WireV053 entity) {
        if (entity == null) return null;
        WireDto053 dto = new WireDto053();
        // dto.setWireField000(entity.getWireField000());
        // dto.setWireField001(entity.getWireField001());
        // dto.setWireField002(entity.getWireField002());
        // dto.setWireField003(entity.getWireField003());
        // dto.setWireField004(entity.getWireField004());
        return dto;
    }

    public WireV053 toEntity(WireDto053 dto) {
        if (dto == null) return null;
        WireV053 entity = new WireV053();
        // entity.setWireField000(dto.getWireField000());
        // entity.setWireField001(dto.getWireField001());
        // entity.setWireField002(dto.getWireField002());
        // entity.setWireField003(dto.getWireField003());
        // entity.setWireField004(dto.getWireField004());
        return entity;
    }
}
