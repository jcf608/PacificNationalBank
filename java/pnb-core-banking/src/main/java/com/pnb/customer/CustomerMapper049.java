package com.pnb.customer;

import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerMapper049 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CustomerMapper049 {

    public CustomerDto049 toDto(CustomerV049 entity) {
        if (entity == null) return null;
        CustomerDto049 dto = new CustomerDto049();
        // dto.setCustField000(entity.getCustField000());
        // dto.setCustField001(entity.getCustField001());
        // dto.setCustField002(entity.getCustField002());
        // dto.setCustField003(entity.getCustField003());
        // dto.setCustField004(entity.getCustField004());
        return dto;
    }

    public CustomerV049 toEntity(CustomerDto049 dto) {
        if (dto == null) return null;
        CustomerV049 entity = new CustomerV049();
        // entity.setCustField000(dto.getCustField000());
        // entity.setCustField001(dto.getCustField001());
        // entity.setCustField002(dto.getCustField002());
        // entity.setCustField003(dto.getCustField003());
        // entity.setCustField004(dto.getCustField004());
        return entity;
    }
}
