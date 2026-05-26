package com.pnb.customer;

import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerMapper054 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CustomerMapper054 {

    public CustomerDto054 toDto(CustomerV054 entity) {
        if (entity == null) return null;
        CustomerDto054 dto = new CustomerDto054();
        // dto.setCustField000(entity.getCustField000());
        // dto.setCustField001(entity.getCustField001());
        // dto.setCustField002(entity.getCustField002());
        // dto.setCustField003(entity.getCustField003());
        // dto.setCustField004(entity.getCustField004());
        return dto;
    }

    public CustomerV054 toEntity(CustomerDto054 dto) {
        if (dto == null) return null;
        CustomerV054 entity = new CustomerV054();
        // entity.setCustField000(dto.getCustField000());
        // entity.setCustField001(dto.getCustField001());
        // entity.setCustField002(dto.getCustField002());
        // entity.setCustField003(dto.getCustField003());
        // entity.setCustField004(dto.getCustField004());
        return entity;
    }
}
