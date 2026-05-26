package com.pnb.product;

import javax.enterprise.context.ApplicationScoped;

/**
 * ProductMapper025 — Maps between entity and DTO.
 */
@ApplicationScoped
public class ProductMapper025 {

    public ProductDto025 toDto(ProductV025 entity) {
        if (entity == null) return null;
        ProductDto025 dto = new ProductDto025();
        // dto.setProdField000(entity.getProdField000());
        // dto.setProdField001(entity.getProdField001());
        // dto.setProdField002(entity.getProdField002());
        // dto.setProdField003(entity.getProdField003());
        // dto.setProdField004(entity.getProdField004());
        return dto;
    }

    public ProductV025 toEntity(ProductDto025 dto) {
        if (dto == null) return null;
        ProductV025 entity = new ProductV025();
        // entity.setProdField000(dto.getProdField000());
        // entity.setProdField001(dto.getProdField001());
        // entity.setProdField002(dto.getProdField002());
        // entity.setProdField003(dto.getProdField003());
        // entity.setProdField004(dto.getProdField004());
        return entity;
    }
}
