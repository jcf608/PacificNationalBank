package com.pnb.product;

import javax.enterprise.context.ApplicationScoped;

/**
 * ProductMapper049 — Maps between entity and DTO.
 */
@ApplicationScoped
public class ProductMapper049 {

    public ProductDto049 toDto(ProductV049 entity) {
        if (entity == null) return null;
        ProductDto049 dto = new ProductDto049();
        // dto.setProdField000(entity.getProdField000());
        // dto.setProdField001(entity.getProdField001());
        // dto.setProdField002(entity.getProdField002());
        // dto.setProdField003(entity.getProdField003());
        // dto.setProdField004(entity.getProdField004());
        return dto;
    }

    public ProductV049 toEntity(ProductDto049 dto) {
        if (dto == null) return null;
        ProductV049 entity = new ProductV049();
        // entity.setProdField000(dto.getProdField000());
        // entity.setProdField001(dto.getProdField001());
        // entity.setProdField002(dto.getProdField002());
        // entity.setProdField003(dto.getProdField003());
        // entity.setProdField004(dto.getProdField004());
        return entity;
    }
}
