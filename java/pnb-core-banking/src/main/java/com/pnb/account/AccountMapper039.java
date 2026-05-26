package com.pnb.account;

import javax.enterprise.context.ApplicationScoped;

/**
 * AccountMapper039 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AccountMapper039 {

    public AccountDto039 toDto(AccountV039 entity) {
        if (entity == null) return null;
        AccountDto039 dto = new AccountDto039();
        // dto.setAccoField000(entity.getAccoField000());
        // dto.setAccoField001(entity.getAccoField001());
        // dto.setAccoField002(entity.getAccoField002());
        // dto.setAccoField003(entity.getAccoField003());
        // dto.setAccoField004(entity.getAccoField004());
        return dto;
    }

    public AccountV039 toEntity(AccountDto039 dto) {
        if (dto == null) return null;
        AccountV039 entity = new AccountV039();
        // entity.setAccoField000(dto.getAccoField000());
        // entity.setAccoField001(dto.getAccoField001());
        // entity.setAccoField002(dto.getAccoField002());
        // entity.setAccoField003(dto.getAccoField003());
        // entity.setAccoField004(dto.getAccoField004());
        return entity;
    }
}
