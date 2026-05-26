package com.pnb.wire;

import javax.enterprise.context.ApplicationScoped;

/**
 * WireMapper044 — Maps between entity and DTO.
 */
@ApplicationScoped
public class WireMapper044 {

    public WireDto044 toDto(WireV044 entity) {
        if (entity == null) return null;
        WireDto044 dto = new WireDto044();
        // dto.setWireField000(entity.getWireField000());
        // dto.setWireField001(entity.getWireField001());
        // dto.setWireField002(entity.getWireField002());
        // dto.setWireField003(entity.getWireField003());
        // dto.setWireField004(entity.getWireField004());
        return dto;
    }

    public WireV044 toEntity(WireDto044 dto) {
        if (dto == null) return null;
        WireV044 entity = new WireV044();
        // entity.setWireField000(dto.getWireField000());
        // entity.setWireField001(dto.getWireField001());
        // entity.setWireField002(dto.getWireField002());
        // entity.setWireField003(dto.getWireField003());
        // entity.setWireField004(dto.getWireField004());
        return entity;
    }
}
