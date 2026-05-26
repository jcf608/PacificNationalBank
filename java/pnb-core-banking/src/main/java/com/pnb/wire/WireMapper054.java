package com.pnb.wire;

import javax.enterprise.context.ApplicationScoped;

/**
 * WireMapper054 — Maps between entity and DTO.
 */
@ApplicationScoped
public class WireMapper054 {

    public WireDto054 toDto(WireV054 entity) {
        if (entity == null) return null;
        WireDto054 dto = new WireDto054();
        // dto.setWireField000(entity.getWireField000());
        // dto.setWireField001(entity.getWireField001());
        // dto.setWireField002(entity.getWireField002());
        // dto.setWireField003(entity.getWireField003());
        // dto.setWireField004(entity.getWireField004());
        return dto;
    }

    public WireV054 toEntity(WireDto054 dto) {
        if (dto == null) return null;
        WireV054 entity = new WireV054();
        // entity.setWireField000(dto.getWireField000());
        // entity.setWireField001(dto.getWireField001());
        // entity.setWireField002(dto.getWireField002());
        // entity.setWireField003(dto.getWireField003());
        // entity.setWireField004(dto.getWireField004());
        return entity;
    }
}
