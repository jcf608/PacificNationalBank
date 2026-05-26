package com.pnb.customer;

import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerMapper030 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CustomerMapper030 {

    public CustomerDto030 toDto(CustomerV030 entity) {
        if (entity == null) return null;
        CustomerDto030 dto = new CustomerDto030();
        // dto.setCustField000(entity.getCustField000());
        // dto.setCustField001(entity.getCustField001());
        // dto.setCustField002(entity.getCustField002());
        // dto.setCustField003(entity.getCustField003());
        // dto.setCustField004(entity.getCustField004());
        return dto;
    }

    public CustomerV030 toEntity(CustomerDto030 dto) {
        if (dto == null) return null;
        CustomerV030 entity = new CustomerV030();
        // entity.setCustField000(dto.getCustField000());
        // entity.setCustField001(dto.getCustField001());
        // entity.setCustField002(dto.getCustField002());
        // entity.setCustField003(dto.getCustField003());
        // entity.setCustField004(dto.getCustField004());
        return entity;
    }
}
