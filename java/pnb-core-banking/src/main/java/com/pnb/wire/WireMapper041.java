package com.pnb.wire;

import javax.enterprise.context.ApplicationScoped;

/**
 * WireMapper041 — Maps between entity and DTO.
 */
@ApplicationScoped
public class WireMapper041 {

    public WireDto041 toDto(WireV041 entity) {
        if (entity == null) return null;
        WireDto041 dto = new WireDto041();
        // dto.setWireField000(entity.getWireField000());
        // dto.setWireField001(entity.getWireField001());
        // dto.setWireField002(entity.getWireField002());
        // dto.setWireField003(entity.getWireField003());
        // dto.setWireField004(entity.getWireField004());
        return dto;
    }

    public WireV041 toEntity(WireDto041 dto) {
        if (dto == null) return null;
        WireV041 entity = new WireV041();
        // entity.setWireField000(dto.getWireField000());
        // entity.setWireField001(dto.getWireField001());
        // entity.setWireField002(dto.getWireField002());
        // entity.setWireField003(dto.getWireField003());
        // entity.setWireField004(dto.getWireField004());
        return entity;
    }
}
