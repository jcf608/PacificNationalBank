package com.pnb.customer;

import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerMapper057 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CustomerMapper057 {

    public CustomerDto057 toDto(CustomerV057 entity) {
        if (entity == null) return null;
        CustomerDto057 dto = new CustomerDto057();
        // dto.setCustField000(entity.getCustField000());
        // dto.setCustField001(entity.getCustField001());
        // dto.setCustField002(entity.getCustField002());
        // dto.setCustField003(entity.getCustField003());
        // dto.setCustField004(entity.getCustField004());
        return dto;
    }

    public CustomerV057 toEntity(CustomerDto057 dto) {
        if (dto == null) return null;
        CustomerV057 entity = new CustomerV057();
        // entity.setCustField000(dto.getCustField000());
        // entity.setCustField001(dto.getCustField001());
        // entity.setCustField002(dto.getCustField002());
        // entity.setCustField003(dto.getCustField003());
        // entity.setCustField004(dto.getCustField004());
        return entity;
    }
}
