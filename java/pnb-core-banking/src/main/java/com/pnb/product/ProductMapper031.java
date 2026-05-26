package com.pnb.product;

import javax.enterprise.context.ApplicationScoped;

/**
 * ProductMapper031 — Maps between entity and DTO.
 */
@ApplicationScoped
public class ProductMapper031 {

    public ProductDto031 toDto(ProductV031 entity) {
        if (entity == null) return null;
        ProductDto031 dto = new ProductDto031();
        // dto.setProdField000(entity.getProdField000());
        // dto.setProdField001(entity.getProdField001());
        // dto.setProdField002(entity.getProdField002());
        // dto.setProdField003(entity.getProdField003());
        // dto.setProdField004(entity.getProdField004());
        return dto;
    }

    public ProductV031 toEntity(ProductDto031 dto) {
        if (dto == null) return null;
        ProductV031 entity = new ProductV031();
        // entity.setProdField000(dto.getProdField000());
        // entity.setProdField001(dto.getProdField001());
        // entity.setProdField002(dto.getProdField002());
        // entity.setProdField003(dto.getProdField003());
        // entity.setProdField004(dto.getProdField004());
        return entity;
    }
}
