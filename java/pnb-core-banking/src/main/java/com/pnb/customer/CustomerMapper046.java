package com.pnb.customer;

import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerMapper046 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CustomerMapper046 {

    public CustomerDto046 toDto(CustomerV046 entity) {
        if (entity == null) return null;
        CustomerDto046 dto = new CustomerDto046();
        // dto.setCustField000(entity.getCustField000());
        // dto.setCustField001(entity.getCustField001());
        // dto.setCustField002(entity.getCustField002());
        // dto.setCustField003(entity.getCustField003());
        // dto.setCustField004(entity.getCustField004());
        return dto;
    }

    public CustomerV046 toEntity(CustomerDto046 dto) {
        if (dto == null) return null;
        CustomerV046 entity = new CustomerV046();
        // entity.setCustField000(dto.getCustField000());
        // entity.setCustField001(dto.getCustField001());
        // entity.setCustField002(dto.getCustField002());
        // entity.setCustField003(dto.getCustField003());
        // entity.setCustField004(dto.getCustField004());
        return entity;
    }
}
