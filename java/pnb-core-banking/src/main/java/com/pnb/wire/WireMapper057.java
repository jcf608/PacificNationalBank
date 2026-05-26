package com.pnb.wire;

import javax.enterprise.context.ApplicationScoped;

/**
 * WireMapper057 — Maps between entity and DTO.
 */
@ApplicationScoped
public class WireMapper057 {

    public WireDto057 toDto(WireV057 entity) {
        if (entity == null) return null;
        WireDto057 dto = new WireDto057();
        // dto.setWireField000(entity.getWireField000());
        // dto.setWireField001(entity.getWireField001());
        // dto.setWireField002(entity.getWireField002());
        // dto.setWireField003(entity.getWireField003());
        // dto.setWireField004(entity.getWireField004());
        return dto;
    }

    public WireV057 toEntity(WireDto057 dto) {
        if (dto == null) return null;
        WireV057 entity = new WireV057();
        // entity.setWireField000(dto.getWireField000());
        // entity.setWireField001(dto.getWireField001());
        // entity.setWireField002(dto.getWireField002());
        // entity.setWireField003(dto.getWireField003());
        // entity.setWireField004(dto.getWireField004());
        return entity;
    }
}
